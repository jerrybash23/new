package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics.BasePage;

public class AdminPage extends BasePage
{
    @FindBy (id="username")
	private WebElement unTB;
   @FindBy(id="password")
    private WebElement pwTB;
   @FindBy(xpath = "//input[@type='submit']")
   private WebElement connectionBT;
   
	public AdminPage(WebDriver driver) 
	{
		super(driver);
		PageFactory.initElements(driver, this);
		
	}
	public void EnterUserName(String un)
		{
			unTB.sendKeys(un);
		}
	public void EnterPassword(String pw)
	{
		pwTB.sendKeys(pw);
	}
	public void ClickOnConnectionButton()
	{
		connectionBT.submit();
	}

}
