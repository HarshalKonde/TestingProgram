package browserOpretions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GenericWayToOpenFirefoxBrowser {

	public static void main(String[] args) {
		
		String path=".\\executable\\geckodriver.exe";
		
		System.setProperty("webdriver.gecko.driver", path);
		WebDriver driver = new FirefoxDriver();


		
	}

}
