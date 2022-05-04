package testNG;

import org.testng.annotations.Test;

public class EnabledClass {
  @Test(dependsOnMethods="signIn",enabled=true)
  public void login() {
	  System.out.println("I am from Login Example");
  }
  
  @Test(dependsOnMethods="login",enabled=true)
  public void checknotifications() {
	   System.out.println("I am from LogOut Example");
  }
  
  @Test(enabled=true)
  public void signIn() {
	  System.out.println("I am From SigIn Example");
	  int i=10/5;
  }
}
