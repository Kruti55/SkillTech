package SkillTechSolutions.Pages;

import SkillTechSolutions.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }


    @CacheLookup
    @FindBy(css = "a")
    List<WebElement> allTheLink;

    public void allTheLinksOnHomePage() {
        log.info("list of all the links" + allTheLink);
        List<WebElement> listOfAllTheLinks = allTheLink;
        int list = listOfAllTheLinks.size();
        System.out.println(list);

    }

}

