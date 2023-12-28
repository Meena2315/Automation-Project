package Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestSetup {
    private static WebDriver driver;

    static {
        System.setProperty("webdriver.chrome.driver", "C:\\Maven_Downloads\\chromdriver\\chromdriver.exe");
        driver = new ChromeDriver();
    }

    public static WebDriver getDriver() {
        return driver;
    }

    public static void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }


}
