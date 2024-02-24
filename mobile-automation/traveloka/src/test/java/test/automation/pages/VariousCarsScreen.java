package test.automation.pages;

import io.appium.java_client.MobileBy;
import net.thucydides.core.annotations.Step;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import test.automation.pageobject.BasePageObject;

public class VariousCarsScreen extends BasePageObject {

    By productCar1st() {
        return MobileBy.xpath("//android.widget.ImageView[@content-desc=\\\"productCar-0\\\"]");
    }

    By providerCar1st() {
        return MobileBy.xpath("//android.widget.ImageView[@content-desc=\\\"providerCar-0\\\"]");
    }

    By buttonContinuePD() {
        return MobileBy.xpath("//android.widget.Button[@content-desc=\\\"continue\\\"]");
    }

    By buttonPickUpLocation(){
        return MobileBy.xpath("//android.widget.Button[@content-desc=\\\"buttonPickUpLocation\\\"]");
    
    }
    By buttonDropOffLocation(){
        return MobileBy.xpath("//android.widget.Button[@content-desc=\\\"buttonDropOffLocation\\\"]");
    }

    By pickUpLocationRO(){
        return MobileBy.xpath("//android.widget.ImageView[contains(text(), 'Rental Office')");
    }

    By selectPickUpLocationROButton(){
        return MobileBy.xpath("//android.widget.Button[@content-desc=\\\"buttonSelectPickUp\\\"]");
    }

    By selectDropOffLocationButton(){
        return MobileBy.xpath("//android.widget.Button[@content-desc=\\\"buttonSelectDropOff\\\"]");
    }

    By dropOffLocationOL(){
        return MobileBy.xpath("//android.widget.ImageView[@content-desc=\\\"selectOL\\\"]");
    }

    By dropOffLocationAirport(){
        return MobileBy.xpath("//android.widget.Button[@content-desc=\\\"airportCGK\\\"]");
    }

    By bookNowButton(){
        return MobileBy.xpath("//android.widget.Button[@content-desc=\\\"buttonBookNow\\\"]");
    }

    By contactDetailsButton(){
        return MobileBy.xpath("//android.widget.Button[@content-desc=\\\"buttonContactDetails\\\"]");
    }

    By fieldContactDetails(){
        return MobileBy.xpath("//android.widget.EditText[1]");
    }

    By contactDetailsSaveButton(){
        return MobileBy.xpath("//android.widget.Button[@content-desc=\\\"buttonSaveContact\\\"]");
    
    }
    By driverDetailsButton(){
        return MobileBy.xpath("//android.widget.Button[@content-desc=\\\"buttonDriverDetails\\\"]");
    }

    By fieldDriverDetails(){
        return MobileBy.xpath("//android.widget.EditText[1]");
    }

    By driverDetailsSaveButton(){
        return MobileBy.xpath("//android.widget.Button[@content-desc=\\\"buttonSaveDriver\\\"]");
    }

    By continueButton(){
        return MobileBy.xpath("//android.widget.Button[@content-desc=\\\"buttonContinue\\\"]");
    }

    By checkAllRentReq(){
        return MobileBy.xpath("//android.widget.ImageView[@content-desc=\\\"checkBox0\\\"]");
    }

    By selectPayment(){
        return MobileBy.xpath("//android.widget.ImageView[@content-desc=\\\"payment0\\\"]");
    }

    By successfullAlert(){
        return MobileBy.xpath("//android.widget.ImageView[@content-desc=\\\"success\\\"]");
    }

    public void onTheVarCarsScreen() {
        isDisplayed(productCar1st());
    }

    public void selectCar() {
        click(productCar1st());
    }

    public void selectProviderCar() {
        click(providerCar1st());
    }

    public void clickContinuePD() {
        click(buttonContinuePD());
    }

    public void clickPickUpLocationButton() {
        click(buttonPickUpLocation());
    }

    public void selectPickUpLocation() {
        click(pickUpLocationRO());
    }

    public void clickSelectPickUpROButton() {
        click(selectPickUpLocationROButton());
    }

    public void clickDropOffLocationButton() {
        click(buttonDropOffLocation());
    }

    public void selectDropOffLocation() {
        click(dropOffLocationOL());
    }

    public void clickSelectDropOffOLButton() {
        click(dropOffLocationAirport());
    }

    public void clickBookNow() {
        click(bookNowButton());
    }

    public void inputFieldContact(String contact){
        click(fieldContactDetails());
        sendKeys(fieldContactDetails(),contact);
    }

    public void inputFieldDriver(String driver){
        click(fieldDriverDetails());
        sendKeys(fieldDriverDetails(),driver);
    }

    public void clickContinue() {
        click(continueButton());
    }

    public void clickCheckAllRentReq() {
        click(checkAllRentReq());
    }

    public void clickSelectPayment() {
        click(selectPayment());
    }

    public void displayedSuccessfullAlert() {
        isDisplayed(successfullAlert());
    }

}
