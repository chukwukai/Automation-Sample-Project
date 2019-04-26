package openqapackage;

import Map.AcctCreation;
import Map.HotelMap;
import Test.AccountCreate;
import Test.Hotel;
import Test.GetUrl;
import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import driver.DriverPath;
import Map.navigationMap;
import Test.NavigateLink;

import static org.junit.Assert.assertTrue;


public class BaseTest {

    public static WebDriver driver = DriverPath.getDriver();
    public WebDriverWait wait = new WebDriverWait(driver, 10);
    public static String Travel_Url = System.getenv("Travels_Url");
    public static GetUrl url = new GetUrl();
    public static HotelMap hotelMap = PageFactory.initElements(driver, HotelMap.class);
    public static Hotel hotel = new Hotel();
    public static navigationMap navigateMap = PageFactory.initElements(driver, navigationMap.class);
    public static NavigateLink navigateLink = new NavigateLink();
    public static AcctCreation acct = PageFactory.initElements(driver, AcctCreation.class);
    public static AccountCreate ac = new AccountCreate();

    public void bodySection() {

        //js.executeScript(driver.findElement(By.id("body-section")));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("body-section"))));
    }

    public void successMessage() {
        WebElement successText = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".alert.alert-success")));
        assertTrue(successText.getText().contains("Profile Updated Successfully."));
    }


}

