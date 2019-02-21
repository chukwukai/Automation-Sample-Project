package openqapackage;

import Map.HotelMap;
import Test.Hotel;
import Test.GetUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import driver.DriverPath;
import org.junit.*;


public class BaseTest {

    public static WebDriver driver = DriverPath.getDriver();
    public WebDriverWait wait = new WebDriverWait(driver, 10);
    public static HotelMap hotelMap = new HotelMap();
    public static Hotel hotel = new Hotel();
    public static GetUrl url = new GetUrl();

    public void bodySection(){
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("body-section"))));
    }
}
