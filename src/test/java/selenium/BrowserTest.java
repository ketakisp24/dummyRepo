package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserTest {

	public static void main(String[] args) {
		
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"/driver/chrome/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();		
		driver.get("https://www.seleniumhq.org/");
		
		
		
	}
}
