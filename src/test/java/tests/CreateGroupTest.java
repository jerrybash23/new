package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import generics.BaseTest;
import generics.ExcelData;
import pages.LoginPage;

public class CreateGroupTest extends BaseTest
{
    @Test
	public void CreatenewGroup() throws InterruptedException 
     {
    	 String un = ExcelData.getData(file_path, "TC1", 0, 0);
    	 String pw = ExcelData.getData(file_path, "TC1", 0, 1);
    	 String gp=  ExcelData.getData(file_path, "TC1", 0, 3);
    	 String nt = ExcelData.getData(file_path, "TC1", 0, 4);
    	 LoginPage lp = new LoginPage(driver);
    	 lp.EnterUserName(un);
    	 Thread.sleep(2000);
    	 lp.EnterPassword(pw);
    	 lp.ClickOnConnectionButton();
    	 lp.ClickUsersGroups();
    	 lp.ClickNewgroup();
    	 lp.EnterGrpName(gp);
    	 lp.EnterNote(nt);
    	 lp.ClickCreateBt();
    	
    	 Thread.sleep(5000);
    	
    	 
    	 
     }
}
