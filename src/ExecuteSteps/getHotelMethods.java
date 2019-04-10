package ExecuteSteps;

import org.junit.Test;
import openqapackage.BaseTest;


public class getHotelMethods extends BaseTest {

    @Test
    public void createHotel()  {
        url.GetUrl();
        navigateLink.navigatePage("Hotels");
        hotelMap.getHotelName();
        hotel.getHotel("New York");
        hotelMap.getCheckInPicker();
        hotel.getCheckInDate();
        hotelMap.getCheckOutPicker();
        hotel.getCheckOutDate();
        hotel.selectSearchBtn();
        hotel.getDetailInfos();
        hotelMap.getCheck();
        hotel.getCheckBox();
        hotelMap.getBookNow();
        hotel.getBookNow();
    }

    @Test
    public void CreateAccount() throws  Exception{
        url.GetUrl();
        navigateLink.navigatePage("Sign up");
        ac.AccountCreate("Tester", "test", "9009009000", "test1@sample.com", "testing123!");
    }

    @Test
    public void LoginPage() throws Exception{
        url.GetUrl();
        navigateLink.navigatePage("Login");
        ac.Login("test1@sample.com", "testing123!", "Tester");

    }

    }
