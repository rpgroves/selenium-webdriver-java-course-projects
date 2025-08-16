package Introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropDown {
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise");
		
		//dropdown with select tag
		//select tag means that we have a static drop down
		Select dropdown = new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		dropdown.selectByIndex(3);
		//get the text representation of the selected option
		System.out.println(dropdown.getFirstSelectedOption().getText());
		
		//select an option based on the text users can see
		dropdown.selectByContainsVisibleText("AED");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		
		//select an option based on the 'value' html attribute of the element
		dropdown.selectByContainsVisibleText("INR");
		System.out.println(dropdown.getFirstSelectedOption().getText());

	}
}
