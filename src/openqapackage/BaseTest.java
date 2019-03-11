package openqapackage;

import Map.AcctCreation;
import Map.HotelMap;
import Test.AccountCreate;
import Test.Hotel;
import Test.GetUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptException;
import driver.DriverPath;
import Map.navigationMap;
import Test.NavigateLink;

import org.junit.*;


public class BaseTest {

    public static WebDriver driver = DriverPath.getDriver();
    public WebDriverWait wait = new WebDriverWait(driver, 10);
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


}
