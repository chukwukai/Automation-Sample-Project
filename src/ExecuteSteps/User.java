package ExecuteSteps;

import org.junit.Test;
import openqapackage.BaseTest;


public class User extends BaseTest {
    @Test
    public void CreateAccount() throws  Exception{
        url.GetUrl();
        navigateLink.navigatePage("Sign up");
        ac.AccountCreate("Tester", "test", "9009009000", "test1@sample.com", "testing123!");
        ac.ProfileValidation("Tester");
        url.getAdminUrl();
        ac.Login("test2@sample.com", "testing123!");

    }

    @Test
    public void LoginPage() throws Exception{
        url.GetUrl();
        navigateLink.navigatePage("Login");
        ac.Login("admin@phptravels.com", "demoadmin");
        ac.ProfileValidation("Tester");

    }

    @Test
    public void AddressProfile() throws Exception {
        url.GetUrl();
        navigateLink.navigatePage("Login");
        ac.Login("test1@sample.com", "testing123!");
        ac.ProfileValidation("Tester");
        ac.addressProfile("123 Main Street" , "Apt 2" , "Hanahan", "South Carolina", "24948", "United States");
        successMessage();
    }
}
