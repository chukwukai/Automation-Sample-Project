package Test;

import openqapackage.BaseTest;
import org.junit.After;
import org.junit.Before;
import Test.getHotelMethods;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses(getHotelMethods.class)
public class GetUrl extends BaseTest{

    @Before
    public void GetUrl(){

        String url = "https://www.phptravels.net/";

        driver.get(url);
        bodySection();


    }

    @After
    public void closeBrowser(){
        driver.close();
    }
}
