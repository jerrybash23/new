package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics.BasePage;

public class Loginpage4 extends BasePage
{
	
	public Loginpage4(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="user-name")
	private WebElement usernameTB;
	@FindBy(id="password")
	private WebElement Passwordbtn;
	@FindBy(xpath="//input[@type='submit']")
	private WebElement LoginBtn;

	
	
	public void Username(String un)
	{
		usernameTB.sendKeys(un);
	}
	public void EnterPassword(String pw)
	{
		Passwordbtn.sendKeys(pw);
	}
	public void Login()
	{
		LoginBtn.submit();
	}
}


