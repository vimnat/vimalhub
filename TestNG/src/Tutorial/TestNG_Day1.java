package Tutorial;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNG_Day1 {
	

		//System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
		//String driverPath = "C:\\work\\chromedriver.exe";
		//WebDriver driver = new ChromeDriver();
		//driver.get("http://facebook.com");
	
	
	@Test
	public void demo1()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://facebook.com");
	}

}
