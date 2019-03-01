package openqapackage;

import Map.HotelMap;
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
import org.junit.*;


public class BaseTest {

    public static WebDriver driver = DriverPath.getDriver();
    public WebDriverWait wait = new WebDriverWait(driver, 10);
    public static GetUrl url = new GetUrl();
    public static HotelMap hotelMap = PageFactory.initElements(driver, HotelMap.class);
    public static Hotel hotel = new Hotel();
    

    public void bodySection() {

        //js.executeScript(driver.findElement(By.id("body-section")));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("body-section"))));
    }

  /*  public void executeScript(){
        JavascriptException js = (JavascriptException)WebDriverWait;
        js.executeScript();
    } */

}
