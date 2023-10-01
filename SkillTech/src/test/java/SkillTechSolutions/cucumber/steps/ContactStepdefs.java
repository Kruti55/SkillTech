package SkillTechSolutions.cucumber.steps;

import SkillTechSolutions.Pages.ContactPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ContactStepdefs {
    @Given("^user is homepage$")
    public void userIsHomepage() {
    }

    @When("^user click on contact$")
    public void userClickOnContact() {
        new ContactPage().clickOnContact();
    }

    @And("^User Add firstname \"([^\"]*)\"$")
    public void userAddFirstname(String fname) {
        new ContactPage().sendFirstname(fname);
    }

    @And("^User add  lastname\"([^\"]*)\"$")
    public void userAddLastname(String lname) {
        new ContactPage().sendLastName(lname);

    }

    @And("^User add email\"([^\"]*)\"$")
    public void userAddEmail(String email) {
        new ContactPage().sendEmail(email);

    }

    @And("^User add Phonenumber\"([^\"]*)\"$")
    public void userAddPhonenumber(String phonenumber) {
        new ContactPage().sendPhone(phonenumber);

    }

    @And("^User click on Submit button$")
    public void userClickOnSubmitButton() {
        new ContactPage().clickOnSubmit();
    }

    @Then("^User should get an error message$")
    public void userShouldGetAnErrorMessage() {
    }
}
