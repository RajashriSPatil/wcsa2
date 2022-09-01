package methodsOfWebdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsByForEach {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("Bike");
		Thread.sleep(3000);
		List<WebElement> WebElementSuggessions = driver.findElements(By.xpath("//div[@class='wM6W7d']/span"));
		for(WebElement sugg: WebElementSuggessions)
		{
		  String textOfWebElement = sugg.getText();	
		  System.out.println(textOfWebElement);
		}
	}
			
			

	

}
