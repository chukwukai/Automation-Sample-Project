package Map;

import openqapackage.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class navigationMap extends BaseTest{

    @FindBy(linkText = "OFFERS")
    private WebElement offersLink;

    @FindBy(linkText = "HOTELS")
    private WebElement hotelLink;

    //@FindBy(xpath = "//*[@class=\"icon_set_1_icon-70\" ]")
    //@FindBy(css = ".icon_set_1_icon-70.go-right")
    @FindBy(linkText = "MY ACCOUNT")
    private WebElement AcctDropdown;

    @FindBy(linkText = "Sign Up")
    private WebElement signUpLink;

    @FindBy(linkText = "Login")
    private WebElement login;

    @FindBy(linkText = "Logout")
    private WebElement logoutLink;

    @FindBy(partialLinkText = "ACCOUNTS")
    private WebElement accountLink;

    @FindBy(linkText = "CUSTOMERS")
    private WebElement customerLink;


    public WebElement getOffersLink() { return offersLink;}

    public WebElement getHotelLink() { return hotelLink;}

    public WebElement getAcctDropdown(){ return AcctDropdown;}

    public WebElement getSignUpLink() { return signUpLink;}

    public WebElement getLogin() { return login; }

    public WebElement getLogoutLink(){ return logoutLink;}

    public WebElement getAccountLink(){ return accountLink;}

    public WebElement getCustomerLink(){ return customerLink;}

}
