package browser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day1PracriceYouTube {
	
	
	

	public static void main(String[] args) {
		

		
			
			WebDriver driver = new ChromeDriver();
			
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		
		}
		

	}


