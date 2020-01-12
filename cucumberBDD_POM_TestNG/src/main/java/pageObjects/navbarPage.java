package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import org.testng.Assert;
import utils.Base;
import utils.utilities;

public class
navbarPage extends Base {


    public @FindBy(xpath = "//span[contains(text(),'Book Appointment')]")
    WebElement bookappointment;


    public @FindBy(xpath = "//span[contains(text(),'Existing Appointments')]")
    WebElement existingappointments;
    utilities utils=new utilities();

    public navbarPage() throws IOException {
        super();
    }


    public void ClickBookAppointment() {

        bookappointment.click();

    }


    public void ClickExistingAppointment() {

        existingappointments.click();

    }


    public void VerifyBookAppointment() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        bookappointment.isDisplayed();
    }

    public void gotoMenu(String menu) {

        try {
            WebElement menuLink = driver.findElement(By.xpath("//span[contains(text(),'" + menu + "')]"));
           // WebElement menuLink = driver.findElement(By.xpath("//span[contains(text(),' menu ')]"));
            if (menuLink.isDisplayed()) {
                menuLink.click();
            } else {
                throw new Exception("Menu link not present " + menu);
            }
        } catch (NoSuchFrameException e) {
            Assert.fail("Menu link not present " + menu);
        } catch (java.lang.Exception e) {
            Assert.fail("Menu link not present " + menu);
        }


    }
}
