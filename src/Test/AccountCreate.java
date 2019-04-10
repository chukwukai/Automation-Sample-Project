package Test;

import Map.AcctCreation;
import org.junit.Assert;
import openqapackage.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class AccountCreate extends BaseTest {

    public void AccountCreate(String fname, String lname, String phoneNum, String email, String pwd ) throws Exception{
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("hero"))));
        wait.until(ExpectedConditions.elementToBeClickable(acct.getFirstName())).sendKeys(fname);
        wait.until(ExpectedConditions.elementToBeClickable(acct.getLastName())).sendKeys(lname);
        wait.until(ExpectedConditions.elementToBeClickable(acct.getPhoneNumber())).sendKeys(phoneNum);
        wait.until(ExpectedConditions.elementToBeClickable(acct.getEmailAddress())).sendKeys(email);
        wait.until(ExpectedConditions.elementToBeClickable(acct.getPassword())).sendKeys(pwd);
        wait.until(ExpectedConditions.elementToBeClickable(acct.getComfirmPwd())).sendKeys(pwd);
        wait.until(ExpectedConditions.elementToBeClickable(acct.getSignUpBtn())).click();
        Thread.sleep(2000);
        bodySection();
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("bookings"))));
        String getProfileText = driver.findElement(By.cssSelector("h3.RTL")).getText();
        assertTrue(getProfileText.contains(fname));

    }

    public void Login(String user, String pwd, String fname) throws Exception{
        bodySection();
        wait.until(ExpectedConditions.elementToBeClickable(acct.getUserName())).sendKeys(user);
        wait.until(ExpectedConditions.elementToBeClickable(acct.getPassword())).sendKeys(pwd);
        wait.until(ExpectedConditions.elementToBeClickable(acct.getLoginBtn())).click();
        Thread.sleep(2000);
        bodySection();
        String getProfileText = driver.findElement(By.cssSelector("h3.RTL")).getText();
        assertTrue(getProfileText.contains(fname));

    }

    public void addressProfile(String address1, String address2, String city, String state, String zip){
        wait.until(ExpectedConditions.elementToBeClickable(acct.getProfileLink())).click();
        wait.until(ExpectedConditions.elementToBeClickable(acct.getAddressLine1())).sendKeys(address1);
        wait.until(ExpectedConditions.elementToBeClickable(acct.getAddressLine2())).sendKeys(address2);
        wait.until(ExpectedConditions.elementToBeClickable(acct.getCity())).sendKeys(city);
        wait.until(ExpectedConditions.elementToBeClickable(acct.getState())).sendKeys(state);
        wait.until(ExpectedConditions.elementToBeClickable(acct.getZipCode())).sendKeys(zip);
        wait.until(ExpectedConditions.visibilityOf(acct.getCountry()));
        wait.until(ExpectedConditions.elementToBeClickable(acct.getCountry()));

        acct.getCountry().click();
        WebElement dropdownElment = acct.getCountry();

        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.className("value"))));
        //wait.until(ExpectedConditions.elementToBeClickable(acct.getCountry())).click();
        List <WebElement> dropdownCountry = driver.findElements(By.className("value"));
            for (WebElement textCountry: dropdownCountry) {
                if(textCountry.getText().contains("US")){
                    textCountry.click();
                }
        }
        wait.until(ExpectedConditions.elementToBeClickable(acct.getSubmitBtn())).click();
    }
}
