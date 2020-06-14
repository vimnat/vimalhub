import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chrome_prism_thursday {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//Dimension d = new Dimension(300,1080);
		
		JavascriptExecutor js = (JavascriptExecutor) driver; 
	
     	//Resize current window to the set dimension
		
		driver.get("https://prism.aspiresys.com/PMO/login");
		driver.findElement(By.xpath("//input[@id='user']")).sendKeys("vimal.ramachandran");
		driver.findElement(By.cssSelector("input[id= 'password'")).sendKeys("June@123");
		driver.findElement(By.xpath("//input[@value= 'Login']")).click();
		driver.findElement(By.cssSelector("a[class*= 'sf-with']")).click();
		//driver.findElement(By.xpath("//a[@contains (class, 'sf-with']")).click();
		//driver.findElement(By.cssSelector("div[class*= 'nav']/u1/li[2]")).click();
		driver.findElement(By.xpath("//a[@href='/PMO/timesheet/project']")).click();
		driver.manage().window().maximize();
		//driver.findElement(By.cssSelector("input[type*= 'text']")).sendKeys("9.00");
		 // This  will scroll down the page by  1000 pixel vertical		
        //js.executeScript("window.scrollBy(0,1000)");
		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(20000);
		//timesheet page
		driver.findElement(By.xpath("//*[@id=\"timesheet_table\"]/tbody/tr[1]/td[11]/div")).click();
		driver.findElement(By.xpath("//input[contains(@class,'timesheet-duration ui-mandatory ui-control ui-duration dynamic-time-entry hasTimeEntry')]")).sendKeys("9");
		driver.findElement(By.xpath("//div[contains(@class,'float-menu-container sticky-popup-container sticky-popup-container-cloned')]//textarea[contains(@class,'timesheet-comments ui-control ui-mandatory ui-comments')]")).sendKeys("bench");
		driver.findElement(By.xpath("//div[contains(@class,'float-menu-container sticky-popup-container sticky-popup-container-cloned')]//button[contains(@class,'float-menu-btn sticky-popup-btn ui-save')][contains(text(),'Save')]")).click();
		
	}

}
