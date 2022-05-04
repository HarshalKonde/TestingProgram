package testNG;

import org.testng.annotations.Test;

public class TrueFlaseClass {
  @Test(enabled=true)
  public void param1() {
	  System.out.println("I am From True Class..");
  }
  
  @Test(enabled=true)
	public void param2() {
	  System.out.println("I am From True Class..");
  }
// ignore this class
  @Test(enabled=false)
  public void param3() {
	  System.out.println("I am From False Class..");
  }
}
/**
By default for each @Test enabled will set as enabled=true
enabled=true---> consider for execution
enabled=false---> don;t consider for execution
*/
