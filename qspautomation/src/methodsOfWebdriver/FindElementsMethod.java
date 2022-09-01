package methodsOfWebdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
        driver.findElement(By.name("q")).sendKeys("Bike");
        Thread.sleep(3000);
        List<WebElement> WebElementSuggesssions = driver.findElements(By.xpath("//div[@class='wM6W7d']/span"));
        //with for loop
        for(int i=0;i<WebElementSuggesssions.size();i++)
        {
        	WebElement sugg = WebElementSuggesssions.get(i);
			String textOfSugg = sugg.getText();
			Thread.sleep(1000);
			System.out.println(textOfSugg);
			
        	
        	
        }
	}

}
