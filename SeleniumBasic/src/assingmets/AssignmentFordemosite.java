package assingmets;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AssignmentFordemosite {

	public static void main(String[] args) {
//		launch the firefoxBrowser
		System.setProperty("webdriver.gecko.driver", "executable\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		
//		Implicit wait
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
//		get page demosite
		driver.get("https://demosite.executeautomation.com/Login.html");
		
//		title name and title length
		String title=driver.getTitle();
		System.out.println("Application Title Name:"+driver.getTitle());
		System.out.println("Application Title length:"+title.length());
		
//		verify page 
		System.out.println("Application url:"+driver.getCurrentUrl());
		
		
//		enter valid username and password
		WebElement userNameInputField=driver.findElement(By.id("username"));
		userNameInputField.sendKeys("excecution");
		
		WebElement passwordInputField=driver.findElement(By.name("password"));
		passwordInputField.sendKeys("admin");
		
//		click on login btn
		WebElement loginButton=driver.findElement(By.id("LoginButton"));
		loginButton.click();
//		driver.findElement(By.id("loginButton")).click();
		
//		click on logout btn
//		driver.findElement(By.linkText("Logout")).click();
		driver.findElement(By.id("logoutLink")).click();
		
//		close the browser
		driver.close();

	}

}
