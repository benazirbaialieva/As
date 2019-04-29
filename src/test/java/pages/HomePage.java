package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

import java.util.List;

public class HomePage {
    private WebDriver driver;

    public HomePage() {
        this.driver= Driver.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(css="button[class=close]")
    public WebElement popUpClose;

    @FindBy(xpath="//span[@class='twitter-typeahead']/input")
    public WebElement searchFieldInput;

    @FindBy(xpath="//span[@class='tt-dropdown-menu']/div[@class='tt-dataset-suggestedPlaces']//div")
    public List<WebElement> suggestionsDropDown;

    @FindBy(xpath="//span[@class='tt-dropdown-menu']/div[@class='tt-dataset-regionPredictions']//div")
    public List<WebElement> suggestionsDropDown2;

    @FindBy(css="input[placeholder='Select reward program']")
    public WebElement rewardProgramField;


    @FindBy(xpath="//div[@class='col-sm-6 program search-field ng-scope']//ul[@class='dropdown-menu']//li")
    public List<WebElement> rewardProgramDropDown;
}
