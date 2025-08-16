package Introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowActivities {
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//waits for all components to fully load on a page
		driver.get("https://google.com");
		
		//does not wait for all components
		driver.navigate().to("https://rahulshettyacademy.com");
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("Interrupted Exception");
		}
		
		//goes back a page
		driver.navigate().back();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("Interrupted Exception");
		}
		
		//goes forward a page
		driver.navigate().forward();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("Interrupted Exception");
		}
		
		driver.quit();
	}
}
