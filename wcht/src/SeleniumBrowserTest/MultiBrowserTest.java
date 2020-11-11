package SeleniumBrowserTest;

//Selenium Automation testing for opening any desired url in most popular browsers.
//Please enter preferred browser, in scanner class eg.: chrome, firefox, internet (it's not working as expected) or edge etc.
//Please enter any URL to open, in scanner class eg. : http://www.wcht.org.uk
/*Bug(Problem) :
 *1. When hasNextScanner added to test more than one url, driver.get(baseUrl) = null.
 *2. IF wrong URL Input : Not able to validate whether URL is available and program stops */

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class MultiBrowserTest {
    static String browser;
    static String baseUrl;
    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Browser you want to test eg.: chrome, firefox, edge  or internet.");
            String browser = sc.next();


            Scanner url = new Scanner(System.in);
            System.out.println(" Enter URL you want to test eg. : http://www.wcht.org.uk");
            String baseUrl = url.next();


            if (browser.equalsIgnoreCase("chrome")) {
                System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
                driver = new ChromeDriver();
                driver.manage().window().setPosition(new Point(-2000, 0));
                driver.manage().window().maximize();
                driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
                driver.get(baseUrl);


                Thread.sleep(3000);
                driver.quit();

            } else if (browser.equalsIgnoreCase("firefox")) {
                System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
                driver = new FirefoxDriver();
                driver.manage().window().setPosition(new Point(-2000, 0));
                driver.manage().window().maximize();
                driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
                driver.get(baseUrl);

                Thread.sleep(3000);
                driver.quit();

            } else if (browser.equalsIgnoreCase("edge")) {
                System.setProperty("webdriver.edge.driver", "drivers/msedgedriver.exe");
                driver = new EdgeDriver();
                driver.manage().window().setPosition(new Point(-2000, 0));
                driver.manage().window().maximize();
                driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
                driver.get(baseUrl);

                Thread.sleep(3000);
                driver.quit();

            } else if (browser.equalsIgnoreCase("internet")) {
                System.setProperty("webdriver.ie.driver", "drivers/IEDriverServer.exe");
                driver = new InternetExplorerDriver();
                driver.manage().window().setPosition(new Point(-2000, 0));
                driver.manage().window().maximize();
                driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
                driver.get(baseUrl);

                Thread.sleep(3000);
                driver.quit();

            } else
                System.out.println("wrong browser or wrong url");

        } while (true);
    }
}

