package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics.BasePage;

public class LoginPage extends BasePage
{
    @FindBy(id="username")
	private WebElement unTB;
    @FindBy(id="password")
    private WebElement pwTB;
    @FindBy(xpath="//input[@type='submit']")
    private WebElement connectionBT;
    @FindBy(xpath="//a[text()='Users & Groups']")
    private WebElement UsersGroups;
    @FindBy(xpath="//a[text()='New group']")
    private WebElement Newgroup;
    @FindBy(xpath="//input[@name='nom']")
    private WebElement grp;
    @FindBy(xpath="//textarea[@id='note']")
    private WebElement Notes;
    @FindBy(xpath="//input[@value='Create group']")
    private WebElement createButton;
    
	public LoginPage(WebDriver driver) 
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
	public void ClickUsersGroups()
	{
		UsersGroups.click();
	}
    public void ClickNewgroup()
    {
    	Newgroup.click();
    }
    public void EnterGrpName(String gp)
    {
    	grp.sendKeys(gp);
    }
    public void EnterNote(String nt)
    {
    	Notes.sendKeys(nt);
    }
    public void ClickCreateBt()
    {
    	createButton.click();  
    	}
}
