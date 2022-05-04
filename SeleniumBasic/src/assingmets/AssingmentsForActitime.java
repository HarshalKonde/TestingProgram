package assingmets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssingmentsForActitime {

	public static void main(String[] args) {
//		launch chrome browser
//		System.setProperty("webdriver.chrome.driver", "executable\\chromedriver.exe");
		
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
//		open url
		driver.get("https://demo.actitime.com/");
		
//	    get page title name and title length
		String title=driver.getTitle();
		System.out.println("Application Title name:"+driver.getTitle());
		System.out.println("Application Title length:"+title.length());
		
//		verify page
	    System.out.println("Current Url is:"+driver.getCurrentUrl() );
	    
//	    enter valid username and password
	    WebElement  userNameInputField=driver.findElement(By.id("username"));
	    userNameInputField.sendKeys("admin");
	    
	    WebElement passwordInputField=driver.findElement(By.name("pwd"));
	    passwordInputField.sendKeys("manager");
	    
//	    click on login button
	    WebElement loginButton=driver.findElement(By.id("loginButton"));
		loginButton.click();	
		
		
		
//		close the browser
		driver.close();
		
	
	}

}
