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
    public void createHotel()  {
        url.GetUrl();
        navigateLink.navigatePage("Hotels");
        hotelMap.getHotelName();
        hotel.getHotel("New York");
        hotelMap.getCheckInPicker();
        hotel.getCheckInDate();
        hotelMap.getCheckOutPicker();
        hotel.getCheckInDate();
        hotel.getCheckOutDate();
        hotel.selectSearchBtn();
        hotel.getDetailInfos();
    }

    }
   /* @Test
    public Getrate(){

    } */

