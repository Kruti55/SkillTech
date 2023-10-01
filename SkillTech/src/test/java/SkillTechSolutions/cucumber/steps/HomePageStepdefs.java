package SkillTechSolutions.cucumber.steps;

import SkillTechSolutions.Pages.HomePage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomePageStepdefs {


    @When("^user wants to see how many links available on home page$")
    public void user_wants_to_see_how_many_links_available_on_home_page() {
        new HomePage().allTheLinksOnHomePage();
    }
}

