package testngpack;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class OrangeHRMAssertion {
	WebDriver driver;
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	@Test
	public void orangeHRMTest() {
		String loginPageTitle = driver.getTitle();
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(loginPageTitle,"Login");
		Reporter.log("Login page title is verified");

		boolean usernameTextbox = driver.findElement(By.name("username")).isDisplayed();
		assertEquals(usernameTextbox,true);
		Reporter.log("username textbox is displayed",true);
		driver.findElement(By.name("username")).sendKeys("Admin");

		boolean passwordTextbox = driver.findElement(By.name("password")).isDisplayed();
		Assert.assertEquals(passwordTextbox,true);
		Reporter.log("password textbox is displayed");
		driver.findElement(By.name("password")).sendKeys("admin123");

		boolean loginButton = driver.findElement(By.xpath("//button[text()=' Login ']")).isDisplayed();
		Assert.assertEquals(loginButton,true);
		Reporter.log("loginbutton is displayed",true);
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();
		sa.assertAll();
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
