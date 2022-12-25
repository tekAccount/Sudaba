package browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
//	
//		 String str=driver.getTitle();
//		 System.out.println(str);
//		 driver.navigate().to("https://www.amazon.com/");
//		 
//		 driver.navigate().refresh();
//		 String sr1=driver.getPageSource();
//		 System.out.println(sr1);
//		 
		
		WebElement username=driver.findElement(By.id("email"));
			//	username.sendKeys("something@gmail.com");
//				username.sendKeys("shaheera@gamil.com");
//				String input = username.getText();
//				System.out.println(input);
//				
//				driver.findElement(By.tagName("input"));
//				
				Thread.sleep(4000);
		
		 driver.close();
		 
		
		
		

	}

}
