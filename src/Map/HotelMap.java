package Map;

import openqapackage.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HotelMap extends BaseTest {

    @FindBy(linkText = "Search by Hotel or City Name")
    private WebElement hotelName;

    //@FindBy(xpath = "//*[@id=\"select2-drop\"]/ul/li/ul/li/div/span")
    @FindBy(css = "span.select2-match")
    private WebElement hotelResult;

    @FindBy(name = "checkin")
    private WebElement checkInPicker;

    @FindBy(name = "checkout")
    private WebElement checkOutPicker;

    @FindBy(css = ".day.active")
    private WebElement activeDatePicker;

    @FindBy(css = ".btn.btn-lg.btn-block.btn-primary.pfb0.loader")
    private WebElement searchBtn;

    @FindBy(linkText = "DETAILS")
    //@FindBy(css = ".btn.btn-primary.br25.loader.loader.btn-block")
    private WebElement detailInfos;

    @FindBy(css = "control__indicator")
    private WebElement checkBox;

    @FindBy(linkText = "BOOK NOW")
    private WebElement bookNowBtn;


    public WebElement getHotelName(){ return hotelName;}

    public WebElement getHotelResult(){ return hotelResult; }

    public WebElement getCheckInPicker(){ return checkInPicker;}

    public WebElement getCheckOutPicker(){ return checkOutPicker;}

    public WebElement getActiveDate(){ return activeDatePicker;}

    public WebElement getSearchBtn(){ return searchBtn;}

    public WebElement getDetailInfos(){ return detailInfos;}

    public WebElement getCheck(){ return checkBox; }

    public WebElement getBookNow() { return bookNowBtn; }
}
