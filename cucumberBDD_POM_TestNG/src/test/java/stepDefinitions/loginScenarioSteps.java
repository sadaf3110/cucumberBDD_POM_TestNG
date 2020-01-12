package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.Base;

public class loginScenarioSteps extends Base{




@When("^I enter username as \"([^\"]*)\"$")
public void i_enter_username_as(String un) throws Throwable {
	 loginpage.enterUserName().sendKeys(un);
}

@When("^I enter password  as \"([^\"]*)\"$")
public void i_enter_password_as(String pw) throws Throwable {
	 loginpage.passWord.sendKeys(pw);
}
	@And("^click on sign in button$")
	public void clickOnSignInButton() {
	loginpage.ClickOnSignin();


}
@Then("^I click on log out button$")
public void i_click_on_log_out_button() throws Throwable {

	homepage.ClickUserIcon();
	homepage.ClickLogOut();
}
	@When("^I enter invlid username as \"([^\"]*)\"$")
	public void iEnterInvlidUsernameAs(String un2) throws Throwable {
	initializeDriver();
	loginpage.enterUserName().sendKeys(un2);

	}
		@And("^I enter invalid password as \"([^\"]*)\"$")
		public void iEnterInvalidPasswordAs(String pass2) throws Throwable {
loginpage.enterPassword().sendKeys(pass2);

		}

	@Then("^It should display me the message$")
	public void itShouldDisplayMeTheMessage() {
         loginpage.displayerrormsg().isDisplayed();

	}


	}


