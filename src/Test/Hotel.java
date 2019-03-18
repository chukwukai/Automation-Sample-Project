package Test;

import Map.HotelMap;
import openqapackage.BaseTest;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;
import java.util.List;

public class Hotel extends BaseTest {

    JavascriptExecutor js = (JavascriptExecutor) driver;

    //String slug = ((JavascriptExecutor) driver).executeScript("var elem = document.getElementsByClassName('embeddable-widget-selected-campus-slug')[0];return elem.innerText;").toString();

    public void getHotel(String cityName)   {
        bodySection();
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("hotels"))));
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("hotels"))));
        wait.until(ExpectedConditions.visibilityOf(hotelMap.getHotelName())).click();
        wait.until(ExpectedConditions.elementToBeClickable(hotelMap.getHotelName())).sendKeys(cityName);
        //js.executeScript("arguments[0].click();", hotelMap.getHotelResult());

        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id=\"select2-drop\"]/ul"))));
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id=\"select2-drop\"]/ul"))));
        wait.until(ExpectedConditions.visibilityOf(hotelMap.getHotelResult()));
        wait.until(ExpectedConditions.elementToBeClickable(hotelMap.getHotelResult())).click();
        /*wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.className("select2-result"))));
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.className("select2-result"))));
        wait.until(ExpectedConditions.elementToBeClickable(hotelMap.getHotelResult())).click(); */
        }

    public void getCheckInDate() {
        //wait.until(ExpectedConditions.invisibilityOf((hotelMap.getHotelResult())));
        wait.until(ExpectedConditions.elementToBeClickable(hotelMap.getCheckInPicker())).click();
        wait.until(ExpectedConditions.elementToBeClickable(hotelMap.getActiveDate())).click();
    }

    public void getCheckOutDate() {
        wait.until(ExpectedConditions.elementToBeClickable(hotelMap.getCheckOutPicker())).click();
        //wait.until(ExpectedConditions.visibilityOf(hotelMap.getActiveDate()));
       // wait.until(ExpectedConditions.elementToBeClickable(hotelMap.getActiveDate())).click();
    }

    public void selectSearchBtn() {
        wait.until(ExpectedConditions.invisibilityOf((hotelMap.getActiveDate())));
        wait.until(ExpectedConditions.elementToBeClickable(hotelMap.getSearchBtn())).click();
    }

    public void getDetailInfos() {

        try {
        List<WebElement> hotelResult = driver.findElements(By.cssSelector(".wow.fadeIn.p-10-0.animated"));
            bodySection();
            for (WebElement searchHotel : hotelResult) {
                if (searchHotel.getText().contains("Hyatt Regency Perth")) ;
                {
                    wait.until(ExpectedConditions.elementToBeClickable(hotelMap.getDetailInfos())).click();
                }
            }
        }
        catch (StaleElementReferenceException ex){
            List<WebElement> hotelResult = driver.findElements(By.cssSelector(".wow.fadeIn.p-10-0.animated"));
            bodySection();
            for (WebElement searchHotel : hotelResult) {
                if (searchHotel.getText().contains("Hyatt Regency Perth")) ;
                {
                    wait.until(ExpectedConditions.elementToBeClickable(hotelMap.getDetailInfos())).click();
                }
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