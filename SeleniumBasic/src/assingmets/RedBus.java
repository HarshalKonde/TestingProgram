package assingmets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.SeleniumUtility;

public class RedBus {

	public static void main(String[] args) {

		SeleniumUtility s1 = new SeleniumUtility();
		WebDriver driver=s1.setUp("chrome", "https://www.redbus.in/");
		WebDriverWait wait=new WebDriverWait(driver,20);
		
		driver.findElement(By.id("src")).sendKeys("Pune");
		WebElement src=driver.findElement(By.cssSelector(".homeSearch>*:nth-child(2)"));
		wait.until(ExpectedConditions.elementToBeClickable(src));
		src.click();
		
		driver.findElement(By.id("dest")).sendKeys("Mumbai");
		WebElement dest=driver.findElement(By.cssSelector(".homeSearch>*:nth-child(2)"));
		wait.until(ExpectedConditions.elementToBeClickable(dest));
		src.click();
		
		driver.findElement(By.id("onward_cal")).click();
		driver.findElement(By.cssSelector(".next>button")).click();
		driver.findElement(By.cssSelector(".rb-monthTable>tbody>*:nth-child(4)>*:nth-child(3)")).click();
		
		driver.findElement(By.id("search_btn")).click();
		
		driver.findElement(By.xpath("//div[div[text ()='DEPARTURE TIME']]/ul[1]/li[1]/lable[1]")).click();
		
		
		
	}
}
