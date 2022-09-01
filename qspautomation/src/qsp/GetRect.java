package qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetRect {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.get("https://www.facebook.com");
	   WebElement but = driver.findElement(By.name("login"));
	  Rectangle rect = but.getRect();
	  System.out.println(rect.getHeight());
	  System.out.println(rect.getWidth());
	  System.out.println(rect.getX());
	  System.out.println(rect.getY());
	  
	}
}
	