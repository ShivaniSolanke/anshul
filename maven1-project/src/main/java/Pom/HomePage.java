package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	private WebDriver driver;
    Actions a;
	
	@FindBy(xpath="(//a[@class='_2I9KP_'])[1]")
	private WebElement Flights;
	
	@FindBy(xpath="//img[@alt='Top Offers']")
	private WebElement offerzone;
	
	@FindBy(xpath="//img[@alt='Grocery']")
	private WebElement grocery;
	
	@FindBy(xpath="//div[text()='My Account']")
	private WebElement Accounts;
	
	@FindBy(xpath="//div[text()='Logout']")
	private WebElement Logout;
	
	@FindBy(xpath="//img[@alt='Fashion']")
	private WebElement Fashion;
	@FindBy(xpath="//img[@alt='Mobiles']")
	private WebElement Mobile;
	@FindBy(xpath="(//img[@alt='realme 7'])[2]")
	private WebElement realme;

	public HomePage(WebDriver driver) 
	 {
	      this.driver=driver;
		PageFactory.initElements(driver, this);
		
	 }
	public void flight() {
		Flights.click();
		
	}
	public void mobiles() {
		Mobile.click();
        
	}
	public void offerzone() {
		offerzone.click();
	}
	public void grocery() {
		grocery.click();
	}
	public void action() {
		a=new Actions(driver);
		a.moveToElement(Accounts).perform();
	}
	public void action1() {
		a=new Actions(driver);
	     a.moveToElement(Logout).click().build().perform();
    }
	
}
