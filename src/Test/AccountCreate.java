package Test;

import Map.AcctCreation;;
import openqapackage.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AccountCreate extends BaseTest {

    public void signUp(){
        bodySection();
        wait.until(ExpectedConditions.visibilityOf(acct.getAcctDropdown()));
        wait.until(ExpectedConditions.elementToBeClickable(acct.getAcctDropdown())).click();
        wait.until(ExpectedConditions.visibilityOf(acct.getSignUpLink()));
        wait.until(ExpectedConditions.elementToBeClickable(acct.getSignUpLink())).click();
    }

    public void AccountCreate(String fname, String lname, String phoneNum, String email, String pwd ){
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("hero"))));
        wait.until(ExpectedConditions.elementToBeClickable(acct.getFirstName())).sendKeys(fname);
        wait.until(ExpectedConditions.elementToBeClickable(acct.getLastName())).sendKeys(lname);
        wait.until(ExpectedConditions.elementToBeClickable(acct.getPhoneNumber())).sendKeys(phoneNum);
        wait.until(ExpectedConditions.elementToBeClickable(acct.getEmailAddress())).sendKeys(email);
        wait.until(ExpectedConditions.elementToBeClickable(acct.getPassword())).sendKeys(pwd);
        wait.until(ExpectedConditions.elementToBeClickable(acct.getComfirmPwd())).sendKeys(pwd);
        wait.until(ExpectedConditions.elementToBeClickable(acct.getSignUpBtn())).click();

    }

}
