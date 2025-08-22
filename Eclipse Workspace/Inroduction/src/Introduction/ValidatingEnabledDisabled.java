package Introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ValidatingEnabledDisabled {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise");
		
		WebElement seniorCitizenDiscount = driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']"));
		Assert.assertFalse(seniorCitizenDiscount.isSelected());
		seniorCitizenDiscount.click();
		Assert.assertTrue(seniorCitizenDiscount.isSelected());

		//System.out.println(driver.findElement(By.name("ct100$mainContent$view_date2")).isEnabled());
		//driver.findElement(By.id("ct100_mainContent_rbth1_Trip_1")).click();
		//System.out.println(driver.findElement(By.name("ct100$mainContent$view_date2")).isEnabled());
		//These both return true because the button can still be clicked, the only thing changing about
		//The button is the opacity, so we can instead check the opacity
		
		System.out.println(driver.findElement(By.name("ct100$mainContent$view_date2")).getAttribute("style"));
		driver.findElement(By.id("ct100_mainContent_rbth1_Trip_1")).click();
		System.out.println(driver.findElement(By.name("ct100$mainContent$view_date2")).getAttribute("style"));

	}

}
