package Introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class UpdatedDropdown {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise");
		
		WebElement seniorCitizenDiscount = driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']"));
		Assert.assertFalse(seniorCitizenDiscount.isSelected());
		seniorCitizenDiscount.click();
		Assert.assertTrue(seniorCitizenDiscount.isSelected());
		
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "1 Adult");
		driver.findElement(By.id("divpaxinfo")).click();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("Interrupted Exception");
		}
		
		for(int i = 1; i < 5; i++)
		{
			driver.findElement(By.id("hrefIncAdt")).click();
		}
		
		driver.findElement(By.id("btnclosepaxoption")).click();
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
		
		driver.quit();

	}
	

}
