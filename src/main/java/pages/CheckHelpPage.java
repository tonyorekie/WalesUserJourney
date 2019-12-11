package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.BasePage;

public class CheckHelpPage extends BasePage {
	
	
	static WebDriver driver;
	private CheckHelpPage check;
	
	
	
	
	@FindBy(id = "next-button") 
	 WebElement startButton;
	
	@FindBy(css = "#label-wales") 
	 WebElement walesRadioButton;
	
	
	@FindBy(id = "next-button") 
	 WebElement NextButton;
	
	@FindBy(css = "#label-no") 
	 WebElement noPartnerRadioButton;
	
	@FindBy(css = "#label-no") 
	 WebElement noBenefitTaxCredit;
	
	@FindBy(css = "#label-no") 
	 WebElement notGivenBirthButton;
	
	@FindBy(css = "#label-no") 
	 WebElement NoinjuryRadioButton;
	
	@FindBy(css = "#label-no") 
	 WebElement NodiabetesRadioButton;
	
	@FindBy(css = "#label-no") 
	 WebElement NoglaucomaRadioButton;
	
	@FindBy(css = "#label-no") 
	 WebElement NoIncareHomeRadioButton;
	
	@FindBy(css = "#label-no") 
	 WebElement NoSavingsRadioButton;
	
	@FindBy(css = "#result-heading > span") 
	 WebElement basedOnWhatYouToldUsText;
	
	@FindBy(id = "FREE-heading") 
	 WebElement youGetFreeText;
	
	@FindBy(id = "wales-prescription-restriction") 
	 WebElement ifYourPrescriptionIsDispencedInWalesText;
	
	
public CheckHelpPage(WebDriver driver) {
		
		super(driver);
	}
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	

	
	
	
	
	
	
	
	@FindBy(id = "dob-day") 
	 WebElement dobDay;
	
	@FindBy(id = "dob-month") 
	 WebElement dobMonth;
	
	@FindBy(id = "dob-year") 
	 WebElement dobYear;
	
	
	
	@FindBy(name = "RememberMe") 
	 WebElement RememberMeRadioButton;
	
	@FindBy(css = "#validationSummaryErrors > ul > li") 
	 WebElement InvalidLoginErrMsg;
	
	
	
	
	
	public void clickOnStartButton() {
		
		startButton.click();
		
	}
	
	
	public void clickOnWalesRadioButton() 
	{
		walesRadioButton.click();
	}
	
	
	
	
public void clickNextButton() {
	
	   NextButton.click();
		
		
	}

public void enterDateOfBirthDetails(int day, int month, int year) 
{
	String day1 = Integer.toString(day);
	String month1 = Integer.toString(month);
	String year1 = Integer.toString(year);
	dobDay.sendKeys(day1);
	dobMonth.sendKeys(month1);
	dobYear.sendKeys(year1);
	
	
	
	
}


public void clickOnNoPartnerRadioButton() {
	
	noPartnerRadioButton.click();
	
	
}

public void clickOnNoTaxCreditButton() {
	
	noBenefitTaxCredit.click();
}

public void clickOnNotGivenBirthNoRadioButton() {
	
	notGivenBirthButton.click();
	
	
}

public void clickOnNoinjuryRadioButton() {
	
	NoinjuryRadioButton.click();
}


public void clickOnNodiabetesRadioButton() {
	
	NodiabetesRadioButton.click();
}


public void clickOnNoglaucomaRadioButton() {
	
	NoglaucomaRadioButton.click();
}

public void clickOnNoIncareHomeRadioButton() {
	
	NoIncareHomeRadioButton.click();
}


public void clickOnNoSavingsRadioButton() {
	
	NoSavingsRadioButton.click();
}


public String VerifyBasedOnWhatYouToldUsText()
{
	return basedOnWhatYouToldUsText.getText();
}

public boolean isYouGetfreeTextDisplayed() {
	
	return youGetFreeText.isDisplayed();
}



public boolean isifYourPrescriptionIsDispencedInWalesTextDisplayed() 
{
	return ifYourPrescriptionIsDispencedInWalesText.isDisplayed();
}










	
	


	
	
	
	public String getErrMsgText() {
		
		System.out.println("The error message is " + InvalidLoginErrMsg.getText().toString());
		return InvalidLoginErrMsg.getText().toString();
		
		//LoginPage login = new LoginPage(driver); use this to test in the test case
		 
		//String actualErrMsg = login.getErrMsgText();
		 //Assert.assertEquals("The username and/or password are incorrect. Please try agai.", actualErrMsg);
	}
	

}
