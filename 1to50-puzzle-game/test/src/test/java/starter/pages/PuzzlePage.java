package starter.pages;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;

public class PuzzlePage extends PageObject {

    @Step
    public void openPage() {
        open();
    }

    @Step
    public void clickKotak() {
        for (int i = 1; i <= 50; i++) {
            getDriver().findElement(By.xpath("//div[.='" + i + "']")).click();
        }
    }
}
