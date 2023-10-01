package SkillTechSolutions.Pages;

import SkillTechSolutions.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage extends Utility {
    private static final Logger log = LogManager.getLogger(ProductPage.class.getName());

    public ProductPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//div[@id='hs_menu_wrapper_header_menu']/ul/li[2]")
    WebElement products;

    @CacheLookup
    @FindBy(xpath = "//li[@class='hs-menu-item hs-menu-depth-1 hs-item-has-children Products']/ul/li[2]")
    WebElement eparoEssentials;

    public void clickOnProducts() {
        clickOnElement(products);
    }

    public void clickonEparoEssentials() {
        mouseHoverToElementAndClick(eparoEssentials);
    }

    public String eparoTitle() {
        String actualPageTitle = driver.getTitle();
        return actualPageTitle;


    }
}
