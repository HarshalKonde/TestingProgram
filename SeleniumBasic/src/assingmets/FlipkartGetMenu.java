package assingmets;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.SeleniumUtility;

public class FlipkartGetMenu {

	public static void main(String[] args) {
		SeleniumUtility s1 = new SeleniumUtility();
		
//		get url
        WebDriver driver= s1.setUp("firefox", "https://www.flipKart.com/");
        
//      explicitly wait
    	WebDriverWait wait=new WebDriverWait(driver,20);
    	
//      popup handle using ESCAPE
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.ESCAPE);
		
//     ciricinfo 
		
//		WebDriver driver = s1.setUp("chrome", "https://www.espncricinfo.com/");
//		
////		handle popup
//		driver.findElement(By.cssSelector("body")).sendKeys(Keys.ESCAPE);
		
        
	}

}
