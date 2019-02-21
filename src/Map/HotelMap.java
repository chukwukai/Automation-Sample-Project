package Map;

import openqapackage.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HotelMap extends BaseTest {

    //@FindBy(css = "select2-chosen")
    @FindBy(xpath = "//*[@id=\"s2id_autogen8\"]/a/span[1]")
    private WebElement hotelName;

    @FindBy(name = "checkin")
    private WebElement checkInPicker;

    @FindBy(name = "checkout")
    private WebElement checkOutPicker;

    @FindBy(css = ".day.active")
    private WebElement activeDatePicker;

    @FindBy(css = ".btn.btn-lg.btn-block.btn-primary.pfb0.loader")
    private WebElement searchBtn;

    @FindBy(linkText = "DETAILS")
    private WebElement detailInfos;

    @FindBy(css = "control__indicator")
    private WebElement checkBox;

    @FindBy(linkText = "BOOK NOW")
    private WebElement bookNowBtn;


    public WebElement getHotelName(){ return hotelName;}

    public WebElement getCheckInPicker(){ return checkInPicker;}

    public WebElement getCheckOutPicker(){ return checkOutPicker;}

    public WebElement getActiveDate(){ return activeDatePicker;}

    public WebElement getSearchBtn(){ return searchBtn;}

    public WebElement getDetailInfos(){ return detailInfos;}

    public WebElement getCheck(){ return checkBox; }

    public WebElement getBookNow() { return bookNowBtn; }
}
