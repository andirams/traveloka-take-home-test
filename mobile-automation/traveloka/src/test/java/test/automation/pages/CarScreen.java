package test.automation.pages;

import io.appium.java_client.MobileBy;
import net.thucydides.core.annotations.Step;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import test.automation.pageobject.BasePageObject;

public class CarScreen extends BasePageObject {
    By tabWithoutDriver() {
        return MobileBy.xpath("//android.widget.Button[@content-desc=\\\"tabWithoutDriver\\\"]");
    }

    By pickUpLocation() {
        return MobileBy.xpath("//android.widget.ImageView[contains(text(), 'Jakarta')]");
    }

    By pickUpDate() {
        return MobileBy.xpath("//android.widget.ImageView[@content-desc=\\\"pickUpDate\\\"]");
    }

    By dropOffDate() {
        return MobileBy.xpath("//android.widget.ImageView[@content-desc=\\\"dropOffDate\\\"]");
    }

    By pickUpTime() {
        return MobileBy.xpath("//android.widget.ImageView[@content-desc=\\\"pickUpTime\\\"]");
    }

    By pickUpHour9() {
        return MobileBy.xpath("//android.widget.ImageView[contains(text(), '9')");
    }

    By dropOffTime() {
        return MobileBy.xpath("//android.widget.ImageView[@content-desc=\\\"dropOffTime\\\"]");
    }

    By dropOffHour11() {
        return MobileBy.xpath("//android.widget.ImageView[contains(text(), '11')");
    }

    By buttonSearchCar() {
        return MobileBy.xpath("//android.widget.Button[@content-desc=\\\"buttonSearchCar\\\"]");
    }

    public void onTheCarsScreen() {
        isDisplayed(tabWithoutDriver());
    }

    public void clickTabWithoutDriver() {
        click(tabWithoutDriver());
    }

    public void selectLocationByClick() {
        click(pickUpLocation());
    }

    public void selectPickUpDate() {
        List<WebElement> pick = (List<WebElement>) pickUpDate();

        pick.get(0).sendKeys("25");
        pick.get(1).sendKeys("Feb");
        pick.get(2).sendKeys("2024");
    }

    public void selectDropOffDate() {
        List<WebElement> pick = (List<WebElement>) dropOffDate();

        pick.get(0).sendKeys("28");
        pick.get(1).sendKeys("Feb");
        pick.get(2).sendKeys("2024");
    }

    public void clickPickUpTime() {
        click(pickUpTime());
    }

    public void clickDropOffTime() {
        click(dropOffTime());
    }

    public void selectPickUpHour9() {
        click(pickUpHour9());
    }

    public void selectDropOffHour11() {
        click(dropOffHour11());
    }

    public void clickSearchCarButton() {
        click(buttonSearchCar());
    }

}
