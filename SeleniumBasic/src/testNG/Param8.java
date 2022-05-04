package testNG;

import org.testng.annotations.Test;

public class Param8 {
  @Test
  public void testCase3()throws InterruptedException {
	  Thread.sleep(2000);
	  System.out.println("Hello, I am TC3 from example3 class");
  }
}
