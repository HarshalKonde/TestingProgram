package assingmets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilities.SeleniumUtility;

public class LoginSudekoPage {

	public static void main(String[] args) {
		SeleniumUtility s1 = new SeleniumUtility();
		
		WebDriver driver = s1.setUp("chrome", "https://www.saucedemo.com/");
		
		driver.findElement(By.id("username")).sendKeys("standard_user");
		driver.findElement(By.name("pwd")).sendKeys("secret_sauce");
		
	}

}
