package udemyworkout;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Calendar {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.exe",
				"C:\\Users\\44787\\eclipse-workspace\\Selenium_TestNG\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.path2usa.com/travel-companion/");
		Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,900)");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='form-field-travel_comp_date']")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

		wait.until(ExpectedConditions
				.visibilityOf(driver.findElement(By.xpath("//div[@class='flatpickr-current-month']"))));

		while (!driver.findElement(By.cssSelector("span.cur-month")).getText().contains("March")) {
			System.out.println(driver.findElement(By.cssSelector("span.cur-month")).getText());
			driver.findElement(By.xpath("//body/div/div/span[2]//*[name()='svg']")).click();
			Thread.sleep(2000);
			
		}

	}

}
