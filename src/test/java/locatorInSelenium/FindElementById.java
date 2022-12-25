package locatorInSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElementById {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://tek-retail-ui.azurewebsites.net/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
		//ID
		// find Element we call find Element in order to store  only one Element.
		// find element(); mehtod is coming form webdriver interface.
		// WebDriver interface inherits the mehtod from searchcontext() interface.
		WebElement e1= driver.findElement(By.id("search"));
		e1.click();
		
		WebElement e2 = driver.findElement(By.id("searchInput"));
		
		e2.sendKeys("tv");
		Thread.sleep(4000);
		driver.close();
		
		
		

		
		

	}

}
