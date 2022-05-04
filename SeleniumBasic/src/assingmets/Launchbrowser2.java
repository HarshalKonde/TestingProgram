package assingmets;

import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Launchbrowser2 {

	public static void main(String[] args) {
//		String path=".\\executable\\geckodriver.exe";
//        System.setProperty("webdriver.gecko.driver",".\\executable\\geckodriver.exe");
		WebDriverManager.firefoxdriver().setup();
        FirefoxDriver driver=new FirefoxDriver();
        driver.get("https://www.facebook.com/");
        String title=driver.getTitle();
        String actualTitle = driver.getTitle();
        String expectedTitle = "facebook";
        System.out.println("Appplication of title:"+driver.getTitle());
        driver.close();
        

	}

}
