import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chrome_xpathcss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://facebook.com");
		//driver.findElement(By.id("email")).sendKeys("vimnat@gmail.com");
		//driver.findElement(By.name("pass")).sendKeys("9894130097");
		//driver.findElement(By.linkText("Forgotten account?")).click();
		// learning xpath and cssselector
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("push hard");
		driver.findElement(By.cssSelector("#pass")).sendKeys("4444");
		
	}

}
