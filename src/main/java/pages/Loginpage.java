package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics.BasePage;
import generics.BaseTest;

public class Loginpage extends BasePage

{
  @FindBy(id="user-name")
  private WebElement unTB;
  @FindBy(id="password")
  private WebElement pwTB;
  @FindBy(xpath="//input[@type='submit']")
  private WebElement Login;
  
  
	public Loginpage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
		
	}
	
	public void EnterUsername(String un)
	{
		unTB.sendKeys(un);
	}

  public void EnterPassword(String pw)

{
	pwTB.sendKeys(pw);
}
  
  public void LoginBtn()
  {
	  Login.click();
  
  }
}
