package test.automation.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import test.automation.pages.CarScreen;
import test.automation.pages.VariousCarsScreen;

public class SelectCarsSteps {
    
    @Steps
    CarScreen carScreen;
    @Steps
    VariousCarsScreen varCarsScreen;

    @Given("I am on the various cars screen")
    public void onTheVarCarsScreen() {
        varCarsScreen.onTheVarCarsScreen();
    }

    @When("I select car product")
    public void selectCar() {
        varCarsScreen.selectCar();
    }

    @And("I select car provider")
    public void selectProviderCar() {
        varCarsScreen.selectProviderCar();
    }

    @And("I click continue button in product detail")
    public void clickContinuePD() {
        varCarsScreen.clickContinuePD();
    }
    
    @And("I click pick up location button")
    public void clickPickUpLocationButton() {
        varCarsScreen.clickPickUpLocationButton();
    }

    @And("I select pick up location")
    public void selectPickUpLocation() {
        varCarsScreen.selectPickUpLocation();
    }

    @And("I click select pick up RO button")
    public void clickSelectPickUpROButton() {
        varCarsScreen.clickSelectPickUpROButton();
    }

    @And("I click drop off location button")
    public void clickDropOffLocationButton() {
        varCarsScreen.clickDropOffLocationButton();
    }

    @And("I select drop off location")
    public void selectDropOffLocation() {
        varCarsScreen.selectDropOffLocation();
    }

    @And("I click select drop off OL button")
    public void clickSelectDropOffOLButton() {
        varCarsScreen.clickSelectDropOffOLButton();
    }

    @And("I click book now")
    public void clickBookNow() {
        varCarsScreen.clickBookNow();
    }

    @And("I input contact name")
    public void inputFieldContact() {
        String contact = "Andira MS";
        varCarsScreen.inputFieldContact(contact);
    }

    @And("I input driver name")
    public void inputFieldDriver() {
        String driver = "Jamaludin";
        varCarsScreen.inputFieldContact(driver);
    }

    @And("I click continue")
    public void clickContinue() {
        varCarsScreen.clickContinue();
    }

    @And("I click check all")
    public void clickCheckAllRentReq() {
        varCarsScreen.clickCheckAllRentReq();
    
    }
    @And("I select payment")
    public void clickSelectPayment() {
        varCarsScreen.clickSelectPayment();
    }

    @And("I will see successfull payment")
    public void displayedSuccessfullAlert() {
        varCarsScreen.displayedSuccessfullAlert();
    }

}
