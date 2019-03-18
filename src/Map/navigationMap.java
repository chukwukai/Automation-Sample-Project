package Map;

import openqapackage.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class navigationMap extends BaseTest{

    @FindBy(linkText = "OFFERS")
    private WebElement offersLink;

    @FindBy(linkText = "HOTELS")
    private WebElement hotelLink;

    @FindBy(linkText = "MY ACCOUNT")
    private WebElement AcctDropdown;

    @FindBy(linkText = "Sign Up")
    private WebElement signUpLink;

    @FindBy(linkText = "Login")
    private WebElement login;


    public WebElement getOffersLink() { return offersLink;}

    public WebElement getHotelLink() { return hotelLink;}

    public WebElement getAcctDropdown(){ return AcctDropdown;}

    public WebElement getSignUpLink() { return signUpLink;}

    public WebElement getLogin() { return login; }

}
