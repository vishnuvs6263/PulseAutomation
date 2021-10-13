package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageObjects {
	WebDriver driver;

	public LoginPageObjects(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	
	@FindBy(xpath= "(//input[@value='Login'])[1]")WebElement LoginBtn;
	@FindBy(xpath= "(//input[@name='txtUserName'])[1]")WebElement UsernameField;
	@FindBy(xpath= "(//input[@id='txtPassword'])[1]")WebElement PasswordField;
	@FindBy(xpath= "//input[@placeholder='Enter Code']")WebElement OTPField;
	@FindBy(xpath= "//span[@class='practiceName']")WebElement getUserName;
	@FindBy(xpath= "//a[@class='dropdown']")WebElement GetUserDropDown;
	
	public WebElement LoginBtn()
	{
		return LoginBtn;
	}
	
	public WebElement UsernameField()
	{
		return UsernameField;
	}
	
	public WebElement PasswordField()
	{
		return PasswordField;
	}
	
	public WebElement OTPField()
	{
		return OTPField;
	}
	
	public WebElement getUserName()
	{
		return getUserName;
	}
	
	public WebElement GetUserDropDown()
	{
		return GetUserDropDown;
	}
	

}
