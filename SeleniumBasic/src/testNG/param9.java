package testNG;

import org.testng.annotations.Test;

public class param9 {
  @Test
  public void TestCase8() {
	  displayDetails();
	  System.out.println("Hello, I am TC7 Class..");
  }
  
  @Test
  public void TestCase7() {
	   System.out.println("Hello,I am From Test case 8...");
  }
      void displayDetails() {
	  System.out.println("Hello,I am From display method...");
  }
  
}
/**
if testng class contains more dn one test method dn all the test method will be executed in
alphabetical order
*/