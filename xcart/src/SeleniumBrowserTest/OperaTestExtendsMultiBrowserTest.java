package SeleniumBrowserTest;

/* This Program can run Opera Browser Test and also Multi Browser Test by entering browser and BaseUrl in
line number: 25;
 */


import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;

import java.util.concurrent.TimeUnit;

public class OperaTestExtendsMultiBrowserTest extends MultiBrowserTest {
    static String browser = "opera"; // Only for  Opera Browser.
    static String baseUrl = "https://www.x-cart.com/"; // Any valid URL should work.
    static WebDriver driver;


    public static void main(String[] args) throws InterruptedException {
        opera(); // only opera browser test will run.

        /*please initialise variable browser eg. : chrome, firefox, internet explorer(it's not working as expected),
     microsoft edge etc. And please also initialise variable baseUrl(Any valid URL should work).*/
        multiTest("microsoft Edge", "https://www.x-cart.com/");

    }

    public static void opera() throws InterruptedException {
        System.setProperty("webdriver.opera.driver", "drivers/operadriver.exe");
        driver = new OperaDriver();
        driver.manage().window().setPosition(new Point(-2000, 0));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get(baseUrl);

        Thread.sleep(2000);
        driver.quit();


    }
}
