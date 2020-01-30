package tests;

import org.testng.annotations.Test;

import generics.BaseTest;
import generics.ExcelData;
import pages.AdminPage;

public class ValidLoginTest extends BaseTest
{
   @Test
   public void CreateGroupverfyGroup() throws InterruptedException
   {
	  String un = ExcelData.getData(file_path, "TC1", 0, 0);
	  String pw = ExcelData.getData(file_path, "TC1", 0, 1);
	  String title = ExcelData.getData(file_path, "TC1", 0, 2);
	  AdminPage ap = new AdminPage(driver);
	  ap.EnterUserName(un);
	  Thread.sleep(1000);
	  ap.EnterPassword(pw);
	  Thread.sleep(1000);
	  ap.ClickOnConnectionButton();
	  ap.VerifyTitle(title);
	  
   }
   
}
