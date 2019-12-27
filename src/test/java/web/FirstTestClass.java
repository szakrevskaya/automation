//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedCondition;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.Assert;
//import org.testng.annotations.Test;
//
//public class FirstTestClass {
//
//    @Test
//    public void loginTest() throws InterruptedException {
//        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
//
//        driver.get("https://mail.ru/");
//
//        WebElement loginfFld = driver.findElement(By.id("mailbox:login"));
//        WebElement enterPassBtn = driver.findElement(By.xpath("//label[@id = 'mailbox:submit']/input"));
//        WebElement passFld = driver.findElement(By.id("mailbox:password"));
//
//        loginfFld.sendKeys("selina.88@mail.ru");
//        enterPassBtn.click();
//
//        Thread.sleep(1000);
//        passFld.sendKeys("riddick");
//        enterPassBtn.click();
//
//        WebElement writeLetterBtn = (new WebDriverWait(driver, 60))
//                .until(ExpectedConditions.presenceOfElementLocated(By.className("compose-button__txt")));
//
//        Assert.assertTrue(writeLetterBtn.isDisplayed());
//        driver.quit();
//    }
//}
//
//
