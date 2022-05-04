package browserOpretions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GenericWayToOpenChromeBrowser {

	public static void main(String[] args) {
    
		String path2=".\\executable\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path2);
		WebDriver driver=new ChromeDriver();


	}

}
