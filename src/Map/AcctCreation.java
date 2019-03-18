package Map;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AcctCreation {

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

    @FindBy(name = "username")
    private WebElement userName;

    @FindBy(css = ".btn.btn-action.btn-lg.btn-block.loginbtn")
    private WebElement loginBtn;

    public WebElement getFirstName() {return firstName; }

    public WebElement getLastName(){ return lastName;}

    public WebElement getPhoneNumber() { return phoneNumber; }

    public WebElement getEmailAddress() { return emailAddress; }

    public WebElement getPassword() {return password; }

    public WebElement getComfirmPwd() { return comfirmPwd;}

    public WebElement getSignUpBtn(){ return signUpBtn;}

    public WebElement getUserName() { return userName; }

    public WebElement getLoginBtn() { return loginBtn; }
}
