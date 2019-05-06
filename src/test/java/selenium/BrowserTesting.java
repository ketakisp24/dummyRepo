package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserTesting {
        public static void main(String args[]){
        	String projectPath = System.getProperty("user.dir");
        	System.setProperty("Webdriver.chrome.driver", projectPath+"/driver/chrome/chromedriver.exe");
        	WebDriver driver = new ChromeDriver();
        	driver.get("https://seleniumhq.org/");
        	
        }
}
