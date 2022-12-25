package browser;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MaximizeWindowandImplicitlyandPageLoadTimeout {

	public static void main(String[] args) throws InterruptedException {

		// how to maximize window?
		// how to add pageload timeout?
		// how to add implicity wait?

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");

		// how to maximize window
		driver.manage().window().maximize();
//		// this is for selenium 3
//		// driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.MINUTES);
//		// this is for selenium 4
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		// how to add implicity wait?
		// implicity wait will remain in effcet during the entire execution of our test
		// implicity wait direct the webdirver to wait for certian amount of time 
		// before throwing an exeception that a specific element is not found.
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        Thread.sleep(3000);
		driver.close();
	}

}
