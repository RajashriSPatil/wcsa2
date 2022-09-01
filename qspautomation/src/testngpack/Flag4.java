package testngpack;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag4 {
  @Test
  public void actiTimeLogin() {
	  Reporter.log("login succesful",true);
  }
  @Test(dependsOnMethods = "actiTimeLogin")
  public void actiTimeCreateUser() {
	  Reporter.log("Create user",true);
  }
  @Test(dependsOnMethods = "actiTimeCreateUser")
  public void actiTimeLogout() {
	  Reporter.log("logout succesful",true);
  }
}
