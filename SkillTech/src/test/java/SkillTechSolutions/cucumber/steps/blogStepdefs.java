package SkillTechSolutions.cucumber.steps;

import SkillTechSolutions.Pages.BlogPage;
import SkillTechSolutions.Pages.HomePage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class blogStepdefs {
    @Given("^user is on home page$")
    public void userIsOnHomePage() {
    }

    @When("^user click on \"([^\"]*)\"$")
    public void userClickOn(String tab) {
        new BlogPage().selectTabs(tab);


    }

    @And("^type 'End point Assessments'$")
    public void typeEndPointAssessments() {
        new BlogPage().setsearch();
    }

    @Then("^user should be able to search$")
    public void userShouldBeAbleToSearch() {
        new BlogPage().clickOnsearch();

    }

}
