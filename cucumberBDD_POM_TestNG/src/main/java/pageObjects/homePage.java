package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;


import utils.Base;
import utils.utilities;


public class homePage extends Base {


    public @FindBy(xpath = "//img[@src='assets/images/profile.jpg']")
    WebElement userIcon;

    public @FindBy(xpath = "//a[contains(text(),' Logout')]")
    WebElement logOutLink;

    public @FindBy(xpath = "" + "//a[contains(text(),'My account')]")  WebElement myAccounticon;





    public homePage() throws IOException {
        super();

        loginpage.NavigateToUrl();

    }


    public void ClickUserIcon()
    {
        try {
            Thread.sleep(3000);
            userIcon.click();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    public void ClickLogOut() {
            try {
                Thread.sleep(3000);
                logOutLink.click();
            } catch (Exception e) {
                e.printStackTrace();
            }
    }
public void Clickmyaccount(){
        ut.waitForElementClickable(driver,myAccounticon);
        myAccounticon.click();
}




    public void write(WebElement label, String value) {
        label.sendKeys(value);
        try {
            Thread.sleep(3000);
        } catch (Exception e) {
            e.printStackTrace();

        }
    }
}



