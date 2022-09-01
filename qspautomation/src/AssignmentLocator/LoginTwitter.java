package AssignmentLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTwitter {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.twitter.com/");
		driver.findElement(By.className("css-901oao css-16my406 r-poiln3 r-bcqeeo r-qvutc0")).sendKeys(Keys.ENTER);

	}

}
