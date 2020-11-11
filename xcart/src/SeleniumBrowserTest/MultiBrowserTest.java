package SeleniumBrowserTest;

// Open xcart website  home page in multi browser by choosing browser in String browser line number: 21
// Limitations: macbook required for safari browser test.

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;

import java.util.concurrent.TimeUnit;

public class MultiBrowserTest {

    /*please enter browser eg. : chrome, firefox, internet explorer(it's not working as expected),
     microsoft edge etc.*/


    static String browser;
    static String baseUrl;
    static WebDriver driver;

    public static String getBrowser() {
        return browser;
    }

    public static void setBrowser(String browser) {
        MultiBrowserTest.browser = browser;
    }

    public static String getBaseUrl() {
        return baseUrl;
    }

    public static void setBaseUrl(String baseUrl) {
        MultiBrowserTest.baseUrl = baseUrl;
    }

    public MultiBrowserTest() {
        this.browser = browser;
        this.baseUrl = baseUrl;
    }

    public static void main(String[] args) throws InterruptedException {

        multiTest("firefox", "https://www.x-cart.com/");

    }


    public static void multiTest(String browser, String baseUrl) throws InterruptedException {
        if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().window().setPosition(new Point(-2000, 0));
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            driver.get(baseUrl);

            Thread.sleep(2000);
            driver.quit();

        } else if (browser.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
            driver = new FirefoxDriver();
            driver.manage().window().setPosition(new Point(-2000, 0));
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            driver.get(baseUrl);

            Thread.sleep(2000);
            driver.quit();
        } else if (browser.equalsIgnoreCase("internet explorer")) {
            System.setProperty("webdriver.ie.driver", "drivers/IEDriverServer.exe");
            driver = new InternetExplorerDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            driver.get(baseUrl);

            Thread.sleep(2000);
            driver.quit();
        } else if (browser.equalsIgnoreCase("microsoft edge")) {
            System.setProperty("webdriver.edge.driver", "drivers/msedgedriver.exe");
            driver = new EdgeDriver();
            driver.manage().window().setPosition(new Point(-2000, 0));
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            driver.get(baseUrl);

            Thread.sleep(2000);
            driver.quit();


        } else
            System.out.println("wrong browser");


    }
}


