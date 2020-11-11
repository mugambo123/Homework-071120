package Amazon;/* Open amazon.co.uk Website<electronics< mobile phones and communication< apple airpods pro< add to basket< sign in
 to pay. In multi browser by choosing browser in String browser line number: 26 */
//Bug(Problem): Internet Explorer Only baseUrl opens and next steps can't be followed.


import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

public class AmazonMultiBrowserTest {

    static String baseUrl;
    static String baseUrl1;
    static String baseUrl2;
    static String baseUrl3;
    static String baseUrl4;
    static String baseUrl5;
    //  please enter browser eg.: chrome, firefox, internet explorer(it's not working as expected), microsoft edge etc.
    static String browser = "chrome";

    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {

        if (browser.equalsIgnoreCase("chrome")) {

            String baseUrl = "https://www.amazon.co.uk/";
            String baseUrl1 = "https://www.amazon.co.uk/electronics-camera-mp3-ipod-tv/b/?ie=UTF8&node=560798&ref_=nav_cs_electronics";
            String baseUrl2 = "https://www.amazon.co.uk/b/?node=1340509031&ref_=Oct_s9_apbd_odnav_hd_bw_b2Lt8_0&pf_rd_r=YGTVEDFW3JPQR7T3ZEZZ&pf_rd_p=9fcaa2d5-b1f2-556b-a30a-2137dcb9bdf3&pf_rd_s=merchandised-search-10&pf_rd_t=BROWSE&pf_rd_i=560798";
            String baseUrl3 = "https://www.amazon.co.uk/Apple-MWP22ZM-A-AirPods-Pro/dp/B07ZPML7NP?ref_=Oct_s9_apbd_otopr_hd_bw_b1SiddP&pf_rd_r=PQR6M2F2VEFA200TAVAW&pf_rd_p=b657fb94-feea-5fb0-8542-fd7e9cc69a65&pf_rd_s=merchandised-search-10&pf_rd_t=BROWSE&pf_rd_i=1340509031";
            String baseUrl4 = "https://www.amazon.co.uk/gp/cart/view.html/ref=dp_atch_dss_cart?";
            String baseUrl5 = "https://www.amazon.co.uk/ap/signin?_encoding=UTF8&openid.assoc_handle=amazon_checkout_gb&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.co.uk%2Fgp%2Fbuy%2Fsignin%2Fhandlers%2Fcontinue.html%3Fie%3DUTF8%26brandId%3D%26cartItemIds%3D%26eGCApp%3D%26hasWorkingJavascript%3D0%26isEGCOrder%3D0%26isFresh%3D%26oldCustomerId%3D0%26oldPurchaseId%3D%26preInitiateCustomerId%3D%26purchaseInProgress%3D%26ref_%3Dcart_signin_submit%26siteDesign%3D&pageId=amazon_checkout_gb&showRmrMe=0&siteState=isRegularCheckout.1%7CIMBMsgs.%7CisRedirect.1&suppressSignInRadioButtons=0";

            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().window().setPosition(new Point(-2000, 0));
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            driver.get(baseUrl);
            driver.get(baseUrl1);
            driver.get(baseUrl2);
            driver.get(baseUrl3);
            driver.get(baseUrl4);
            driver.get(baseUrl5);


            Thread.sleep(5000);
            driver.quit();
        } else if (browser.equalsIgnoreCase("firefox")) {
            String baseUrl = "https://www.amazon.co.uk/";
            String baseUrl1 = "https://www.amazon.co.uk/electronics-camera-mp3-ipod-tv/b/?ie=UTF8&node=560798&ref_=nav_cs_electronics";
            String baseUrl2 = "https://www.amazon.co.uk/b/?node=1340509031&ref_=Oct_s9_apbd_odnav_hd_bw_b2Lt8_0&pf_rd_r=YGTVEDFW3JPQR7T3ZEZZ&pf_rd_p=9fcaa2d5-b1f2-556b-a30a-2137dcb9bdf3&pf_rd_s=merchandised-search-10&pf_rd_t=BROWSE&pf_rd_i=560798";
            String baseUrl3 = "https://www.amazon.co.uk/Apple-MWP22ZM-A-AirPods-Pro/dp/B07ZPML7NP?ref_=Oct_s9_apbd_otopr_hd_bw_b1SiddP&pf_rd_r=PQR6M2F2VEFA200TAVAW&pf_rd_p=b657fb94-feea-5fb0-8542-fd7e9cc69a65&pf_rd_s=merchandised-search-10&pf_rd_t=BROWSE&pf_rd_i=1340509031";
            String baseUrl4 = "https://www.amazon.co.uk/gp/cart/view.html/ref=dp_atch_dss_cart?";
            String baseUrl5 = "https://www.amazon.co.uk/ap/signin?_encoding=UTF8&openid.assoc_handle=amazon_checkout_gb&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.co.uk%2Fgp%2Fbuy%2Fsignin%2Fhandlers%2Fcontinue.html%3Fie%3DUTF8%26brandId%3D%26cartItemIds%3D%26eGCApp%3D%26hasWorkingJavascript%3D0%26isEGCOrder%3D0%26isFresh%3D%26oldCustomerId%3D0%26oldPurchaseId%3D%26preInitiateCustomerId%3D%26purchaseInProgress%3D%26ref_%3Dcart_signin_submit%26siteDesign%3D&pageId=amazon_checkout_gb&showRmrMe=0&siteState=isRegularCheckout.1%7CIMBMsgs.%7CisRedirect.1&suppressSignInRadioButtons=0";


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

            Thread.sleep(5000);
            driver.quit();


        } else if (browser.equalsIgnoreCase("internet explorer")) {

            String baseUrl = "https://www.amazon.co.uk/";
            String baseUrl1 = "https://www.amazon.co.uk/electronics-camera-mp3-ipod-tv/b/?ie=UTF8&node=560798&ref_=nav_cs_electronics";
            String baseUrl2 = "https://www.amazon.co.uk/b/?node=1340509031&ref_=Oct_s9_apbd_odnav_hd_bw_b2Lt8_0&pf_rd_r=YGTVEDFW3JPQR7T3ZEZZ&pf_rd_p=9fcaa2d5-b1f2-556b-a30a-2137dcb9bdf3&pf_rd_s=merchandised-search-10&pf_rd_t=BROWSE&pf_rd_i=560798";
            String baseUrl3 = "https://www.amazon.co.uk/Apple-MWP22ZM-A-AirPods-Pro/dp/B07ZPML7NP?ref_=Oct_s9_apbd_otopr_hd_bw_b1SiddP&pf_rd_r=PQR6M2F2VEFA200TAVAW&pf_rd_p=b657fb94-feea-5fb0-8542-fd7e9cc69a65&pf_rd_s=merchandised-search-10&pf_rd_t=BROWSE&pf_rd_i=1340509031";
            String baseUrl4 = "https://www.amazon.co.uk/gp/cart/view.html/ref=dp_atch_dss_cart?";
            String baseUrl5 = "https://www.amazon.co.uk/ap/signin?_encoding=UTF8&openid.assoc_handle=amazon_checkout_gb&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.co.uk%2Fgp%2Fbuy%2Fsignin%2Fhandlers%2Fcontinue.html%3Fie%3DUTF8%26brandId%3D%26cartItemIds%3D%26eGCApp%3D%26hasWorkingJavascript%3D0%26isEGCOrder%3D0%26isFresh%3D%26oldCustomerId%3D0%26oldPurchaseId%3D%26preInitiateCustomerId%3D%26purchaseInProgress%3D%26ref_%3Dcart_signin_submit%26siteDesign%3D&pageId=amazon_checkout_gb&showRmrMe=0&siteState=isRegularCheckout.1%7CIMBMsgs.%7CisRedirect.1&suppressSignInRadioButtons=0";


            System.setProperty("webdriver.ie.driver", "drivers/IEDriverServer.exe");
            driver = new InternetExplorerDriver();
            driver.manage().window().setPosition(new Point(-2000, 0));
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            driver.get(baseUrl);
            driver.get(baseUrl1);
            driver.get(baseUrl2);
            driver.get(baseUrl3);
            driver.get(baseUrl4);
            driver.get(baseUrl5);

            Thread.sleep(5000);
            driver.quit();

        } else if (browser.equalsIgnoreCase("microsoft edge")) ;
        {

            String baseUrl = "https://www.amazon.co.uk/";
            String baseUrl1 = "https://www.amazon.co.uk/electronics-camera-mp3-ipod-tv/b/?ie=UTF8&node=560798&ref_=nav_cs_electronics";
            String baseUrl2 = "https://www.amazon.co.uk/b/?node=1340509031&ref_=Oct_s9_apbd_odnav_hd_bw_b2Lt8_0&pf_rd_r=YGTVEDFW3JPQR7T3ZEZZ&pf_rd_p=9fcaa2d5-b1f2-556b-a30a-2137dcb9bdf3&pf_rd_s=merchandised-search-10&pf_rd_t=BROWSE&pf_rd_i=560798";
            String baseUrl3 = "https://www.amazon.co.uk/Apple-MWP22ZM-A-AirPods-Pro/dp/B07ZPML7NP?ref_=Oct_s9_apbd_otopr_hd_bw_b1SiddP&pf_rd_r=PQR6M2F2VEFA200TAVAW&pf_rd_p=b657fb94-feea-5fb0-8542-fd7e9cc69a65&pf_rd_s=merchandised-search-10&pf_rd_t=BROWSE&pf_rd_i=1340509031";
            String baseUrl4 = "https://www.amazon.co.uk/gp/cart/view.html/ref=dp_atch_dss_cart?";
            String baseUrl5 = "https://www.amazon.co.uk/ap/signin?_encoding=UTF8&openid.assoc_handle=amazon_checkout_gb&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.co.uk%2Fgp%2Fbuy%2Fsignin%2Fhandlers%2Fcontinue.html%3Fie%3DUTF8%26brandId%3D%26cartItemIds%3D%26eGCApp%3D%26hasWorkingJavascript%3D0%26isEGCOrder%3D0%26isFresh%3D%26oldCustomerId%3D0%26oldPurchaseId%3D%26preInitiateCustomerId%3D%26purchaseInProgress%3D%26ref_%3Dcart_signin_submit%26siteDesign%3D&pageId=amazon_checkout_gb&showRmrMe=0&siteState=isRegularCheckout.1%7CIMBMsgs.%7CisRedirect.1&suppressSignInRadioButtons=0";

            System.setProperty("webdriver.edge.driver", "drivers/msedgedriver.exe");
            driver = new EdgeDriver();
            driver.manage().window().setPosition(new Point(-2000, 0));
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            driver.get(baseUrl);
            driver.get(baseUrl1);
            driver.get(baseUrl2);
            driver.get(baseUrl3);
            driver.get(baseUrl4);
            driver.get(baseUrl5);

            Thread.sleep(5000);
            driver.quit();


        }
          else
            System.out.println("wrong browser");

    }
}
