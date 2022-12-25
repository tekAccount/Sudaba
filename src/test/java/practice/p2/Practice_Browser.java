package practice.p2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice_Browser {

	public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		
		
	//	WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
//		WebDriverManager.firefoxdriver().setup();
//		WebDriver driver = new FirefoxDriver();
//		driver.get("https://tek-retail-ui.azurewebsites.net/");
		
//		
//		WebDriverManager.edgedriver().setup();
//		WebDriver driver = new EdgeDriver();
//		driver.get("https://tek-retail-ui.azurewebsites.net/");
//		
		
	}

}
