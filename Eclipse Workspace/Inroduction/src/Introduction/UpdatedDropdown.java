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

	}
	

}
