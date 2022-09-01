package AssignmentLocator;

import java.time.Duration;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RemoveDuplicates1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/Shree/Desktop/.html%20file/singleselectdropdown.html");
		WebElement dropdown = driver.findElement(By.id("menu"));
		Select sel = new Select(dropdown);
		List<WebElement> ops = sel.getOptions();
		LinkedHashSet<String> s = new LinkedHashSet<String>();
		for(int i=0;i<ops.size();i++)
		{
			String textinsert=ops.get(i).getText();
			s.add(textinsert);
		}
		for(String textString:s)
		{
			System.out.println(textString);
		}

	}

}
