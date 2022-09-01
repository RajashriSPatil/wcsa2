package qsp;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("Bike");
		Thread.sleep(3000);
		List<WebElement> sugg = driver.findElements(By.xpath("//div[@class='pcTkSc']/ancestor::div[@class='aajZCb']"));
		for(int i=0;i<sugg.size();i++)
		{
			WebElement web = sugg.get(i);
			String text = web.getText();
			System.out.println(text);
		}
	}


}
