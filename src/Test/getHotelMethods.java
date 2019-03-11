package Test;

import Map.HotelMap;
import Map.navigationMap;
import Test.Hotel;
import Test.GetUrl;
import org.junit.Test;
import com.google.common.annotations.VisibleForTesting;
import openqapackage.BaseTest;

public class getHotelMethods extends BaseTest {

    @Test
    public void createHotel() throws Exception  {
        url.GetUrl();
        navigateLink.navigatePage("Hotels");
        //hotelMap.getHotelName();
        //hotel.getHotel("New York");
        hotelMap.getCheckInPicker();
        hotel.getCheckInDate();
        hotelMap.getCheckOutPicker();
        hotel.getCheckOutDate();
        hotel.selectSearchBtn();
        hotel.getDetailInfos();
    }

    @Test
    public void CreateAccount(){
        url.GetUrl();
        acct.getAcctDropdown();
        ac.signUp();
        ac.AccountCreate("Tester", "test", "9009009000", "test1@sample.com", "testing123!");
    }

    }
   /* @Test
    public Getrate(){

    } */

