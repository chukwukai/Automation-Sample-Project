package Map;

import openqapackage.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class navigationMap extends BaseTest{

    @FindBy(linkText = "OFFERS")
    private WebElement offersLink;

    @FindBy(linkText = "HOTELS")
    private WebElement hotelLink;


    public WebElement getOffersLink() { return offersLink;}

    public WebElement getHotelLink() { return hotelLink;}

}
