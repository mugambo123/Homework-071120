package SeleniumBrowserTest;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ChromeTest {
    static String browser = "chrome";
    static String baseUrl = "https://www.nopcommerce.com/demo";

    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().setPosition(new Point(-2000, 0));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get(baseUrl);


        Thread.sleep(2000);
        driver.quit();


    }

}

