package assingmets;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.SeleniumUtility;

public class OpencartRegistration {

	public static void main(String[] args) {
		SeleniumUtility s1 = new SeleniumUtility();
		
		WebDriver driver = s1.setUp("chrome", "https://demo.opencart.com/index.php?route=account/registration");
		WebElement  driverobject = driver.switchTo().activeElement();
	}

}
