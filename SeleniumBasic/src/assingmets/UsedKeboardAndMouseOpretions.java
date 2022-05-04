package assingmets;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.SeleniumUtility;

public class UsedKeboardAndMouseOpretions {

	public static void main(String[] args) {
		SeleniumUtility s1=new SeleniumUtility();
		WebDriver driver = s1.setUp("chrome", "http://demo.automationtesting.in/Register.html");
		
	    WebElement firstName=driver.findElement(By.cssSelector("input[placehorder='first name']"));
        firstName.sendKeys("admin",Keys.chord(Keys.CONTROL,"a"));
         
       
	    
		
	}

}
