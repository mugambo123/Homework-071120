package SeleniumBrowserTest;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class FirefoxTest {
    static String browser = "firefox";
    static String baseUrl = "https://www.nopcommerce.com/demo";

    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().window().setPosition(new Point(-2000, 0));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get(baseUrl);


        Thread.sleep(2000);
        driver.quit();


    }

}


