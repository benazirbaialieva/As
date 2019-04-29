package step_definitions;

import cucumber.api.java.en.*;
import cucumber.api.java.es.E;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.HomePage;
import utils.BrowserUtils;
import utils.ConfigurationReader;
import utils.Driver;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class SearchStepDefs {
    public static WebDriver driver = Driver.getDriver();
    HomePage homePage = new HomePage();
    Actions actions = new Actions(driver);

    static{
        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        driver.manage().window().fullscreen();

    }



    @Given("^gets to home page$")
    public void gets_to_home_page() {
        driver.get(ConfigurationReader.getProperty("baseURL"));
        try{

        if(homePage.popUpClose.isDisplayed())
            homePage.popUpClose.click();

        }catch (Exception d){d.printStackTrace();}

    }



    @When("^user clicks on search filed$")
    public void user_clicks_on_search_filed(){
        BrowserUtils.sleep(3);
        actions.moveToElement(homePage.searchFieldInput).click().perform();

    }

    @Then("^suggestions dropdown should display (\\d+) top destinations$")
    public void suggestions_dropdown_should_display_top_destinations(int numberOfDestinations) {
        BrowserUtils.sleep(3);
        Assert.assertEquals(homePage.suggestionsDropDown.size(),numberOfDestinations);

    }

    @When("^user searches \"([^\"]*)\" in search field$")
    public void user_searches_in_search_field(String searchWord) {
        BrowserUtils.sleep(2);
        Actions actions = new Actions(driver);
        actions.moveToElement(homePage.searchFieldInput).click().perform();
        BrowserUtils.sleep(2);
        actions.moveToElement(homePage.searchFieldInput).sendKeys(searchWord).perform();

    }

    @Then("^suggestions dropdown items should contain \"([^\"]*)\"$")
    public void suggestions_dropdown_items_should_contain(String searchWord) {

        List<String> suggestionsList = BrowserUtils.getElementsText(homePage.suggestionsDropDown2);
        for(int i=0; i < suggestionsList.size(); i++)
            Assert.assertTrue(suggestionsList.get(i).toLowerCase().contains(searchWord.toLowerCase()));
    }


    @Then("^user selects option (\\d+) from the list$")
    public void user_selects_option_from_the_list(int optionNumber) {
        homePage.suggestionsDropDown2.get(optionNumber).click();
    }

    @Then("^clicks on reward programs$")
    public void clicks_on_reward_programs() {
        homePage.rewardProgramField.click();
    }

    @Then("^user sees list of \"([^\"]*)\" programs$")
    public void user_sees_list_of_programs(String program) throws InterruptedException {
        List<String> suggestionsList = BrowserUtils.getElementsText(homePage.rewardProgramDropDown);
        //System.out.println(suggestionsList.size());
        for(int i=0; i < suggestionsList.size(); i++) {
            //System.out.println(suggestionsList.get(i).toLowerCase().contains("united"));
            Assert.assertTrue(suggestionsList.get(i).toLowerCase().contains("United MileagePlus".toLowerCase()));

            // Thread.sleep(6000);
            //Assert.assertTrue(suggestionsList.get(i).toLowerCase().contains("United".toLowerCase()));


        }
    }

    @Then("^user verifies the list is sorted$")
    public void user_verifies_the_list_is_sorted() {

    }

    @Then("^list of \"([^\"]*)\" programs contains \"([^\"]*)\"$")
    public void list_of_programs_contains(String program, String searchWord) {

    }


}
