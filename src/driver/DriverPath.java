package driver;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverPath {

    private static ChromeDriver driver;


    public static WebDriver getDriver() {
        setDriver();
        return driver;
    }

    public static void setDriver() {

        ChromeDriverManager.getInstance().version("73.0").setup();
        driver = new ChromeDriver();

    }
}
