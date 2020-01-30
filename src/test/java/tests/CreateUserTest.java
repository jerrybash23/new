package tests;


import org.testng.annotations.Test;

import generics.BaseTest;
import generics.ExcelData;

public class CreateUserTest extends BaseTest
{
	@Test
	public void CreatenewGroup() throws InterruptedException 
     {
    	 String un = ExcelData.getData(file_path, "TC1", 0, 0);
    	 String pw = ExcelData.getData(file_path, "TC1", 0, 1);
}
}