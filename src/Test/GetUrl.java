package Test;

import openqapackage.BaseTest;
import org.junit.Before;
import Test.getHotelMethods;


public class GetUrl extends BaseTest{

    @Before
    public void GetUrl(){

        String url = "https://www.phptravels.net/";

        driver.get(url);
        bodySection();


    }
}
