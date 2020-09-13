package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WikipediaSearchPage {

    public WikipediaSearchPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (id = "searchInput")
    public WebElement wikiSearchBox;

    @FindBy (xpath = "//button[@type='submit']")
    public WebElement searchBtn;

    @FindBy (id = "firstHeading")
    public WebElement header;

    @FindBy (xpath = "//div[@class='fn']")
    public WebElement imageHeader;
}
