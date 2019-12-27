package by.stormnet.core;

import by.stormnet.core.utils.BrowserConstants;
import by.stormnet.core.utils.IOUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class FrameworkCore {
    private static WebDriver webDriver;
    public static String browser = IOUtils.loadGenericProperty("browser", "configuration");
    public static String baseUrl = IOUtils.loadGenericProperty("baseUrl", "configuration");

    public static WebDriver getInstance() {
        if (browser.equals(BrowserConstants.CHROME)) {
            webDriver = new ChromeDriver();
        } else {
            if (browser.equals(BrowserConstants.FIREFOX)) {
                webDriver = new FirefoxDriver();
            } else {
                throw new IllegalArgumentException("Browser value from property file is incorrect!");
            }

        }
        return webDriver;
    }
}
