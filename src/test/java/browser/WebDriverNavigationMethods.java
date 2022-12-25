package browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverNavigationMethods {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://tek-retail-ui.azurewebsites.net/");
		// it is a hard wait in selenium and it basically pauses our test execuation for
		// the amonut of time/ milli seconds that we provide
		Thread.sleep(3000);
		// Webdriver Naviagation Mehtod;
		// driver.navigate().to (url for another website);
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(3000);
		// previous url
		driver.navigate().back();
		Thread.sleep(3000);
		// and if we want to navigate forward, we can use the
		// driver.navigate().forward();
		driver.navigate().forward();
		Thread.sleep(3000);
		// If for some reasons, after we launch our browser and open the website
		// we may not be able to interact with elements on the website, so it may
		// require a page refresh so that we can click on something or send text
		// to a text field, that is when we need the driver.navigate().refresh(); method
		driver.navigate().refresh();
		Thread.sleep(500);
		driver.navigate().refresh();
		Thread.sleep(500);
		driver.navigate().refresh();
		Thread.sleep(500);
			
		driver.close();
			
		
	}

}
