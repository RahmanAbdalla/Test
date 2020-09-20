package com.cybertek.step_definitions;

import com.cybertek.pages.WikipediaSearchPage;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class wikipediaStepDefs {

    WikipediaSearchPage wikipediaSearchPage = new WikipediaSearchPage();

//    @Given("User is on Wikipedia home page")
//    public void user_is_on_wikipedia_home_page() {
//        Driver.getDriver().get("https://www.wikipedia.org/");
//        System.out.println("User is on Wikipedia home page");
//    }
//
//
//    @Then("User types {string} in the wiki search box")
//    public void user_types_in_the_wiki_search_box(String searchValue) {
//        wikipediaSearchPage.wikiSearchBox.sendKeys(searchValue+ Keys.ENTER);
//        System.out.println("User types "+searchValue+" in the wiki search box");
//    }
//
//
//    @Then("User sees {string} is in the wiki title")
//    public void user_sees_is_in_the_wiki_title(String searchValue) {
//        String actualTitle = Driver.getDriver().getTitle();
//
//        Assert.assertTrue(actualTitle.contains(searchValue));
//
//        System.out.println("User verifies that "+searchValue+" is in the wiki title");
//        System.out.println("Title is: "+Driver.getDriver().getTitle());
//    }
//
//
//    @When("User sees {string} is in the main header")
//    public void userSeesIsInTheMainHeader(String searchValue) {
//        String actualHeader = wikipediaSearchPage.header.getText();
//
//        Assert.assertTrue(actualHeader.equals(searchValue));
//        System.out.println("Header is: "+wikipediaSearchPage.header.getText());
//    }


    @Then("User sees {string} is in the image header")
    public void userSeesIsInTheImageHeader(String searchValue) {
        String actualImgHeader = wikipediaSearchPage.imageHeader.getText();

        Assert.assertTrue(actualImgHeader.equals(searchValue));
    }
}
