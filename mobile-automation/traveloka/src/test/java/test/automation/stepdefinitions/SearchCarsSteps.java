package test.automation.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import test.automation.pages.CarScreen;
import test.automation.pages.VariousCarsScreen;

public class SearchCarsSteps {
    
    @Steps
    CarScreen carScreen;
    @Steps
    VariousCarsScreen varCarsScreen;

    @Given("I am on the cars screen")
    public void onTheCarsScreen() {
        carScreen.onTheCarsScreen();
    }

    @When("I click tab without driver button")
    public void clickTabWithoutDriver() {
        carScreen.clickTabWithoutDriver();
    }

    @And("I select location")
    public void selectLocationByClick() {
        carScreen.selectLocationByClick();
    }

    @And("I select pick up date and time")
    public void selectPickUpDateTime() {
        carScreen.selectPickUpDate();
        carScreen.selectPickUpHour9();
    }

    @And("I select drop off date and time")
    public void selectDropOffDateTime() {
        carScreen.selectDropOffDate();
        carScreen.selectDropOffHour11();
    }

    @And("I click search car button")
    public void clickSearchCarButton() {
        carScreen.clickSearchCarButton();
    }

    @Then("I will redirected to various car screen")
    public void onTheVarCarsScreen(){
        varCarsScreen.onTheVarCarsScreen();
    }

}
