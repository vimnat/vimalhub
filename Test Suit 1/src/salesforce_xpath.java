import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class salesforce_xpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/?locale=in");
		driver.findElement(By.id("username")).sendKeys("vimnat@gmail.com");
		driver.findElement(By.name("pw")).sendKeys("9894130097");
		//driver.findElement(By.linkText("Forgotten account?")).click();
		driver.findElement(By.xpath("//*[@id='Login']")).click();
	}

}
