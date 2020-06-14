import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class chrome_spicejet_static {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		//depature
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='MAA']")).click();
		Thread.sleep(2000);

		
		//arrival
		driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		//arriv.sendKeys(Keys.ENTER);
		
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
		
		driver.findElement(By.id("divpaxinfo")).click();
		
		Select s=new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
		s.selectByValue("2");
		
		Select c=new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Child")));
		c.selectByIndex(3);
		
		Select i=new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Infant")));
		i.selectByVisibleText("2");
		
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
	}

}
