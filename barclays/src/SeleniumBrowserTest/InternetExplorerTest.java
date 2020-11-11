package SeleniumBrowserTest;
//Bug(Problem): IN Internet Explorer Only baseUrl opens and next steps can't be followed.

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

public class InternetExplorerTest {
    static String browser = "Internet Explorer";
    static String baseUrl = "https://www.barclays.co.uk/";

    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.ie.driver", "drivers/IEDriverServer.exe");
        driver = new InternetExplorerDriver();
        driver.manage().window().setPosition(new Point(-2000, 0));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get(baseUrl);


        Thread.sleep(2000);
        driver.quit();


    }

}


