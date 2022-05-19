package au.com.carsguide.steps;

import au.com.carsguide.pages.HomePage;
import au.com.carsguide.pages.NewAndUsedCarSearchPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyStepdefs {
    @Given("^I am on home page$")
    public void iAmOnHomePage() {

    }

    @When("^I mouse hover on buySell tab$")
    public void iMouseHoverOnBuySellTab() throws InterruptedException {
        new HomePage().clickOnBuyPLUSSellLink();
    }
    @And("^I click on search cars tab$")
    public void iClickOnSearchCarsTab() {
        new HomePage().clickOnSearchCars();
    }

    @And("^I select make \"([^\"]*)\"$")
    public void iSelectMake(String make){
        new NewAndUsedCarSearchPage().selectCarMakeFromDropDown(make);

    }

    @And("^I select model \"([^\"]*)\"$")
    public void iSelectModel(String model){
        new NewAndUsedCarSearchPage().selectModelFromDropDown(model);

    }
    @And("^I select location \"([^\"]*)\"$")
    public void iSelectLocation(String location) {
        new NewAndUsedCarSearchPage().selectLocationFromDropDown(location);

    }
    @And("^I select price  \"([^\"]*)\"$")
    public void iSelectPrice(String price){
        new NewAndUsedCarSearchPage().selectMaxPriceFromDropDown(price);

    }



    @And("^I click on find my next car tab$")
    public void iClickOnFindMyNextCarTab() {
        new NewAndUsedCarSearchPage().clickOnFindMyNextCarButton();

    }


    @Then("^I should see the make \"([^\"]*)\" in results$")
    public void iShouldSeeTheMakeInResults(String make) {
        new NewAndUsedCarSearchPage().verifyTitle(make);

    }

    @When("^I click ‘Used’ link$")
    public void iClickUsedLink()  {
        new HomePage().clickOnUsed();
    }

    @Then("^I navigate to ‘Used Cars For Sale’ page$")
    public void iNavigateToUsedCarsForSalePage() {
    }




}
