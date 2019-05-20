package Test.Main;

import openqapackage.BaseTest;
import org.junit.After;
import org.junit.Before;
import ExecuteSteps.getHotelMethods;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

//@RunWith(Suite.class)
//@Suite.SuiteClasses(getHotelMethods.class)
public class GetUrl extends BaseTest{

    @BeforeSuite
    public void GetUrl(){

        driver.get(Travels_Url);
        bodySection();


    }

    public void getAdminUrl(){

        driver.get(Travels_Url + "/admin");
        bodySection();


    }

    @AfterSuite
    public void closeBrowser(){
        driver.close();
    }
}
