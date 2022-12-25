package browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserMethodPractice {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		// it is a hard wait in selenium
		// and it basically pauses our test execution for the amount of time/milli seconds that we provide.
		Thread.sleep(3000);
		//Webdriver Navigation Mehtod
		// driver.navigate().to (url for another website):
		
		driver.navigate().to("https://www.youtube.com/");
		Thread.sleep(3000);
		// now that we navigate to a new url, what if we want to go back to our previous url?
		driver.navigate().back();
	    // and if we want to navigate forward, we can use the driver.navigate().forward();
		driver.navigate().forward();
		Thread.sleep(3000);
		// if for some reason,after we launch our browser and open the website we may not be able to interact with elements on the website,
		//so it may require a page refresh so that we can click on something or send text to a text field,
		//that is when we need the driver.naviagte().refresh(); method
	
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.close();
	}
	
	
	

}
