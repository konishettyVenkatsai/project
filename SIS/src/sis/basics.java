package sis;

import java.awt.Dimension;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class basics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// invoking the browser
				// chrome - chrome driver -> methods
				// firefox -gecko driver -> methods
				
				//chromedriver.exe -> chrome browser
				System.setProperty("webdriver.chrome.driver", "F:\\Eclipse\\drivers\\chromedriver_win32\\chromedriver.exe");
				
		      WebDriver driver= new ChromeDriver();
		      
		      driver.get("https://smax-staging.smax5.com/dpc/#/authentication/signin");
		      
		      
		      
		      //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		      
		      driver.navigate().refresh();
		      //Thread.sleep(5000);
		      
		      
		      String s=driver.getTitle();
		      System.out.println(s);
		      
		      String url =driver.getCurrentUrl();
		      System.out.println(url);
		      
		    
		      
		     // driver.findElement(By.id("mat-input-0")).sendKeys("kadheer");  
		      driver.findElement(By.cssSelector("input[id='mat-input-0']")).sendKeys("kadheer");
		      //Thread.sleep(5000);
		      
		      driver.findElement(By.id("mat-input-1")).sendKeys("Missis");
		      driver.findElement(By.xpath("/html/body/app-root/app-auth-layout/app-signin/div/div[1]/div[3]/div/div/div/form/div[2]/div/mat-form-field/div/div[1]/div[4]/a/mat-icon")).click();
		      //Thread.sleep(5000);
		       
		      driver.findElement(By.xpath("//Button[@type='submit']")).click();
		      
		     // String d=driver.getPageSource();
		      //System.out.println(d);
		      
		      driver.manage().window().maximize();
		      //Thread.sleep(10000);
		      
		  	driver.findElement(By.linkText("College Set Up")).click();
		     // Thread.sleep(5000);
		      
		      driver.findElement(By.linkText("Classrooms")).click();
		    //  Thread.sleep(5000);
		      driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-classroom/section/div/div[2]/div/div/div/div/div[1]/div/div[2]/ul/li[1]/div/button/span[1]/mat-icon")).click();
		     /*WebElement w=driver.findElement(By.id("mat-option-13"));
		     Select s1= new Select(w);
		     s1.selectByValue("College Premises");*/
		      driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-addeditclassroom/section/div/div[2]/div/div/div/div[2]/form/div[1]/mat-form-field/div/div[1]/div[3]")).click();
		     // Thread.sleep(5000);
		      driver.findElement(By.xpath("//*[@id=\"mat-option-3\"]/span")).click();
		      //Thread.sleep(5000);
		     
		     
		     driver.navigate().back();
		      //Thread.sleep(5000);
		      
		      driver.navigate().forward();
		    //  Thread.sleep(5000);
		      
		      driver.close();
	}

}
