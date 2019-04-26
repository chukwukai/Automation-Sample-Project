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

    @FindBy(className = "profile-icon")
    private WebElement profileLink;

    @FindBy(name = "address1")
    private WebElement addressLine1;

    @FindBy(name = "address2")
    private WebElement addressLine2;

    @FindBy(name = "city")
    private WebElement city;

    @FindBy(name = "state")
    private WebElement state;

    @FindBy(name = "zip")
    private WebElement zipCode;

    @FindBy(name = "country")
    private WebElement country;

    //@FindBy(xpath = "//button[class = 'updateprofile']")
    @FindBy(css = ".btn.btn-action.btn-block.updateprofile")
    private WebElement submitBtn;


    public WebElement getFirstName() {return firstName; }

    public WebElement getLastName(){ return lastName;}

    public WebElement getPhoneNumber() { return phoneNumber; }

    public WebElement getEmailAddress() { return emailAddress; }

    public WebElement getPassword() {return password; }

    public WebElement getComfirmPwd() { return comfirmPwd;}

    public WebElement getSignUpBtn(){ return signUpBtn;}

    public WebElement getUserName() { return userName; }

    public WebElement getLoginBtn() { return loginBtn; }

    public WebElement getProfileLink(){return profileLink;}

    public WebElement getAddressLine1() {return addressLine1;}

    public WebElement getAddressLine2(){return  addressLine2;}

    public WebElement getCity() {return city;}

    public WebElement getState(){return state;}

    public WebElement getZipCode(){return zipCode;}

    public WebElement getCountry(){return country;}

    public WebElement getSubmitBtn(){return submitBtn;}



}
