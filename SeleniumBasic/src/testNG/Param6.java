package testNG;

import org.testng.annotations.Test;

public class Param6 {
  @Test(dependsOnMethods="signIn",enabled=true)
  public void login() {
	  System.out.println("Hello, I am login class..");
  }
  
  @Test(dependsOnMethods="login",enabled=true,timeOut=2000)
  public void checkNotification() {
	    System.out.println("Hello, I am from checkNotification from Exmple param class...");
	    try {
	    	  Thread.sleep(2500);
	    } catch(InterruptedException e) {
	    	e.printStackTrace();
	    }
  }
  
  @Test(enabled=true,expectedExceptions=ArithmeticException.class)
  public void sigin() {
	  System.out.println("Hello I am from sigIn class..");
	  int i = 10/0;
  }
}
