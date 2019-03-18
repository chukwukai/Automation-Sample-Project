package Test;

import Map.HotelMap;
import Map.navigationMap;
import Test.Hotel;
import Test.GetUrl;
import org.junit.Before;
import org.junit.Test;
import com.google.common.annotations.VisibleForTesting;
import openqapackage.BaseTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

public class getHotelMethods extends BaseTest {

    @Test
    public void createHotel()   {
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
        ac.AccountCreate("Tester", "test", "9009009000", "test24@sample.com", "testing123!");
    }

    @Test
    public void LoginPage() throws Exception{
        url.GetUrl();
        navigateLink.navigatePage("Login");
        ac.Login("test1@sample.com", "testing123!", "Tester");

    }

    }
