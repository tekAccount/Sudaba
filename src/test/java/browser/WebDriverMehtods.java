package browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverMehtods {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
	
		// driver.get(url) this would launch the browser for us 
		driver.get("https://tek-retail-ui.azurewebsites.net/");
		
		// diver.gettitle(); would give us the title of cuurent webpage
	
         String getTitle = driver.getTitle();
         System.out.println("pagetitle is "+getTitle);
         
         // driver.getcurrenturl(); would get us the url for current website
         String currenturl = driver.getCurrentUrl();
         driver.getCurrentUrl();
         System.out.println(   driver.getCurrentUrl());
         // System.out.println(currenturl);
         
         // driver.getsource(); would get us the source code for the website
         String pagesource= driver.getPageSource();
        // System.out.println(pagesource);
         System.out.println(driver.getPageSource());
         
         // driver.close();
         // would close the current poage thats is opened by selenium
         driver.close();
         
         // driver.quit(); would close all of the pages that are opened by selenium
         driver.quit();
         
         
     
      
		
		
		
		
	}

}
