package Pom;

import org.openqa.selenium.chrome.ChromeDriver;

public class run {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("Launch the browser & enter Flipcart url");
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\shivani\\Downloads\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
	
		LoginPage LoginPage = new LoginPage(driver);
		Thread.sleep(2000);
	
	
	
	}

}
