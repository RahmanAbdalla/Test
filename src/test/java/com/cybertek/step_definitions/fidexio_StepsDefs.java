package com.cybertek.step_definitions;

import com.cybertek.pages.FidexioWebSite_Page;
import com.cybertek.utilities.Driver;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class fidexio_StepsDefs {

    FidexioWebSite_Page fidexioWebsite_page = new FidexioWebSite_Page();
    Faker faker = new Faker();
    WebDriverWait wait;
    Actions actions;

//    @Given("User clicks on the login button")
//    public void user_clicks_on_the_login_button() throws InterruptedException {
//
//       // fidexioWebsite_page.loginBtn.click();
//    }
//
//    @Then("User enters random credentials")
//    public void user_enters_random_credentials() throws InterruptedException {
//        Thread.sleep(2000);
//
//        fidexioWebsite_page.email.sendKeys(faker.internet().emailAddress());
//        fidexioWebsite_page.password.sendKeys(faker.internet().password()+ Keys.ENTER);
//    }
//
//    @Then("User should see an error message")
//    public void user_should_see_an_error_message() {
//        System.out.println("Error msg is: "+fidexioWebsite_page.errorMsg.getText());
//        Assert.assertTrue(fidexioWebsite_page.errorMsg.isDisplayed());
//    }
//
//    @Then("User returns to the home page by clicking on fidexio logo on the top left")
//    public void user_returns_to_the_home_page_by_clicking_on_fidexio_logo_on_the_top_left() throws InterruptedException {
//        Thread.sleep(1000);
//        Driver.getDriver().navigate().back();
//
//    }
//    @Then("User clicks on the Contact button and then scroll down the page to see the contact number is displayed")
//    public void user_clicks_on_the_contact_button_and_then_scroll_down_the_page_to_see_the_contact_number_is_displayed() throws InterruptedException {
//
//        Driver.getDriver().get("https://fidexio.com/about-us/");
//
//        Thread.sleep(1000);
//
//        fidexioWebsite_page.contactBtn.click();
//
//        actions = new Actions(Driver.getDriver());
//
//        Thread.sleep(2000);
//        actions.moveToElement(fidexioWebsite_page.officeAddress).perform();
//
//    }

    @Given("User enters {string} and {string}credentials")
    public void userEntersAndCredentials(String email, String password) throws InterruptedException {
        Driver.getDriver().get("http://app.fidexio.com/");

        Thread.sleep(1000);
        fidexioWebsite_page.email.sendKeys(email);
        Thread.sleep(1000);
        fidexioWebsite_page.password.sendKeys(password);
    }
}
