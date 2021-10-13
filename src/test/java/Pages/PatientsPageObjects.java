package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PatientsPageObjects {
	WebDriver driver;

	public PatientsPageObjects(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	
	@FindBy(xpath= "//span[text()='Clinics']")WebElement ClinicsModule;
	@FindBy(xpath= "//span[@class='fc-button fc-button-month fc-state-default fc-corner-right']")WebElement MonthlyBtn;
	@FindBy(xpath= "//span[text()='Add Patient']")WebElement AddPatientSubModule;
	@FindBy(xpath= "//input[@placeholder='Mobile Number']")WebElement MobileNumberField;
	@FindBy(xpath= "//input[@value='Male']")WebElement selectGender;
	@FindBy(xpath= "//input[@id='txtAge']")WebElement EnterAge;
	
	public WebElement ClinicsModule()
	{
		return ClinicsModule;
	}
	
	public WebElement MonthlyBtn()
	{
		return MonthlyBtn;
	}
	
	public WebElement AddPatientSubModule()
	{
		return AddPatientSubModule;
	}
	
	public WebElement MobileNumberField()
	{
		return MobileNumberField;
	}
	
	public WebElement selectGender()
	{
		return selectGender;
	}
	
	public WebElement EnterAge()
	{
		return EnterAge;
	}
	

}
