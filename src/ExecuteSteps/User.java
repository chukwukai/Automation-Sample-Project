package ExecuteSteps;

//import org.junit.Test;
import org.testng.annotations.Test;
import openqapackage.BaseTest;


public class User extends BaseTest {
    @Test
    public void CreateAccount() throws  Exception{
        url.GetUrl();
        navigateLink.navigatePage("Sign up");
        ac.AccountCreate("Tester", "test", "9009009000", "test002@sample.com", "testing123!");
        ac.ProfileValidation("Tester");
        /*navigateLink.navigatePage("Logout");
        url.getAdminUrl();
        ac.Login("admin@phptravels.com", "demoadmin");
        navigateLink.navigatePage("Accounts"); */

    }

    @Test
    public void LoginPage() throws Exception{
        url.GetUrl();
        navigateLink.navigatePage("Login");
        ac.Login("test1@sample.com", "testing123!");
        ac.ProfileValidation("Tester");

    }

    @Test(dependsOnMethods = {"LoginPage"}, alwaysRun = true)
    public void AddressProfile() throws Exception {
        url.GetUrl();
        navigateLink.navigatePage("Login");
        ac.Login("test1@sample.com", "testing123!");
        ac.ProfileValidation("Tester");
        ac.addressProfile("123 Main Street" , "Apt 2" , "Hanahan", "South Carolina", "24948", "United States");
        successMessage();
    }
}
