package assingmets;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.SeleniumUtility;

public class ActitimeLoginWithKeyboardApp {

	public static void main(String[] args) {
		
		SeleniumUtility s1=new SeleniumUtility();
		WebDriver driver=s1.setUp("chrome", "https://demo.actitime.com/login.do");
		WebElement activeObject=driver.switchTo().activeElement();
		driver.findElement(By.id("username")).sendKeys("admin",Keys.TAB);
		driver.findElement(By.name("pwd")).sendKeys("manager",Keys.ENTER);
//		
//		WebElement firstName=driver.findElement(By.cssSelector("input[placeholder='First Name']"));
//		
//		firstName.sendKeys("admin",Keys.chord(Keys.CONTROL,"a"));
//		firstName.sendKeys(Keys.chord(Keys.CONTROL,"c"));
//		
//		driver.findElement(By.cssSelector("input[placeholder='Last Name']")).sendKeys(Keys.chord(Keys.CONTROL,"v"));
		
//		driver.findElement(By.cssSelector("body")).sendKeys(Keys.ESCAPE);
		
	}

}
