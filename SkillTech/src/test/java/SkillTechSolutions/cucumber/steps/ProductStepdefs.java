package SkillTechSolutions.cucumber.steps;

import SkillTechSolutions.Pages.ProductPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class ProductStepdefs {
    @Given("^user is on homePage$")
    public void userIsOnHomePage() {
    }

    @When("^user click on product$")
    public void userClickOnProduct() {
        new ProductPage().clickOnProducts();
    }

    @And("^user click on EPAPro Essentials$")
    public void userClickOnEPAProEssentials() {
        new ProductPage().clickonEparoEssentials();
    }

    @Then("^user should be redirected to the page \"([^\"]*)\"$")
    public void userShouldBeRedirectedToThePage(String expectedTitle) {
        String actualText = new ProductPage().eparoTitle();
        String expectedText = expectedTitle;
        Assert.assertEquals(actualText, expectedText);
    }
}
