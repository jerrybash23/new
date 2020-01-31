package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import generics.BaseTest;
import generics.ExcelData;
import pages.Loginpage4;


public class TestCase4MainClass extends BaseTest
{
	
	@Test
	public void Login() throws InterruptedException
	
	{
		   String un = ExcelData.getData(file_path, "TC1", 3, 0);
		   String pw = ExcelData.getData(file_path, "TC1", 3, 1);
		
		Loginpage4 ts=new Loginpage4(driver);
		Thread.sleep(3000);
		ts.Username("performance_glitch");
		Thread.sleep(3000);
		ts.EnterPassword("secret_sauce");
		Thread.sleep(3000);
		ts.Login();
	}

}
