package testngpack;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag7 {
  @Test(invocationCount = 10)
  public void f() {
	  Reporter.log("Create and delete user",true);
  }
}
