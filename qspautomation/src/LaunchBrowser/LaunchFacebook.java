package LaunchBrowser;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchFacebook {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();//open chromebrowser
		driver.manage().window().maximize();//maximize 
		driver.get("https://www.facebook.com");
		Thread.sleep(5000);
		driver.close();

	}

}
