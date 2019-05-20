package Test.Main;

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
            case "Login":
                bodySection();
                wait.until(ExpectedConditions.visibilityOf(navigateMap.getAcctDropdown()));
                wait.until(ExpectedConditions.elementToBeClickable(navigateMap.getAcctDropdown())).click();
                wait.until(ExpectedConditions.visibilityOf(navigateMap.getLogin()));
                wait.until(ExpectedConditions.elementToBeClickable(navigateMap.getLogin())).click();
                break;
            case "Sign up":
                bodySection();
                wait.until(ExpectedConditions.visibilityOf(navigateMap.getAcctDropdown()));
                wait.until(ExpectedConditions.elementToBeClickable(navigateMap.getAcctDropdown())).click();
                wait.until(ExpectedConditions.visibilityOf(navigateMap.getSignUpLink()));
                wait.until(ExpectedConditions.elementToBeClickable(navigateMap.getSignUpLink())).click();
                break;

            case "Logout":
                bodySection();
                wait.until(ExpectedConditions.visibilityOf(navigateMap.getAcctDropdown()));
                wait.until(ExpectedConditions.elementToBeClickable(navigateMap.getAcctDropdown())).click();
                wait.until(ExpectedConditions.visibilityOf(navigateMap.getLogoutLink()));
                wait.until(ExpectedConditions.elementToBeClickable(navigateMap.getLogoutLink())).click();
                break;

            case "Customers":
                wait.until(ExpectedConditions.visibilityOf(navigateMap.getAccountLink()));
                wait.until(ExpectedConditions.elementToBeClickable(navigateMap.getAccountLink())).click();
                wait.until(ExpectedConditions.visibilityOf(navigateMap.getCustomerLink()));
                wait.until(ExpectedConditions.elementToBeClickable(navigateMap.getCustomerLink())).click();

        }

    }
}
