package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
  
  @FindBy(xpath="//input[@class='_2IX_2- VJZDxU']")
  private WebElement mobile;
 
  @FindBy(xpath="//input[@type='password']")
  private WebElement password;
  
  @FindBy(xpath="(//button[@type='submit'])[2]")
   private WebElement login1;	  
  
  public LoginPage(WebDriver driver) {  //constructor 
  
	  PageFactory.initElements(driver, this);
  }
 

   public void mobile() {
	  mobile.sendKeys("8007386064");
  
  }
  public void password() {
	  password.sendKeys("Shiv@123");
  }
  public void login1() {
	  login1.click();
  }
}

