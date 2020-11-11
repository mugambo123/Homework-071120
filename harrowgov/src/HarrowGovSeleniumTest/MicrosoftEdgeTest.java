package HarrowGovSeleniumTest;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.concurrent.TimeUnit;

public class MicrosoftEdgeTest {
    static String browser = "microsoft edge";
    static String baseUrl = "http://www.harrow.gov.uk/";

    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.edge.driver", "drivers/msedgedriver.exe");
        driver = new EdgeDriver();
        driver.manage().window().setPosition(new Point(-2000,0));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get(baseUrl);


        Thread.sleep(2000);
        driver.quit();


    }

}