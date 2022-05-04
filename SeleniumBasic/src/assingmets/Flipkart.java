package assingmets;

import org.openqa.selenium.WebDriver;
import utilities.SeleniumUtility;

public class Flipkart {

	public static void main(String[] args) {
//		launch browser
//		System.setProperty("webdriver.chrome.driver", "executable\\chromedriver.exe");
//		ChromeDriver driver=new ChromeDriver();
//		
//      maximize window size
//		driver.manage().window().maximize();
//		
//	    implict wait
//		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
//		
//		get url
//		driver.get("www.Flipkart.com");
//		

//		Here we can not write lengthy code we can direct create SeleniumUtility package on work do
		
		SeleniumUtility s1=new SeleniumUtility ();
		WebDriver driver = s1.setUp("firefox", "https://www.flipkart.com/");
		

	}

}
