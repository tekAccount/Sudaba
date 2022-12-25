package webElements;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import core.initializeBrowser;
import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElementMethod extends initializeBrowser{

	public static void main(String[] args) {
		
		launchBrowser("https://www.selenium.dev/downloads/");

		
		driver.close();
	}

}
