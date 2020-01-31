package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics.BasePage;

public class Loginpage3 extends BasePage
{

	@FindBy(id="user-name")
	private WebElement Username;
	@FindBy(id="password")
	private WebElement Password;
	@FindBy(xpath="//input[@type='submit']")
	private WebElement Login;

	public Loginpage3(WebDriver driver) 
	{
		super(driver);
		PageFactory.initElements(driver, this);
		
	}
	
	public void EnterUsername(String un) 
	{
		Username.sendKeys(un);
	}
	public void EnterPassword(String pw)
	
	{
		Password.sendKeys(pw);
	}
	public void LoginBtn()
	{
		Login.submit();
	}
}
