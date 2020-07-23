import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chrome_prsim_status {

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
		
		
	}

}
