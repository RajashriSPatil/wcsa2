package qsp;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findElements2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("mobile");
		List<WebElement> list = driver.findElements(By.xpath("//div[@class='wM6W7d']/ancestor::div[@class='aajZCb']"));
		for(WebElement sugg:list)
		{
		     String text = sugg.getText();
		     System.out.println(text);
		}
		
	}

}
