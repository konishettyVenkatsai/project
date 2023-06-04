package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\Eclipse\\drivers\\chromedriver_win32\\chromedriver");
	      WebDriver driver= new ChromeDriver();
	      driver.get("https://www.flipkart.com/");
	}

}
