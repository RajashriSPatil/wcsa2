package AssignmentLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginFacebook {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("facebook.com");
		driver.findElement(By.id("email")).sendKeys("Rajashri");
		driver.findElement(By.id("pass")).sendKeys("rajshri");
		driver.findElement(By.id("u_0_5_W9")).click();

	}

}
