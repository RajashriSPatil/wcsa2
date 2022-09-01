package testngpack;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class FirstTestngpack {
  @Test
  public void method1() {
	  Reporter.log("method 1 executed",true);
  }
  public void method2() {
	  Reporter.log("method 2 executed",true);
  }
  @Test
  public void method3() {
	  Reporter.log("method 3 executed",true);
  }
  @Test
  public void method4() {
	  int n=9;
	  int m=0;
	  int res=n/m;
	  System.out.println(res);
  }
  
}
