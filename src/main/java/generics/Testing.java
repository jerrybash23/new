package generics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

public class Testing {

	public static void main(String[] args) throws InterruptedException
	{
		
         System.setProperty("webdriver.chrome.driver", ".\\src\\main\\resources\\Drivers\\chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	     driver.get("https://www.saucedemo.com/index.html");
	     Thread.sleep(2000);
	     driver.findElement(By.id("user-name")).sendKeys("standard_user");
	     Thread.sleep(2000);
	     driver.findElement(By.id("password")).sendKeys("secret_sauce");
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("//input[@type='submit']")).click();
	     String title = driver.getTitle();
	     Reporter.log(title, true);
	     driver.close();
         }
	}

