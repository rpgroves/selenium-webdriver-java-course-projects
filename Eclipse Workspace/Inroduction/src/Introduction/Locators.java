package Introduction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		
		//In Selenium, the main locaters we can use are as follows:
		//ID
		//Xpath
		//CSS Selector
		//name
		//Class Name
		//Tag Name
		//Link Text
		//Partial Link Text
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("inputUsername")).sendKeys("Rylee Groves");
		driver.findElement(By.name("inputPassword")).sendKeys("secretPass123!");
		
		//When locating the button, there is the class "submit signInBtn" a space means that this
		//element has two classes that we can search for, submit and signinbtn
		driver.findElement(By.className("signInBtn")).click();
		
		//Xpath and CSS Selector are different from the other locators
		//you need to construct from the HTML code, you cant find them 1 to 1 like "inputUsername"
		
		//CSS Selector:
		//Class name -> tagname.classname
		//ID -> tagname#id -> input#inputUsername in this case
		//Tagname[attribute='value']
		
		//if you had <input type="text" placeholder="Username" value=" ">
		//then you can use Input[placeholder='Username'] to be a *unique* identifier since it didnt have an ID
		
		//The error takes a few seconds to show up, so we need to wait to check, there are a few options
		//Implicit wait - 5 seconds for instance, program continues if the element is identified, times out after 5 seconds.
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//Since we have tag and class we can do the following in this situation:
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		
		
		driver.findElement(By.linkText("Forgot your password?")).click();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("Interrupted Exception");
		}
		
		//Xpath -> //tagname[@attribute='value']
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Rylee Groves");
		
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("wrongEmail@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Email']")).clear();
		//This uses an xpath selector that has duplicate entries, adding [2] selects the second entry!
		//This is called the indexing method. This is not a valid css method
		//If we wanted to use CSS: input[type='text']:nth-child(2)
		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("correctEmail@gmail.com");
		
		//You can also find the children of an element and traverse through them to find the element you need.
		//for instance //form/h2 finds the header attached to a form, this gets you the "Forgot password" text
		//This helps you have selenium search for an element in a more constricted area of search, looking at
		//the children of an element raher than searching through all elements
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("123-456-7890");
		//The 3 finds the xpath number, in this case, he phone number field has xpath = 3
		
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());
		driver.findElement(By.className("go-to-login-btn")).click();
		
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("Interrupted Exception");
		}
		
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("Rylee Groves");
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.className("signInBtn")).click();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			System.out.println("Interrupted Exception");
		}
		
		driver.findElement(By.xpath("//*[text()='Log Out']")).click();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			System.out.println("Interrupted Exception");
		}
		
		driver.quit();
	}

}
