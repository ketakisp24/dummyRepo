package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestingWeb1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String projectpath = System.getProperty("user.dir");
		System.out.println(projectpath);
		
		System.setProperty("WebDriver.cherome.driver", projectpath+"/driver/chrome/chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://seleniumhq.org/");

	}

}
