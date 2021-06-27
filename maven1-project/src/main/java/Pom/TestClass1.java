package Pom;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClass1 {
    private WebDriver driver;
	private LoginPage LoginPage;
	private HomePage HomePage;
	
@BeforeClass
   public void beforeClass() throws InterruptedException
   {
	System.out.println("Launch the browser & enter Flipcart url");
    System.setProperty("webdriver.gecko.driver", "C:\\Users\\shivani\\Downloads\\geckodriver11112.exe");
	driver = new FirefoxDriver();
	driver.get("https://www.flipkart.com/account/login?ret=%2Fwishlist");
	driver.manage().window().maximize();
   }
@BeforeMethod
public void BeforeMethod() throws InterruptedException {
   
	LoginPage=new LoginPage(driver);
	Thread.sleep(2000);
    LoginPage.mobile();
    Thread.sleep(2000);
    LoginPage.password();
	Thread.sleep(2000);
    LoginPage.login1();
  
}
@Test
public void flight() throws InterruptedException {
   System.out.println("Verify flight button");
   HomePage=new HomePage(driver);
   Thread.sleep(5000);
   HomePage.flight();
   Thread.sleep(2000);
   String url=driver.getCurrentUrl();
if(url.equals("https://www.flipkart.com/travel/flights?otracker=nmenu_Flights")) {
	System.out.println("pass");
}
	else {
	System.out.println("fail");
}
}
@Test
public void offerzone() throws InterruptedException {
	Thread.sleep(2000);
	System.out.println("verify offerzone button");
	HomePage=new HomePage(driver);
	Thread.sleep(2000);
	HomePage.offerzone();
	Thread.sleep(2000);
	String url1=driver.getCurrentUrl();
	if(url1.equals("https://www.flipkart.com/category-offer-store?fm=neo%2Fmerchandising&iid=M_47edd4d9-2f46-4475-ab4c-3dbaa43afd1e_1_372UD5BXDFYS_MC.G6ZC4RAJ9OHU&otracker=hp_rich_navigation_1_1.navigationCard.RICH_NAVIGATION_Top%2BOffers_G6ZC4RAJ9OHU&otracker1=hp_rich_navigation_PINNED_neo%2Fmerchandising_NA_NAV_EXPANDABLE_navigationCard_cc_1_L0_view-all&cid=G6ZC4RAJ9OHU")) {
		System.out.println("pass");
	}
		else {
		System.out.println("fail");
	}
}
@Test
public void grocery() throws InterruptedException {
	Thread.sleep(2000);
	System.out.println("verify glocery button");
	Thread.sleep(2000);
	HomePage=new HomePage(driver);
	Thread.sleep(20000);
	HomePage.grocery();
	Thread.sleep(2000);
	String url2=driver.getCurrentUrl();
	if(url2.equals("https://www.flipkart.com/grocery-supermart-store?marketplace=GROCERY&fm=neo%2Fmerchandising&iid=M_77ffbefc-cb26-4d7a-84bf-f03ef8c10eac_1_372UD5BXDFYS_MC.CBUR1Q46W5F1&otracker=hp_rich_navigation_2_1.navigationCard.RICH_NAVIGATION_Grocery_CBUR1Q46W5F1&otracker1=hp_rich_navigation_PINNED_neo%2Fmerchandising_NA_NAV_EXPANDABLE_navigationCard_cc_2_L0_view-all&cid=CBUR1Q46W5F1")) {
		System.out.println("pass");
	}
		else {
		System.out.println("fail");
	}
}
	

@AfterMethod	
public void Aftermethod() throws InterruptedException {
  Thread.sleep(2000);
  HomePage.action();
  Thread.sleep(2000);
  HomePage.action1();
}
}