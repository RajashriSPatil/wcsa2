package testngpack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ActiTime {
  WebDriver driver;
  @Test
  @Parameters({"browser","username","password","url"})
  public void validLogin (String browser,String username,String password,String url) 
  {
	  if(browser.equalsIgnoreCase("chrome"))
	  {
	     System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 driver= new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		 driver.get(url);
		 driver.findElement(By.name("username")).sendKeys(username);
		 driver.findElement(By.name("pwd")).sendKeys(password);
		 driver.findElement(By.id("loginButton")).click();
	  }
		 
  else if(browser.equalsIgnoreCase("firefox"))
  {
	  System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		 driver= new FirefoxDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		 driver.get(url);
		 driver.findElement(By.name("username")).sendKeys(username);
		 driver.findElement(By.name("pwd")).sendKeys(password);
		 driver.findElement(By.id("loginButton")).click();
	  
  }
  else
  {
	  Reporter.log("enter the data",true);
  }
 }
}
