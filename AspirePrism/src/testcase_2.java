import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testcase_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 /* x driver = new x()
		  * similarly for class name = FirefoxDriver,
		  * FirefoxDriver driver = new FirefoxDriver()
		  * webdriver is the interface so
		  * webdriver driver = new FirefoxDriver     
		  */
		// invoke .exe file first
		System.setProperty("webdriver.gecko.driver", "C:\\work\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://gmail.com");
		System.out.println("Title of the webpage is " +driver.getTitle());
		
	}

}
