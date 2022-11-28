import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RahulShettyDemo {

	public static void main(String[] args) {
	//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\44787\\eclipse-workspace\\Selenium_TestNG\\Drivers\\chromedriver.exe");
	//	WebDriver driver = new ChromeDriver();
		
	//	System.setProperty("webdriver.gecko.driver", "C:\\Users\\44787\\eclipse-workspace\\Selenium_TestNG\\Drivers\\geckodriver.exe");
	//	WebDriver driver = new FirefoxDriver();
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\44787\\eclipse-workspace\\Selenium_TestNG\\Drivers\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
		
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		//driver.close();
		
	}

}
