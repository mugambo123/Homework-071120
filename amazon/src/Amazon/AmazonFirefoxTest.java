package Amazon;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class AmazonFirefoxTest {
    static String browser = "firefox";
    static String baseUrl = "https://www.amazon.co.uk/";
    static String baseUrl1 = "https://www.amazon.co.uk/electronics-camera-mp3-ipod-tv/b/?ie=UTF8&node=560798&ref_=nav_cs_electronics";
    static String baseUrl2 = "https://www.amazon.co.uk/b/?node=1340509031&ref_=Oct_s9_apbd_odnav_hd_bw_b2Lt8_0&pf_rd_r=YGTVEDFW3JPQR7T3ZEZZ&pf_rd_p=9fcaa2d5-b1f2-556b-a30a-2137dcb9bdf3&pf_rd_s=merchandised-search-10&pf_rd_t=BROWSE&pf_rd_i=560798";
    static String baseUrl3 = "https://www.amazon.co.uk/Apple-MWP22ZM-A-AirPods-Pro/dp/B07ZPML7NP?ref_=Oct_s9_apbd_otopr_hd_bw_b1SiddP&pf_rd_r=PQR6M2F2VEFA200TAVAW&pf_rd_p=b657fb94-feea-5fb0-8542-fd7e9cc69a65&pf_rd_s=merchandised-search-10&pf_rd_t=BROWSE&pf_rd_i=1340509031";
    static String baseUrl4 = "https://www.amazon.co.uk/gp/cart/view.html/ref=dp_atch_dss_cart?";
    static String baseUrl5 = "https://www.amazon.co.uk/ap/signin?_encoding=UTF8&openid.assoc_handle=amazon_checkout_gb&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.co.uk%2Fgp%2Fbuy%2Fsignin%2Fhandlers%2Fcontinue.html%3Fie%3DUTF8%26brandId%3D%26cartItemIds%3D%26eGCApp%3D%26hasWorkingJavascript%3D0%26isEGCOrder%3D0%26isFresh%3D%26oldCustomerId%3D0%26oldPurchaseId%3D%26preInitiateCustomerId%3D%26purchaseInProgress%3D%26ref_%3Dcart_signin_submit%26siteDesign%3D&pageId=amazon_checkout_gb&showRmrMe=0&siteState=isRegularCheckout.1%7CIMBMsgs.%7CisRedirect.1&suppressSignInRadioButtons=0";

    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().window().setPosition(new Point(-2000, 0));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get(baseUrl);
        driver.get(baseUrl1);
        driver.get(baseUrl2);
        driver.get(baseUrl3);
        driver.get(baseUrl4);
        driver.get(baseUrl5);


        Thread.sleep(2000);
        driver.quit();
    }
}