package Test;

import Map.HotelMap;
import openqapackage.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;
import java.util.List;

public class Hotel extends BaseTest {

    JavascriptExecutor js = (JavascriptExecutor) driver;

    //String slug = ((JavascriptExecutor) driver).executeScript("var elem = document.getElementsByClassName('embeddable-widget-selected-campus-slug')[0];return elem.innerText;").toString();

    public void getHotel(String cityName)  {
       //js.executeScript("hotelMap.getHotelName()");
       //js.executeScript(".value(\"Hyatt Regency Perth)\"))");
        bodySection();
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("hotels"))));
        wait.until(ExpectedConditions.visibilityOf(hotelMap.getHotelName()));
        wait.until(ExpectedConditions.visibilityOf(hotelMap.getHotelName())).sendKeys(cityName, Keys.ENTER);
        //wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.className("select2-result"))));
        List <WebElement> hotelResult = driver.findElements(By.className("select2-result"));
        for (WebElement readHotel: hotelResult) {
            if(hotelResult.contains(cityName)){
                wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.className("select2-match")))).click();
            }
        }
        //wait.withTimeout(Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOf((hotelMap.getHotelResult())));
        //wait.until(ExpectedConditions.elementToBeClickable((hotelMap.getHotelResult())));
        //hotelMap.getHotelResult().click();
    }

    public void getCheckInDate() {
        //wait.until(ExpectedConditions.invisibilityOf((hotelMap.getHotelResult())));
        wait.until(ExpectedConditions.elementToBeClickable(hotelMap.getCheckInPicker())).click();
        wait.until(ExpectedConditions.elementToBeClickable(hotelMap.getActiveDate())).click();
    }

    public void getCheckOutDate() {
        wait.until(ExpectedConditions.invisibilityOf((hotelMap.getActiveDate())));
        wait.until(ExpectedConditions.elementToBeClickable(hotelMap.getCheckOutPicker())).click();
        wait.until(ExpectedConditions.visibilityOf(hotelMap.getActiveDate()));
        wait.until(ExpectedConditions.elementToBeClickable(hotelMap.getActiveDate())).click();
    }

    public void selectSearchBtn() {
        wait.until(ExpectedConditions.invisibilityOf((hotelMap.getActiveDate())));
        wait.until(ExpectedConditions.visibilityOf(hotelMap.getActiveDate()));
        wait.until(ExpectedConditions.elementToBeClickable(hotelMap.getSearchBtn())).click();
    }

    public void getDetailInfos() {

        List<WebElement> hotelResult = driver.findElements(By.cssSelector("listingbg"));
        for (WebElement searchHotel : hotelResult) {
            if (hotelResult.contains("Hyatt Regency Perth")) ;
            {
                wait.until(ExpectedConditions.elementToBeClickable(hotelMap.getDetailInfos())).click();
            }
        }
    }

    public void getCheckBox(){
        wait.until(ExpectedConditions.elementToBeClickable(hotelMap.getCheck())).click();
    }

    public void getBookNow(){
    wait.until(ExpectedConditions.elementToBeClickable((hotelMap.getBookNow()))).click();
    }
}
