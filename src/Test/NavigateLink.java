package Test;

import openqapackage.BaseTest;
import Map.navigationMap;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class NavigateLink extends BaseTest{


    public void navigatePage(String page){
        switch (page){
            case "Hotels":
                bodySection();
                wait.until(ExpectedConditions.visibilityOf(navigateMap.getOffersLink()));
                wait.until(ExpectedConditions.elementToBeClickable(navigateMap.getOffersLink())).click();
                wait.until(ExpectedConditions.visibilityOf(navigateMap.getHotelLink()));
                wait.until(ExpectedConditions.elementToBeClickable(navigateMap.getHotelLink())).click();
                break;
        }

    }
}
