package web.pageobjects.pages;

import by.stormnet.core.FrameworkCore;
import by.stormnet.core.utils.PauseLength;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class AbstractPage extends FrameworkCore {
    private static WebDriver driver = getInstance();

    public WebDriver getDriver() {
        return driver;
    }

    public void openUrl(String url) {
        driver.manage().window().maximize();
        driver.get(url);
    }

    public static void waitForElementVisible(final By by) {
        try {
            WebDriverWait waiter = new WebDriverWait(driver, PauseLength.MAX.value());
            waiter.until(ExpectedConditions.presenceOfElementLocated(by));
        } catch (Throwable e) {
        }
    }

    public static void waitForElementClickable(final By by) {
        try {
            WebDriverWait waiter = new WebDriverWait(driver, PauseLength.MAX.value());
            waiter.until(ExpectedConditions.elementToBeClickable(by));
        } catch (Throwable e) {
        }
    }

    public boolean isElementVisible(By by) {
        try {
            driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
            List<WebElement> list = driver.findElements(by);
            driver.manage().timeouts().implicitlyWait(PauseLength.AVG.value(), TimeUnit.SECONDS);
            if (list.size() == 0) {
                return false;
            } else {
                try {
                    return list.get(0).isDisplayed();
                } catch (StaleElementReferenceException e) {
                    return false;
                }
            }
        } finally {
            driver.manage().timeouts().implicitlyWait(PauseLength.AJAX.value(), TimeUnit.SECONDS);
        }
    }

    public static By getElementBy(String element){
        return By.xpath(element);
    }

    public WebElement getElement(String element){
        return driver.findElement(By.xpath(element));
    }

    public List<WebElement> getElements(String element){
        return driver.findElements(By.xpath(element));
    }
}
