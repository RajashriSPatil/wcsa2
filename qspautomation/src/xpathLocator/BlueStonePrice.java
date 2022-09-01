package xpathLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BlueStonePrice {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/");
		Thread.sleep(3000);
		driver.findElement(By.name("search_query")).sendKeys("bangles");
		driver.findElement(By.name("submit_search")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//img[@class='hc img-responsive center-block'])[1]"));
		WebElement priceOfBangles = driver.findElement(By.xpath("(//img[@class='hc img-responsive center-block'])[1]/ancestor::div[@class='inner pd-gray-bg']/descendant::a[@id='pid_33419']"));
		System.out.println("Price of bangles:"+priceOfBangles);
		
		

	}

}
