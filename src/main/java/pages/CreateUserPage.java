package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import generics.BasePage;


public class CreateUserPage extends BasePage
{
	  @FindBy(id="username")
		private WebElement unTB;
	    @FindBy(id="password")
	    private WebElement pwTB;
	    @FindBy(xpath="//input[@type='submit']")
	    private WebElement connectionBT;
	    
	    
	public CreateUserPage(WebDriver driver) {
		super(driver);
		
	}
	

}
