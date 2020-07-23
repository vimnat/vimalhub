import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class chrome_prism_monday {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		JavascriptExecutor js = (JavascriptExecutor) driver;

		// Resize current window to the set dimension

		// Logging in Prism home page
		driver.get("https://prism.aspiresys.com/PMO/login");
		driver.findElement(By.xpath("//input[@id='user']")).sendKeys("vimal.ramachandran");
		driver.findElement(By.cssSelector("input[id= 'password'")).sendKeys("June@123");
		driver.findElement(By.xpath("//input[@value= 'Login']")).click();
		driver.findElement(By.cssSelector("a[class*= 'sf-with']")).click();

		// calling timesheet page
		driver.findElement(By.xpath("//a[@href='/PMO/timesheet/project']")).click();
		driver.manage().window().maximize();
		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(10000);

		// declaring strings for all the weekday
		String assmon = driver.findElement(By.xpath(
				"//div[@class='timesheet-project ui-widget-content readable-summary ui-project-text ui-autocomplete-input']"))
				.getText();
		String asstue = driver.findElement(By.xpath("//*[@id=\"timesheet_table\"]/tbody/tr[1]/td[9]/div")).getText();
		String asswed = driver.findElement(By.xpath("//*[@id=\"timesheet_table\"]/tbody/tr[1]/td[10]/div")).getText();
		String assthu = driver.findElement(By.xpath("//*[@id=\"timesheet_table\"]/tbody/tr[1]/td[11]/div")).getText();
		String assfri = driver.findElement(By.xpath("//*[@id=\"timesheet_table\"]/tbody/tr[1]/td[12]/div")).getText();

		// marking Ateendance for Monday, by selecting the project and summary, as it is
		// the first day of week
		if (assmon.isEmpty()) {
			WebElement source = driver.findElement(
					By.xpath("//tr[@class='timesheet-row ui-dynamic-row']//input[@placeholder='Type Your project']"));
			source.sendKeys("TestingSL-Bench");
			WebElement dest = driver.findElement(
					By.xpath("//tr[@class='timesheet-row ui-dynamic-row']//input[@placeholder='Type Your Summary']"));
			dest.sendKeys("bench");
			Thread.sleep(2000);
			dest.sendKeys(Keys.ARROW_DOWN);
			dest.sendKeys(Keys.ARROW_DOWN);
			dest.sendKeys(Keys.ENTER);
			Thread.sleep(10000);
			Select s = new Select(driver.findElement(By.xpath(
					"//tr[@class='timesheet-row ui-dynamic-row']//select[@class='timesheet-exclusion ui-control ui-mandatory']")));
			s.selectByValue("WFH");

			Select d = new Select(driver.findElement(By.xpath(
					"//tr[@class='timesheet-row ui-dynamic-row']//select[@class='timesheet-reason ui-control ui-mandatory']")));
			d.selectByValue("bench");

			driver.findElement(By.xpath(
					"//tr[@class='timesheet-row ui-dynamic-row']//div[@class='sticky-popup-toggler ui-widget-content ui-enabled ui-draft ui-unclosed weekday-1']"))
					.click();
			driver.findElement(By.xpath(
					"//input[contains(@class,'timesheet-duration ui-mandatory ui-control ui-duration dynamic-time-entry hasTimeEntry')]"))
					.sendKeys("9");
			driver.findElement(By.xpath(
					"//div[contains(@class,'float-menu-container sticky-popup-container sticky-popup-container-cloned')]//textarea[contains(@class,'timesheet-comments ui-control ui-mandatory ui-comments')]"))
					.sendKeys("bench");
			driver.findElement(By.xpath(
					"//div[contains(@class,'float-menu-container sticky-popup-container sticky-popup-container-cloned')]//button[contains(@class,'float-menu-btn sticky-popup-btn ui-save')][contains(text(),'Save')]"))
					.click();
		}

		// marking attendance for Tuesday
		else if (asstue.isEmpty()) {

			driver.findElement(By.xpath("//*[@id=\"timesheet_table\"]/tbody/tr[1]/td[9]/div")).click();
			driver.findElement(By.xpath(
					"//input[contains(@class,'timesheet-duration ui-mandatory ui-control ui-duration dynamic-time-entry hasTimeEntry')]"))
					.sendKeys("9");
			driver.findElement(By.xpath(
					"//div[contains(@class,'float-menu-container sticky-popup-container sticky-popup-container-cloned')]//textarea[contains(@class,'timesheet-comments ui-control ui-mandatory ui-comments')]"))
					.sendKeys("bench");
			driver.findElement(By.xpath(
					"//div[contains(@class,'float-menu-container sticky-popup-container sticky-popup-container-cloned')]//button[contains(@class,'float-menu-btn sticky-popup-btn ui-save')][contains(text(),'Save')]"))
					.click();
		}

		// marking attendence for wednesday

		else if (asswed.isEmpty()) {
			driver.findElement(By.xpath("//*[@id=\"timesheet_table\"]/tbody/tr[1]/td[10]/div")).click();
			driver.findElement(By.xpath(
					"//input[contains(@class,'timesheet-duration ui-mandatory ui-control ui-duration dynamic-time-entry hasTimeEntry')]"))
					.sendKeys("9");
			driver.findElement(By.xpath(
					"//div[contains(@class,'float-menu-container sticky-popup-container sticky-popup-container-cloned')]//textarea[contains(@class,'timesheet-comments ui-control ui-mandatory ui-comments')]"))
					.sendKeys("bench");
			driver.findElement(By.xpath(
					"//div[contains(@class,'float-menu-container sticky-popup-container sticky-popup-container-cloned')]//button[contains(@class,'float-menu-btn sticky-popup-btn ui-save')][contains(text(),'Save')]"))
					.click();
		}

		else if (assthu.isEmpty()) {
			driver.findElement(By.xpath("//*[@id=\"timesheet_table\"]/tbody/tr[1]/td[11]/div")).click();
			driver.findElement(By.xpath(
					"//input[contains(@class,'timesheet-duration ui-mandatory ui-control ui-duration dynamic-time-entry hasTimeEntry')]"))
					.sendKeys("9");
			driver.findElement(By.xpath(
					"//div[contains(@class,'float-menu-container sticky-popup-container sticky-popup-container-cloned')]//textarea[contains(@class,'timesheet-comments ui-control ui-mandatory ui-comments')]"))
					.sendKeys("bench");
			driver.findElement(By.xpath(
					"//div[contains(@class,'float-menu-container sticky-popup-container sticky-popup-container-cloned')]//button[contains(@class,'float-menu-btn sticky-popup-btn ui-save')][contains(text(),'Save')]"))
					.click();
		} else if (assfri.isEmpty()) {
			driver.findElement(By.xpath("//*[@id=\"timesheet_table\"]/tbody/tr[1]/td[12]/div")).click();
			driver.findElement(By.xpath(
					"//input[contains(@class,'timesheet-duration ui-mandatory ui-control ui-duration dynamic-time-entry hasTimeEntry')]"))
					.sendKeys("9");
			driver.findElement(By.xpath(
					"//div[contains(@class,'float-menu-container sticky-popup-container sticky-popup-container-cloned')]//textarea[contains(@class,'timesheet-comments ui-control ui-mandatory ui-comments')]"))
					.sendKeys("bench");
			driver.findElement(By.xpath(
					"//div[contains(@class,'float-menu-container sticky-popup-container sticky-popup-container-cloned')]//button[contains(@class,'float-menu-btn sticky-popup-btn ui-save')][contains(text(),'Save')]"))
					.click();
		}

	}

}
