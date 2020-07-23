package Tutorial;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;


public class spicejet {
	
	//public WebDriver driver;
	
	
	@BeforeSuite
	public void demo1()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
	}
	
	
	
	/*
	@BeforeTest
	public void spicejet()
	{
		driver.get("https://www.spicejet.com/");
	} */
	
	
	
	

}
