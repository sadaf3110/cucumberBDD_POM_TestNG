package pageObjects;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utils.Base;


public class loginPage extends Base {

	//public @FindBy(xpath = "//input[@name='first_name']") WebElement textfield_FirstName;
	public @FindBy(id = "inputEmail")
	WebElement userName;

	public @FindBy(id = "inputPassword")
	WebElement passWord;

	public WebElement getSignIn() {
		return signIn;
	}

	private @FindBy(xpath = "//div[contains(text(),'Sign in')]")
	WebElement signIn;

	public @FindBy(xpath = " //span[@class='ng-binding']")
	WebElement errormsg;

	public loginPage() throws IOException {
		super();
	}
	
	/*
	public loginPage(){
		  PageFactory.initElements(driver, loginPage.class);
		}*/


	public void NavigateToUrl() {
		//initializeDriver();
		driver.navigate().to(prop.getProperty("url"));

	}


	public WebElement enterUserName() {
		return userName;
	}

	public WebElement enterPassword() {
		return passWord;
	}


	public WebElement displayerrormsg() {
		return errormsg;
	}


	public void ClickOnSignin() {
		signIn.click();
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();

		}

	}


	public void loginToMeddBase() {

		userName.sendKeys(prop.getProperty("username"));
		passWord.sendKeys(prop.getProperty("password"));
		ClickOnSignin();
	}


	/*public void LoginToApp() {
		enterUserName(username);
		enterPassword(password);
		ClickOnSignin();
	}*/


	//public boolean isUserLoggedIn() {
		//final boolean userLoggedIn = isUserLoggedIn();
		//return userLoggedIn;
	}



