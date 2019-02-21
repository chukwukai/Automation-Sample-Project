package Test;

import Map.HotelMap;
import openqapackage.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.util.List;

public class Hotel extends BaseTest {

    public void getHotel() {
        wait.until(ExpectedConditions.elementToBeClickable(hotelMap.getHotelName())).sendKeys("Hyatt Regency Perth");
    }

    public void getCheckInDate() {
        wait.until(ExpectedConditions.elementToBeClickable(hotelMap.getCheckInPicker())).click();
        wait.until(ExpectedConditions.elementToBeClickable(hotelMap.getActiveDate())).click();
    }

    public void getCheckOutDate() {
        wait.until(ExpectedConditions.elementToBeClickable(hotelMap.getCheckOutPicker())).click();
        wait.until(ExpectedConditions.elementToBeClickable(hotelMap.getActiveDate())).click();
    }

    public void selectSearchBtn() {
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
