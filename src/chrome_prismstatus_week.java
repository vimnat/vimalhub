import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class chrome_prismstatus_week {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//Dimension d = new Dimension(300,1080);
		
		//JavascriptExecutor js = (JavascriptExecutor) driver; 
	
     	//Resize current window to the set dimension
		
		driver.get("https://prism.aspiresys.com/PMO/login");
		driver.findElement(By.xpath("//input[@id='user']")).sendKeys("vimal.ramachandran");
		driver.findElement(By.cssSelector("input[id= 'password'")).sendKeys("June@123");
		driver.findElement(By.xpath("//input[@value= 'Login']")).click();
		driver.findElement(By.cssSelector("a[class*= 'sf-with']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'My Timesheet')]")).click();
		//driver.findElement(By.xpath("//a[@href='/PMO/timesheet']")).click();
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='fromdate']")).click();
		
		//boolean day = driver.findElement(By.className("ui-state-default")).getText().contains("8");

		//List<WebElement> day = driver.findElements(By.className("ui-state-default"));
		int count = driver.findElements(By.className("ui-state-default")).size();
		
		for (int i=0;i<count;i++)
			
		{
			String text = driver.findElements(By.className("ui-state-default")).get(i).getText();
			if(text.equalsIgnoreCase("8"))
			{
				driver.findElements(By.className("ui-state-default")).get(i).click();
				break;
			}			
		}	
		driver.findElement(By.xpath("//input[@id='todate']")).click();	
			
         for (int a=0;a<count;a++)
			
		{
			String text1 = driver.findElements(By.className("ui-state-default")).get(a).getText();
			if(text1.equalsIgnoreCase("13"))
			{
				driver.findElements(By.className("ui-state-default")).get(a).click();
				break;
		    }							
		}	
         driver.findElement(By.xpath("//button[@id='getreport']")).click();

		
		
		
		
	
	}

}
