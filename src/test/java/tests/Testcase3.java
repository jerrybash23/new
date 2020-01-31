package tests;

import org.testng.annotations.Test;

import generics.BaseTest;
import generics.ExcelData;
import pages.Loginpage3;

public class Testcase3 extends BaseTest
{
  @Test
  public void Login()
{
   String un = ExcelData.getData(file_path, "TC1", 2, 0);
   String pw = ExcelData.getData(file_path, "TC1", 2, 1);
   
   Loginpage3 lp=new Loginpage3(driver);
   lp.EnterUsername(un);
   lp.EnterPassword(pw);
   lp.LoginBtn();
}
}