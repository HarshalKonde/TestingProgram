package assingmets;

import org.openqa.selenium.chrome.ChromeDriver;

public class Assignement3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "executable\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.Google.com/");
		System.out.println("Appliaction current url:"+driver.getCurrentUrl());
		System.out.println("Appliaction current source page:"+driver.getPageSource());
		driver.close();

	}

}
