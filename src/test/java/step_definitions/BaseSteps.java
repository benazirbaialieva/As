package step_definitions;

import com.restfb.*;
import com.restfb.types.*;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import utils.Constants;
import java.util.List;

public class BaseSteps {

    private static FacebookClient facebookClient = new DefaultFacebookClient
            (Constants.MY_ACCESS_TOKEN, Version.VERSION_3_2);
    private static User user;
    private static List<User> users;
    static String objectType;



    @Given("^facebook user is logged in$")
    public void facebook_user_is_logged_in() {
       user = facebookClient.fetchObject(Constants.MY_USER_ID, User.class,
               Parameter.with("fields", "email,first_name,last_name,gender,birthday,ids_for_pages"));

    }

    @Then("^user searches for \"([^\"]*)\"$")
    public void user_searches_for(String fbObjectType) {
        objectType = fbObjectType;
        Connection<User> albumConnection = facebookClient.fetchConnection(
                "me/"+fbObjectType, User.class);
        users = albumConnection.getData();
    }

    @Then("^user verifies the data$")
    public void user_verifies_the_data() {
        for (User user : users) {
            System.out.println(objectType+": " + user.getHometown());
        }


    }





















}
