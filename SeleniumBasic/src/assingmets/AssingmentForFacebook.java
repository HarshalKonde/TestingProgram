package assingmets;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssingmentForFacebook {

	public static void main(String[] args) {
//		launchBrowser
//      System.setProperty("wedriver.chrome.driver", "executable\\chromedriver.exe");
//      or using one method so we will not write path,exe
		WebDriverManager.chromedriver().setup();
		FirefoxDriver driver = new FirefoxDriver();

//      get url
		driver.get("https://www.gsmarena.com/xiaomi-phones-80.php");
//            
//      click on realme phone
		List<WebElement> paginationLinks = driver.findElements(By.xpath("//div[@class='nav-pages']/a"));
		System.out.println(paginationLinks.size());
		for (int i = 0; i < paginationLinks.size(); i++) {
			System.out.println(paginationLinks.get(i).getText());
		}
	}

}
