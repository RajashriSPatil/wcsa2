package qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocation {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.get("https://www.facebook.com");
	    WebElement but = driver.findElement(By.name("login"));
	    Point loc = but.getLocation();
	    int xaxis = loc.getX();
	    int yaxis = loc.getY();
	    System.out.println(xaxis);
	    System.out.println(yaxis);

	}

}
