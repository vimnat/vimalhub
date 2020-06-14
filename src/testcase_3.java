import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class testcase_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		 /* x driver = new x()
		  * similarly for class name = InternetExplorerDriver,
		  * InternetExplorerDriver driver = new InternetExplorerDriver()
		  * webdriver is the interface so
		  * webdriver driver = new InternetExplorerDriver()     
		  */
		// invoke .exe file first
		System.setProperty("webdriver.ie.driver", "C:\\work\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.get("http://gmail.com");
		System.out.println("The title of the webpage is"+ driver.getTitle());

	}

}
