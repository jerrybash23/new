package tests;

import org.testng.Reporter;
import org.testng.annotations.Test;

import generics.BaseTest;
import generics.ExcelData;
import pages.Loginpage;

public class Testcase2 extends BaseTest

{
  @Test
  public void Logins() throws InterruptedException
  {
	 String un = ExcelData.getData(file_path, "TC1", 1, 0) ; 
	 String pw = ExcelData.getData(file_path, "TC1", 1, 1);
	
	 Loginpage lp=new Loginpage(driver);
	 Thread.sleep(2000);
	 lp.EnterUsername(un);
	 Thread.sleep(2000);
	 lp.EnterPassword(pw);
	 Thread.sleep(2000);
	 lp.LoginBtn();
	 Thread.sleep(2000);
	
	 
	 
	 
	 
	  
  }
}
