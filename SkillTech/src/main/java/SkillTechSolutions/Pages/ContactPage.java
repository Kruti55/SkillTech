package SkillTechSolutions.Pages;

import SkillTechSolutions.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactPage extends Utility {
    private static final Logger log = LogManager.getLogger(ContactPage.class.getName());

    public ContactPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//li[@class='hs-menu-item hs-menu-depth-1 Contact']/a")
    WebElement contactTab;

    @CacheLookup
    @FindBy(xpath = "//form[@id='hsForm_915c7a8d-8086-4fe8-9f0a-d86a2021aafb_9877']/div/div/input[@id='firstname-915c7a8d-8086-4fe8-9f0a-d86a2021aafb_9877']")
    WebElement firstName;
    @CacheLookup
    @FindBy(id = "lastname-915c7a8d-8086-4fe8-9f0a-d86a2021aafb_9877")
    WebElement lastName;
    @CacheLookup
    @FindBy(css = "input#email-915c7a8d-8086-4fe8-9f0a-d86a2021aafb_9877")
    WebElement email;
    @CacheLookup
    @FindBy(id = "phone-915c7a8d-8086-4fe8-9f0a-d86a2021aafb_9877")
    WebElement phoneNumber;
    @CacheLookup
    @FindBy(xpath = "//input[@type='submit']")
    WebElement submit;

    public void clickOnContact() {
        clickOnElement(contactTab);
    }

    public void sendFirstname(String Firstname) {
        sendTextToElement(firstName, Firstname);
    }

    public void sendLastName(String Lastname) {
        sendTextToElement(lastName, Lastname);
    }

    public void sendEmail(String Email) {
        sendTextToElement(email, Email);
    }

    public void sendPhone(String PhoneNumber) {
        sendTextToElement(phoneNumber, PhoneNumber);
    }

    public void clickOnSubmit() {
        clickOnElement(submit);

    }
}
