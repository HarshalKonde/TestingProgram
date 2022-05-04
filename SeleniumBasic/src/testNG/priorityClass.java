package testNG;

import org.testng.annotations.Test;

public class priorityClass {
  @Test(priority=1)
  public void Login() {
	  System.out.println("Hello,I am From Login class...");
  }
  
  @Test(priority=2)
  public void sendEmail() {
	   System.out.println("Hello,I am from Mail class..");
  }
  
  @Test(priority=3)
  public void LogOut() {
	  System.out.println("Hello,I am From LogOut Class..");
  }
}
/**
   By Default each @Test has priority as 0
   lowest priority will get executed first
*/
