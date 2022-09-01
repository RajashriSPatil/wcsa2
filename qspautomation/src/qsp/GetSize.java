package qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSize {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.get("https://www.facebook.com");
	   WebElement but = driver.findElement(By.name("login"));
	   Dimension size = but.getSize();
	   int h = size.getHeight();
	   int w = size.getWidth();
	   System.out.println(h);
	   System.out.println(w);
	   

	}

}
