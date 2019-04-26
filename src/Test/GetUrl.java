package Test;

import openqapackage.BaseTest;
import org.junit.After;
import org.junit.Before;
import ExecuteSteps.getHotelMethods;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses(getHotelMethods.class)
public class GetUrl extends BaseTest{

    @Before
    public void GetUrl(){

        driver.get(Travel_Url);
        bodySection();


    }

    public void getAdminUrl(){

        driver.get(Travel_Url + "/admin");
        bodySection();


    }

    @After
    public void closeBrowser(){
        driver.close();
    }
}
