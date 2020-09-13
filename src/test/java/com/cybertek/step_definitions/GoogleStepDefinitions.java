package com.cybertek.step_definitions;

import com.cybertek.pages.GoogleSearchPage;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

import java.util.List;
import java.util.Map;

public class GoogleStepDefinitions {

    GoogleSearchPage googleSearchPage = new GoogleSearchPage();


    @Given("User is on the google search page")
    public void user_is_on_the_google_search_page() {

       // Assert.fail("Purposely failing code here"); //intentionally failing the code

        Driver.getDriver().get("http://www.google.com");
        System.out.println("USER IS ON THE GOOGLE SEARCH PAGE");
    }

    @Then("User should see title is Google")
    public void user_should_see_title_is_google() {

        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "Google";

        Assert.assertTrue("Actual title does not match expected title!",actualTitle.equals(expectedTitle));// this Assertion comes from junit
        System.out.println("USER SEES THE TITLE IS GOOGLE");
    }

    @Then("User searches apple")
    public void userSearchesApple() {
        googleSearchPage.searchBox.sendKeys("apple"+ Keys.ENTER);

        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "apple - Google Search";

        Assert.assertEquals(actualTitle,expectedTitle);
        
    }

    @When("User should see apple in the title")
    public void userShouldSeeAppleInTheTitle() {
    }


    @Then("User searches {string}")
    public void userSearches(String searchValue) { // apple word we used in feature file will be passes to searchValue
        googleSearchPage.searchBox.sendKeys(searchValue+ Keys.ENTER);
    }

    @When("User should see {string} in the title")
    public void userShouldSeeInTheTitle(String searchValue) {
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = searchValue+ " - Google Search";

        Assert.assertEquals(actualTitle,expectedTitle);
    }


    @Then("User should see About-link")
    public void userShouldSeeAboutLink() {
        // verify that About-link is displayed
        Assert.assertTrue(googleSearchPage.aboutLink.isDisplayed());
    }

    @And("User should click About-link")
    public void userShouldClickAboutLink() {
        googleSearchPage.aboutLink.click();
    }

    @Then("User should see title Google - About Google, Our Culture @ Company News")
    public void userShouldSeeTitleGoogleAboutGoogleOurCultureCompanyNews() {
        String actualTitle = Driver.getDriver().getTitle();
        System.out.println("Title is: "+Driver.getDriver().getTitle());

        String expectedTitle = "Google - About Google, Our Culture & Company News";

        Assert.assertEquals(actualTitle,expectedTitle);
    }


    @Then("User should see six link in the footer")
    public void user_should_see_six_link_in_the_footer(List<String> links) {

        int expectedSize = links.size();
        System.out.println(links);
        int actualSize = googleSearchPage.footerLinks.size();

        Assert.assertTrue(expectedSize == actualSize);

        System.out.println("All the "+googleSearchPage.footerLinks.size()+" expected links are found on google search page");

    }

    @Given("I logged into suiteCRM")
    public void iLoggedIntoSuiteCRM() {
    }

    @When("I create a new contact:")
    public void iCreateANewContact() {
    }

    @Then("I should see contact information for {string}")
    public void iShouldSeeContactInformationFor(Map<String,String> contact) {

    }
}
