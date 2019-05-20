package Test.Main;

import Map.AcctCreation;
import org.junit.Assert;
import openqapackage.BaseTest;
import org.openqa.selenium.*;

import java.util.List;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class AccountCreate extends BaseTest {

    JavascriptExecutor js = (JavascriptExecutor) driver;

    public void AccountCreate(String fname, String lname, String phoneNum, String email, String pwd ) throws Exception{
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("hero"))));
        wait.until(ExpectedConditions.elementToBeClickable(acct.getFirstName())).sendKeys(fname);
        wait.until(ExpectedConditions.elementToBeClickable(acct.getLastName())).sendKeys(lname);
        wait.until(ExpectedConditions.elementToBeClickable(acct.getPhoneNumber())).sendKeys(phoneNum);
        wait.until(ExpectedConditions.elementToBeClickable(acct.getEmailAddress())).sendKeys(email);
        wait.until(ExpectedConditions.elementToBeClickable(acct.getPassword())).sendKeys(pwd);
        wait.until(ExpectedConditions.elementToBeClickable(acct.getComfirmPwd())).sendKeys(pwd);
        //wait.until(ExpectedConditions.elementToBeClickable(acct.getSignUpBtn())).click();

        js.executeScript("arguments[0].click();", acct.getSignUpBtn());

    }

    public void Login(String user, String pwd){
        bodySection();
        wait.until(ExpectedConditions.elementToBeClickable(acct.getUserName())).sendKeys(user);
        wait.until(ExpectedConditions.elementToBeClickable(acct.getPassword())).sendKeys(pwd);
        wait.until(ExpectedConditions.elementToBeClickable(acct.getLoginBtn())).click();

    }

    public void addressProfile(String address1, String address2, String city, String state, String zip, String country){
        wait.until(ExpectedConditions.elementToBeClickable(acct.getProfileLink())).click();
        wait.until(ExpectedConditions.elementToBeClickable(acct.getAddressLine1())).sendKeys(Keys.HOME, Keys.chord(Keys.SHIFT, Keys.END), address1);
        wait.until(ExpectedConditions.elementToBeClickable(acct.getAddressLine2())).sendKeys(Keys.HOME, Keys.chord(Keys.SHIFT, Keys.END), address2);
        wait.until(ExpectedConditions.elementToBeClickable(acct.getCity())).sendKeys(Keys.HOME, Keys.chord(Keys.SHIFT, Keys.END), city);
        wait.until(ExpectedConditions.elementToBeClickable(acct.getState())).sendKeys(Keys.HOME, Keys.chord(Keys.SHIFT, Keys.END), state);
        wait.until(ExpectedConditions.elementToBeClickable(acct.getZipCode())).sendKeys(Keys.HOME, Keys.chord(Keys.SHIFT, Keys.END), zip);
        wait.until(ExpectedConditions.visibilityOf(acct.getCountry()));
        wait.until(ExpectedConditions.elementToBeClickable(acct.getCountry()));

        WebElement dropdownElement = acct.getCountry();

        List <WebElement> dropdownCountry = dropdownElement.findElements(By.xpath("//select/option[@value]"));
            for (WebElement textCountry: dropdownCountry) {
                if(textCountry.getText().equalsIgnoreCase(country)){
                    textCountry.click();
                }
        }
        js.executeScript("arguments[0].click();", acct.getSubmitBtn());
    }

    public void ProfileValidation(String fname) throws Exception{
        Thread.sleep(4000);
        bodySection();
        String getProfileText = driver.findElement(By.cssSelector("h3.RTL")).getText();
        assertTrue(getProfileText.contains(fname));
    }
}
