package ExecuteSteps;

//import org.junit.Test;
import org.testng.annotations.Test;
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
        /*hotel.getDetailInfos();
        hotelMap.getCheck();
        hotel.getCheckBox();
        hotelMap.getBookNow();
        hotel.getBookNow(); */
    }


    }
