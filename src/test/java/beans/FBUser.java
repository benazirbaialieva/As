package beans;

import com.restfb.Facebook;

public class FBUser {
    @Facebook("first_name")
    private String firstName;

    @Facebook("last_name")
    private String lastName;

    @Facebook("name")
    private String fullName;

    @Facebook("email")
    private String email;

    @Facebook("bio")
    private String bio;

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }



    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
