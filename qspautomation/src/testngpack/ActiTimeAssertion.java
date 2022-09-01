package testngpack;

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

public class ActiTimeAssertion {
	WebDriver driver;
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("http://desktop-msveu0r/login.do");

	}
	@Test
	public void actiTimeTest() throws InterruptedException {
		String loginPageTitle = driver.getTitle();
		SoftAssert sa = new SoftAssert();
		//softAssert
		sa.assertEquals(loginPageTitle,"actiTIME - Login");
		Reporter.log("Login Page Title is verified",true);
		//HardAssert
		boolean statusOfUsernameTextbox = driver.findElement(By.name("username")).isDisplayed();
		Assert.assertEquals(statusOfUsernameTextbox,true);
		Reporter.log("username textbox is displayed",true);
		driver.findElement(By.name("username")).sendKeys("admin");

		//........................................................................................
		//HardAssert
		boolean statusOfPasswordTextbox = driver.findElement(By.name("pwd")).isDisplayed();
		Assert.assertEquals(statusOfPasswordTextbox,true);
		Reporter.log("password textbox is displayed",true);
		driver.findElement(By.name("pwd")).sendKeys("manager");

		//........................................................................................
		//HardAseert
		boolean statusOfLoginButton = driver.findElement(By.id("loginButton")).isDisplayed();
		Assert.assertEquals(statusOfLoginButton,true);
		Reporter.log("loginButton is displayed",true);
		driver.findElement(By.id("loginButton")).click();

		//........................................................................................
		Thread.sleep(4000);
		String homePageTitle = driver.getTitle();
		sa.assertEquals(homePageTitle,"actiTIME - Enter Time-Track");
		Reporter.log("home page title is verified",true);
		Reporter.log("create user",true);
		Reporter.log("create reports",true);
		sa.assertAll();
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
