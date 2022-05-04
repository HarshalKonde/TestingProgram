package browserOpretions;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverClass {

	public static void main(String[] args) {
		
		String path=".\\executable\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", path);
		ChromeDriver cdriver = new ChromeDriver();
	}

}
