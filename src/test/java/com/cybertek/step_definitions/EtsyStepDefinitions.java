package com.cybertek.step_definitions;

import com.cybertek.pages.EtsySearchPage;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class EtsyStepDefinitions {

    EtsySearchPage etsySearchPage = new EtsySearchPage();

    @Given("User is on  the www.etsy.com")
    public void userIsOnTheWwwEtsyCom() {
        Driver.getDriver().get("https://www.etsy.com");
        System.out.println("User is on the https://www.etsy.com");
    }

    @Then("User sees title is as expected.")
    public void user_sees_title_is_as_expected() {
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone";

        Assert.assertTrue(actualTitle.equals(expectedTitle));
        System.out.println("User sees the title is as expected");
    }




    //Parameterization
    @Then("User types {string} in the search box.")
    public void userTypesInTheSearchBox(String searchValue) {
        etsySearchPage.searchBox.sendKeys(searchValue);
    }

    @When("User clicks search button.")
    public void userClicksSearchButton() {
        etsySearchPage.searchIcon.click();
        System.out.println("User clicks the search button");
    }

    @Then("User sees {string} is in the title")
    public void userSeesIsInTheTitle(String searchValue) {

        String actualTitle = Driver.getDriver().getTitle();
        System.out.println("Title is: " + Driver.getDriver().getTitle());

        Assert.assertTrue(actualTitle.contains(searchValue));
    }

}




