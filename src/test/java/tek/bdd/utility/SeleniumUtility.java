package tek.bdd.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import tek.bdd.base.BaseSetUp;

import java.time.Duration;

public class SeleniumUtility extends BaseSetUp {
    private WebDriverWait getWait() {
        return new WebDriverWait(getDriver(), Duration.ofSeconds(20));
    }
    public void clickOnElement(By locator) {
        getWait().until(ExpectedConditions.elementToBeClickable(locator))
                .click();
    }
    Public void sentText(By locator, String value) {
        getWait().until(ExpectedConditions.elementToBeClickable(locator))
                .sendKeys(value);
    }
}