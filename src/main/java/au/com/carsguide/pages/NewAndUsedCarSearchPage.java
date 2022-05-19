package au.com.carsguide.pages;

import au.com.carsguide.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class NewAndUsedCarSearchPage extends Utility {
    private static final Logger log = LogManager.getLogger(NewAndUsedCarSearchPage.class.getName());

    public NewAndUsedCarSearchPage() {
        PageFactory.initElements(driver,this);
    }

    @CacheLookup
    @FindBy(id = "makes")
    WebElement carMakes;

    @CacheLookup
    @FindBy(id = "models")
    WebElement models;

    @CacheLookup
    @FindBy (id = "locations")
    WebElement getLocations;

    @CacheLookup
    @FindBy(id = "priceTo")
    WebElement getMaxPrice;

    @CacheLookup
    @FindBy (id = "search-submit")
    WebElement getSearchButton;

    @CacheLookup
    @FindBy(xpath = "//h1[@class='listing-search-title']")
    WebElement titlePage;


    public void selectCarMakeFromDropDown(String make){
        selectByVisibleTextFromDropDown(carMakes,make);
        log.info("select car make from dropDown : "+carMakes.toString());
    }
    public void selectModelFromDropDown(String model){
        selectByVisibleTextFromDropDown(models,model);
        log.info("Select car model : "+ models.toString());
    }
    public void selectLocationFromDropDown(String location){
        selectByVisibleTextFromDropDown(getLocations,location);
        log.info("Select location : "+location.toString());
    }
    public void selectMaxPriceFromDropDown(String price){
        selectByVisibleTextFromDropDown(getMaxPrice,price);
        log.info("Select price : "+ getMaxPrice.toString());
    }
    public void clickOnFindMyNextCarButton(){
        clickOnElement(getSearchButton);
        log.info("Click on find my car button : "+ getSearchButton.toString());
    }
    public void verifyTitle(String message){
        String actual=getTextFromElement(titlePage);
        String expected=message;
        Assert.assertTrue(actual.contains(expected));
        log.info("Verify page navigate to new and used acr search page : "+titlePage.getText());
    }
}
