package stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;
import utils.Base;
import utils.utilities;

import java.io.IOException;

public class MyAccount  extends Base {
    @Given("^Patient launch the browser$")
    public void patient_launch_the_browser() throws Throwable {
        initializeDriver();
        loginpage.NavigateToUrl();
    }

    @When("^Patient enters username as \"([^\"]*)\"$")
    public void patient_enters_username_as(String un) throws Throwable {

        loginpage.enterUserName().sendKeys(un);

    }

    @When("^password as \"([^\"]*)\"$")
    public void password_as(String pw) throws Throwable {
        loginpage.enterPassword().sendKeys(pw);
    }

    @When("^Patient click on  signin button$")
    public void patient_click_on_signin_button() throws Throwable {
        ut.click(driver,loginpage.getSignIn());
       // loginpage.ClickOnSignin();

    }


    @Then("^Patient is navigated to patient portal home page$")
    public void patient_is_navigated_to_patient_portal_home_page() throws Throwable {
        navbarpage.VerifyBookAppointment();
    }


    @When("^Patient Choose  MyAccount$")
    public void patient_Choose_MyAccount() throws Throwable {
        //accountdetailspage.ClickMyAccountImage();
        ut.click(driver,accountdetailspage.MyAccountImage);
    }

    @When("^patient clicks MyAccount$")
    public void patient_clicks_MyAccount() throws Throwable {
        accountdetailspage.ClickMyAccount();
        ut.click(driver,accountdetailspage.MyAccountButton);
    }

    @When("^Patient enters Firstname as \"([^\"]*)\"$")
    public void patientEntersFirstnameAs(String fn) throws Throwable {

        ut.Write(accountdetailspage.FirstName, fn);

    }

    @When("^Surname as \"([^\"]*)\"$")
    public void surnameAs(String sn) throws Throwable {
        ut.Write(accountdetailspage.SurName, sn);

    }

    @When("^Patient enters Relationship as \"([^\"]*)\" and TelephoneNumber as \"([^\"]*)\"$")
    public void patient_enters_Relationship_as_and_TelephoneNumber_as(String rel, String TeleNo) throws Throwable {
        ut.Write(accountdetailspage.Relationship, rel);
        ut.Write(accountdetailspage.TelephoneNumb, TeleNo);
    }

    @When("^Patient enters Address(\\d+) as \"([^\"]*)\" and City as \"([^\"]*)\"$")
    public void patient_enters_Address_as_and_City_as(String add1, String Add2, String city) throws Throwable {
        ut.Write(accountdetailspage.Address1, add1);
        ut.Write(accountdetailspage.Address2, Add2);
        ut.Write(accountdetailspage.Address1, city);
    }


    @When("^Patient enters Country as \"([^\"]*)\" and Postcode as \"([^\"]*)\"$")
    public void patient_enters_Country_as_and_Postcode_as(String county, String postcode) throws Throwable {

        ut.Write(accountdetailspage.County, county);
        ut.Write(accountdetailspage.Postcode, postcode);
    }

    @And("^Patient enters Password as \"([^\"]*)\"$")
    public void patientEntersPasswordAs(String pass) throws Throwable {
        ut.Write(accountdetailspage.Password, pass);
    }

    @When("^select Save Changes button$")
    public void select_Save_Changes_button() throws Throwable {
        accountdetailspage.setClickSavechangeButton();
    }

    @Then("^Message is displayed Account Updated Successfully$")
    public void message_is_displayed_Account_Updated_Successfully() throws Throwable {
        accountdetailspage.displayupdatesuccessfully();


    }

    @And("^Patient checked the Email checkbox for Appointment booked confirmation$")
    public void patientCheckedTheEmailCheckboxForAppointmentBookedConfirmation() throws Throwable {
        accountdetailspage.Clickonemailcheckboxtobookappointment();
    }

    @And("^Patient  checked the SMS checkbox for Appointment booked confirmation$")
    public void patientCheckedTheSMSCheckboxForAppointmentBookedConfirmation() throws Throwable {
        accountdetailspage.Clickonsmscheckboxtobookappointment();
    }

    @Then("^\"([^\"]*)\" message is displayed$")
    public void messageIsDisplayed(String arg0) throws Throwable {
        accountdetailspage.displayupdatesuccessfully();
    }


    @Then("^patient is logggedout$")
    public void patientIsLogggedout() throws IOException {
        homepage.ClickUserIcon();
        homepage.Clickmyaccount();
        homepage.ClickLogOut();
    }

    @When("^patient logged in back$")
    public void patientLoggedInBack() throws IOException {
        initializeDriver();
        loginpage.NavigateToUrl();
        loginpage.loginToMeddBase();

    }

    @Then("^patient should see the account page being updated$")
    public void patientShouldSeeTheAccountPageBeingUpdated() throws IOException, InterruptedException {
        homepage.ClickUserIcon();
        homepage.Clickmyaccount();
        //meddbase questionnare message absolutexpath of msg  with html tag
        ut.waitForElementPresence(driver, By.xpath("//*[@id=\"ng-app\"]/body/div/div[2]/div[4]/div/div"));


    }

    @And("^clear the input data in the form$")
    public void clearTheInputDataInTheForm() throws Throwable{
        accountdetailspage.clearaccountdetilsfields();

    }

   // @Then("^data updated should be \"([^\"]*)\"$")
   // public void dataUpdatedShouldBe(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
       // throw new PendingException();
    }



