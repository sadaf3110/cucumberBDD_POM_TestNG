package stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import org.openqa.selenium.By;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.questionnaresPage;
import utils.Base;
import utils.utilities;

public class loginMeddBaseSteps extends Base{
	

	
	@Given("^I navigate to meddbase login page$")
	public void i_navigate_to_meddbase_login_page() throws Throwable {
		initializeDriver();
	   loginpage.NavigateToUrl();
		Assert.assertTrue(false,"not logged in");
	}

	@When("^I enter valid username \"([^\"]*)\"$")
	public void i_enter_valid_username() throws Throwable {
		//loginPage loginpage = PageFactory.initElements(driver, loginPage.class);
		
	   loginpage.enterUserName().sendKeys();
	}

	@When("^I enter valid password \"([^\"]*)\"$")
	public void i_enter_valid_password() throws Throwable {
		
	    loginpage.enterPassword().sendKeys();
	}

	@When("^I click on sign in button$")
	public void i_clcik_on_sign_in_button() throws Throwable {
	   
	    loginpage.ClickOnSignin();
	}




	@Given("^Patient is in the Patient portal homepage$")
	public void patientIsInThePatientPortalHomepage() throws Exception {
		initializeDriver();
		loginpage.NavigateToUrl();
		loginpage.loginToMeddBase();
		//Assert.assertTrue(loginpage.isUserLoggedIn());

	}
	@When("^I navigate to \"([^\"]*)\" menu$")
	public void iNavigateToMenu(String menu) throws Throwable {
		navbarpage.gotoMenu(menu);
	}
	@Then("^I see a message on page \"([^\"]*)\"$")
	public void iSeeAMessageOnPage(String message) throws Throwable {
		utilities u = new utilities();
		//meddbase questionnare message absolutexpath of msg  with html tag
		u.waitForElementPresence(driver, By.xpath("//*[@id=\"ng-app\"]/body/div/div[2]/div[4]/div"));


	}


}



