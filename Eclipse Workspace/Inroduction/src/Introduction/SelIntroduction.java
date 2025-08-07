package Introduction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelIntroduction {

	public static void main(String[] args) {
		
		//Step 1: Invoke Browser
		
		//We will use Chrome browser - ChromeDriver
		//WebDriver functions and names are common across all browsers
		//To avoid using class methods rather than interface methods, use WebDriver type on the left side
		
		//You have the option to use Selenium Manager, which automatically finds the chrome driver
		//or you can download it locally and use the following line
		//System.setProperty("webdriver.chrome.driver", "filepath/to/chromedriver.exe");
		//This is good if you have to restrict automatic downloads, and can also save a few seconds at runtime
		
		WebDriver driver = new ChromeDriver();
		
		//Step 2: Go to a website and print the title and url of the current page
		driver.get("https://rahulshettyacademy.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		//Step 3: quit the driver
		//driver.close();
		driver.quit();
		
		//Close closes ONLY the original page / tab / window
		//Quit closes all associated pages tabs and windows
		
		
		//What if we wanted to use Firefox?
		WebDriver driverFirefox = new FirefoxDriver();
		driverFirefox.get("https://rahulshettyacademy.com");
		
		System.out.println(driverFirefox.getTitle());
		System.out.println(driverFirefox.getCurrentUrl());
		driverFirefox.quit();
		
		
		//What if we wanted to use Firefox?
		WebDriver driverEdge = new EdgeDriver();
		driverEdge.get("https://rahulshettyacademy.com");
		
		System.out.println(driverEdge.getTitle());
		System.out.println(driverEdge.getCurrentUrl());
		driverEdge.quit();
		
		System.out.println("program complete.");

	}

}
