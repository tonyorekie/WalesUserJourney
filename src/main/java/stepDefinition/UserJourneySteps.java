package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.CheckHelpPage;

public class UserJourneySteps {
	
	public static WebDriver driver;
	private CheckHelpPage check;
	
	
	
	
	@Given("^I am a person from Wales$")
	public void i_am_a_person_from_Wales() throws Throwable {
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe"); 
		driver = new ChromeDriver(); 
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/start");
	    
		
	}

	@When("^I input my circumstances into the checker tool$")
	public void i_input_my_circumstances_into_the_checker_tool() throws Throwable {
		
		check = new CheckHelpPage(driver);
		check.clickOnStartButton();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		check.clickOnWalesRadioButton();
		check.clickNextButton();
		check.enterDateOfBirthDetails(12, 10, 1983);
		check.clickNextButton();
		check.clickOnNoPartnerRadioButton();
		check.clickNextButton();
		check.clickOnNoTaxCreditButton();
		check.clickNextButton();
		check.clickOnNotGivenBirthNoRadioButton();
		check.clickNextButton();
		check.clickOnNoinjuryRadioButton();
		check.clickNextButton();
		check.clickOnNodiabetesRadioButton();
		check.clickNextButton();
		check.clickOnNoglaucomaRadioButton();
		check.clickNextButton();
		check.clickOnNoIncareHomeRadioButton();
		check.clickNextButton();
		check.clickOnNoSavingsRadioButton();
		check.clickNextButton();
	    
		
	}

	@Then("^I should get a result of whether I will get help or not$")
	public void i_should_get_a_result_of_whether_I_will_get_help_or_not() throws Throwable {
		
		String actualResult = check.VerifyBasedOnWhatYouToldUsText();
		String expectedResult = "Based on what you've told us";
		Assert.assertEquals(expectedResult, actualResult);
		
		boolean isYouGetFreeTextDisplayed = check.isYouGetfreeTextDisplayed();
		Assert.assertTrue(isYouGetFreeTextDisplayed);
	    
		boolean isNHSPrescriptionTextDisplayed = check.isifYourPrescriptionIsDispencedInWalesTextDisplayed();
		Assert.assertTrue(isNHSPrescriptionTextDisplayed);
		
		driver.close();
		driver.quit();
	    
		
	}


}
