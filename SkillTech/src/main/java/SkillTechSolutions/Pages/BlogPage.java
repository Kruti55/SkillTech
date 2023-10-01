package SkillTechSolutions.Pages;

import SkillTechSolutions.utility.Utility;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class BlogPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//div[@id='hs_menu_wrapper_header_menu']/ul[@class='active-branch']/li")
    List<WebElement> listOfTabs;
    @CacheLookup
    @FindBy(xpath = "//div[@class='blog-site-search']//input[@class='hs-search-field__input']")
    WebElement search;
    @CacheLookup
    @FindBy(css = "input[class='search-submit']")
    WebElement clickOnSearch;

    public void selectTabs(String serviceName) throws StaleElementReferenceException {
        List<WebElement> services = listOfTabs;
        try {
            for (WebElement element : services) {
                if (element.getText().equalsIgnoreCase(serviceName)) {
                    element.click();
                }
            }
        } catch (StaleElementReferenceException exception) {
            services = listOfTabs;
        }
    }

    public void setsearch() {
        sendTextToElement(search, "End point assessments");

    }

    public void clickOnsearch() {
        clickOnElement(clickOnSearch);

    }
}
