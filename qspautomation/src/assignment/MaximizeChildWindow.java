package assignment;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaximizeChildWindow {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://omayo.blogspot.com/");
		driver.findElement(By.xpath("//a[contains(text(),'Open')]")).click();
	    String parentHandle = driver.getWindowHandle();
		System.out.println(parentHandle);
		Set<String> allHandles = driver.getWindowHandles();
		for(String handle:allHandles)
		{
			driver.switchTo().window(handle);
			System.out.println(handle);
		}
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.close();
		
		

	}

}
