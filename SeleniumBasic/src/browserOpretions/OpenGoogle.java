package browserOpretions;

import org.openqa.selenium.chrome.ChromeDriver;

public class OpenGoogle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".\\executable\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		String sourceCode=driver.getPageSource();
		System.out.println("Application source code: "+sourceCode);
		System.out.println("Source code length: "+sourceCode.length());
		System.out.println("Application current URL:"+driver.getCurrentUrl());
		System.out.println("Application current title:"+driver.getTitle());
		if (driver.getTitle().equals("Google")) {
			System.out.println("Google search page open succesfully");
		}else {
			System.out.println("Either google search page not opened or it is title got changed ");
		}
		driver.close();

	}

}
