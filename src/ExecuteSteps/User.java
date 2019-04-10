package ExecuteSteps;

import org.junit.Test;
import openqapackage.BaseTest;


public class User extends BaseTest {

    @Test
    public void LoginPage() throws Exception {
        url.GetUrl();
        navigateLink.navigatePage("Login");
        ac.Login("test1@sample.com", "testing123!", "Tester");
        ac.addressProfile("123 Main Street" , "Apt 2" , "Hanahan", "South Carolina", "24948");

    }
}
