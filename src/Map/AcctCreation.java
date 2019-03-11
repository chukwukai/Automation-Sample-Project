package Map;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AcctCreation {

    @FindBy(linkText = "MY ACCOUNT")
    private WebElement AcctDropdown;

    @FindBy(linkText = "Sign Up")
    private WebElement signUpLink;

    @FindBy(name = "firstname")
    private WebElement firstName;

    @FindBy(name = "lastname")
    private WebElement lastName;

    @FindBy(name = "phone")
    private WebElement phoneNumber;

    @FindBy(name = "email")
    private  WebElement emailAddress;

    @FindBy(name = "password")
    private WebElement password;

    @FindBy(name = "confirmpassword")
    private WebElement comfirmPwd;

    @FindBy(css = ".signupbtn.btn_full.btn.btn-action.btn-block.btn-lg")
    private WebElement signUpBtn;

    public WebElement getAcctDropdown(){ return AcctDropdown;}

    public WebElement getSignUpLink() { return signUpLink;}

    public WebElement getFirstName() {return firstName; }

    public WebElement getLastName(){ return lastName;}

    public WebElement getPhoneNumber() { return phoneNumber; }

    public WebElement getEmailAddress() { return emailAddress; }

    public WebElement getPassword() {return password; }

    public WebElement getComfirmPwd() { return comfirmPwd;}

    public WebElement getSignUpBtn(){ return signUpBtn;}
}
