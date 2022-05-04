package assingmets;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Assingment {

	public static void main(String[] args) {
//		SeleniumUtility s1=new SeleniumUtility();
//		WebDriver driver = s1.setUp("chrome", "https://demo.actitime.com/");
		
//		launchBrowser
		WebDriverManager.chromiumdriver().setup();
		ChromeDriver driver=new ChromeDriver();
		
//		maximize 
		driver.manage().window().maximize();
		
//		implicit set time
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);	
//		get url
		driver.get("https://demo.actitime.com/");

//		Enter vaild username and password
		WebElement userNameInputField=driver.findElement(By.id("username"));
		userNameInputField.sendKeys("admin");
		
		WebElement passwordInputField=driver.findElement(By.name("pwd"));
		passwordInputField.sendKeys("manager");
		
		
//		click on login btn,
		WebElement loginButton=driver.findElement(By.id("loginButton"));
		loginButton.click();
		
//      click on task
		WebElement Tasks=driver.findElement(By.id("container_tasks"));
		Tasks.click();
		
//		click on new task
		WebElement m= driver.findElementByClassName("addNewButton");
		m.click();
		
//		create new customer
		WebElement n= driver.findElementByClassName("createNewTasks");
		n.click();
		
		WebElement h=driver.findElement(By.id("set deadline"));
		h.click();
		
//		click on dropdownbttn
		WebElement options=driver.findElement(By.cssSelector("dropdownButton"));
		options.click();
		
//	
//	
		driver.findElement(By.cssSelector("dropdownButton")).click();
		List<WebElement> select=driver.findElements(By.cssSelector("itemRow cpItemRow selected"));
		System.out.println(select.size());
		
		for(WebElement type:select)
		{
			if(type.getText().equals("Customer"))
			{
				type.click();
				break;
			}
		}
	}
		
}

	

