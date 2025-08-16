package Introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropDown {
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise");
		
		// //a[@value='BLR'] -> xpath for Bengaluru
		
		// //a[@value='MAA'] -> xpath for Chennai
		
		//In this situation when you have two drop downs, both will create elements that you can click
		//So when you go to search for an element, it may show up in both menus if both lists have been loaded
		//We need to tell selenium to use the second result when we are trying to click on our arrival airport
		
		//a[@value='MAA'][2] -> xpath for Chennai
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//div[@id=\'ctl00_mainContent_ddl_originStation1_CTNR\'] //a[@value='BLR']")).click();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("Interrupted Exception");
		}
		
		driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
		driver.findElement(By.xpath("//div[@id=\'ctl00_mainContent_ddl_destinationStation1_CTNR\'] //a[@value='MAA']")).click();
	}
}
