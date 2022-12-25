package browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class brunchbrowser {

	public static void main(String[] args) {
		
		// initializing browser with webDriverManager
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager/5.3.0");
		
		
	    String pagetitle  =	driver.getTitle();
	    System.out.println(pagetitle);
	    String currenturl= driver.getCurrentUrl();
	    System.out.println(currenturl);
	    
	    String page= driver.getPageSource();
	    System.out.println(page);
	    
	  //  driver.close();
	  //   driver.quit();
	    
	    


	   
	      
	
	
	
	//	WebDriverManager.edgedriver().setup();
	//	WebDriver driver = new EdgeDriver();
		
		
//		
//		WebDriverManager.firefoxdriver().setup();
//		WebDriver driver = new FirefoxDriver();
//		driver.get("");
		
		
	}


}
