package SeleniumBrowserTest;
// Open barclays home page in multi browser by choosing browser in String browser line number: 21
//Bug(Problem): IN Internet Explorer Only baseUrl opens and next steps can't be followed.

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

import static java.lang.Thread.sleep;

public class MultiBrowserTest {
    static String baseurl = "https://www.barclays.co.uk/";
    static WebDriver driver;

    //  please enter browser eg. : chrome, firefox, internet explorer(it's not working as expected), microsoft edge etc.
    static String browser = "internet explorer";

    public static void main(String[] args) throws InterruptedException {
        if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().window().setPosition(new Point(-2000, 0));
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            driver.get(baseurl);

            sleep(5000);
            driver.quit();
        } else if (browser.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
            driver = new FirefoxDriver();
            driver.manage().window().setPosition(new Point(-2000, 0));
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            driver.get(baseurl);

            Thread.sleep(5000);
            driver.quit();
        } else if (browser.equalsIgnoreCase("internet explorer")) {
            System.setProperty("webdriver.ie.driver", "drivers/IEDriverServer.exe");
            driver = new InternetExplorerDriver();
            driver.manage().window().setPosition(new Point(-2000, 0));
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            driver.get(baseurl);

            Thread.sleep(5000);
            driver.quit();
        } else if (browser.equalsIgnoreCase("microsoft edge")) {
            System.setProperty("webdriver.edge.driver", "drivers/msedgedriver.exe");
            driver = new EdgeDriver();
            driver.manage().window().setPosition(new Point(-2000, 0));
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            driver.get(baseurl);

            Thread.sleep(5000);
            driver.quit();
        } else
            System.out.println("wrong browser");


    }
}




