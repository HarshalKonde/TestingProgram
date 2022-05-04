package assingmets;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChromeBrowser {

	public static void main(String[] args) {
//		launch the Chrome browser
		String path=".\\executable\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		ChromeDriver driver=new ChromeDriver();
		
//      open Actitime url
		driver.get("https://demo.actitime.com/");
		
		String title=driver.getTitle();
		System.out.println("Application title:"+driver.getTitle());
		System.out.println("Application Title lenght:"+title.length());
		if (driver.getTitle().equals("Actime")) {
			System.out.println("Actime search page opened succesfully");
		}else {
			System.out.println("Either Actime search page not opened or it is title got changed ");
		}
		String sourceCode=driver.getPageSource();
		System.out.println("Application Source lenght:"+sourceCode.length());
		System.out.println("Application page lenght:"+driver.getPageSource());
//		driver.close();
		
		



	}

}
