package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.SeleniumUtility;

public class param10 {
  @Test
  public void loginLogoutInActitimeApplication() {
	  
	  SeleniumUtility  su = new SeleniumUtility();
	  WebDriver driver = su.setUp("chrome", "https://demo.actitime.com/login.do");
	  System.out.println("Before login page Title:"+driver.getTitle());
	  
	  WebElement usernameInputField = driver.findElement(By.id("username"));
	  usernameInputField.sendKeys("admin");
	  
	  driver.findElement(By.name("pwd")).sendKeys("manager");
	  driver.findElement(By.id("loginButton")).click();
	  
	  WebElement logoutBtn = driver.findElement(By.linkText("Logout"));
	  
	  WebDriverWait wait = new WebDriverWait(driver,20);
	  wait.until(ExpectedConditions.elementToBeClickable(logoutBtn));
	  
	  System.out.println("After login page:"+driver.getTitle());
	  
	  logoutBtn.click();
	  
//	  Assert.assertEquals(driver.getTitle(),"actiTIME - Login");
	  Assert.assertEquals(driver.getTitle(), "actiTIME - Login", "Either logout is not done or login page title got changed");

	  driver.close();
  }
}
