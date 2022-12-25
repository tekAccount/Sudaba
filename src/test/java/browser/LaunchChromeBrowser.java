package browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchChromeBrowser {

	public static void main(String[] args) {
		
		// initializing browser with webdrivermanager
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
//		WebDriverManager.edgedriver().setup();
//		WebDriver driver1 = new EdgeDriver();
//		WebDriverManager.firefoxdriver().setup();
//		WebDriver driver3 = new FirefoxDriver();
//		WebDriverManager.safaridriver().setup();
//		WebDriver driver4 = new SafariDriver();
//		
		driver.get("https://tek-retail-ui.azurewebsites.net/");
		
	
		
	
		
		
	}

}
