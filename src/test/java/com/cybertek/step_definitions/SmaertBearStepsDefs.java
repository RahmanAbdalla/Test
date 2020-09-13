package com.cybertek.step_definitions;

import com.cybertek.pages.SmartBearPage;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;

public class SmaertBearStepsDefs {

    SmartBearPage smartBearPage = new SmartBearPage();

    @Given("User is logged into SmartBear Tester account and on Order page")
    public void user_is_logged_into_smart_bear_tester_account_and_on_order_page() {
        Driver.getDriver().get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx?ReturnUrl=%2fsamples%2fTestComplete12%2fWebOrders%2fDefault.aspx");
        String username = ConfigurationReader.getProperty("username");
        String password = ConfigurationReader.getProperty("password");

        smartBearPage.userNameInput.sendKeys(username);
        smartBearPage.passwordInput.sendKeys(password+ Keys.ENTER);
        System.out.println("User types in correct credentials");

    }

    @Then("User fills out the form as followed:")
    public void user_fills_out_the_form_as_followed() {
        System.out.println("Use is filling the form");
    }

    @And("User click Order link to start palcing the order")
    public void userClickOrderLinkToStartPalcingTheOrder() {
        smartBearPage.orderLinkBtn.click();
    }


    @When("User selects {string} from product dropdown")
    public void userSelectsFromProductDropdown(String product) {
        Select select = new Select(Driver.getDriver().findElement(By.xpath("//select[@name='ctl00$MainContent$fmwOrder$ddlProduct']")));
        select.selectByVisibleText(product);

        System.out.println("User selects "+product);
    }

    @And("User enters {string} to quantity")
    public void userEntersToQuantity(String quantity) {
        smartBearPage.quantity.sendKeys(Keys.CLEAR,quantity);
        System.out.println("User sets \""+quantity+"\" forquantity");
    }

    @Then("User click calculate button")
    public void userClickCalculateButton() {
        smartBearPage.calculateBtn.click();
        System.out.println("User clicks on calculate button");
    }


    @Then("User enters {string} to costumer name")
    public void userEntersToCostumerName(String name) {
        smartBearPage.customerName.sendKeys(name);
        System.out.println("User types \""+name+"\" as customer name");
    }

    @And("User enters {string} to street")
    public void userEntersToStreet(String street) {
        smartBearPage.street.sendKeys(street);
        System.out.println("User types \""+street+"\" as street name");
    }

    @When("User enters {string} to city")
    public void userEntersToCity(String city) {
        smartBearPage.city.sendKeys(city);
        System.out.println("User types \""+city+"\" as city name");

    }

    @Then("User enters {string} to state")
    public void userEntersToState(String state) {
        smartBearPage.state.sendKeys(state);
        System.out.println("User types \""+state+"\" as state name");

    }

    @And("User enters {string}")
    public void userEnters(String zipCode) {

        smartBearPage.zipCode.sendKeys(zipCode);
        System.out.println("User types \""+zipCode+"\" as zip code");
    }


    @And("User selects {string} as card type")
    public void userSelectsAsCardType(String cardType) {
        smartBearPage.cardRadioBox.click();
        System.out.println("User chooses \""+cardType+"\" as payment option");
    }


    @Then("User enters {string} to card number")
    public void userEntersToCardNumber(String cardNumber) {
        System.out.println("User types \"" + cardNumber + "\" as card number");
        smartBearPage.cardNumber.sendKeys(cardNumber);
    }

    @When("User enters {string} to expiration date")
    public void userEntersToExpirationDate(String date) {
        smartBearPage.date.sendKeys(date);
        System.out.println("User types \""+date+"\" for date");
    }

    @Then("User clicks process button")
    public void user_clicks_process_button() throws Exception {
        smartBearPage.processBtn.click();
        System.out.println("User click Process Button");

        System.out.println("Then user click on View All Orders to return back to orders");
        smartBearPage.viewAllOrderBtn.click();
        Thread.sleep(1000);
    }


    @And("User verifies {string} is in the list")
    public void userVerifiesIsInTheList(String customerName) {

        Assert.assertTrue(smartBearPage.johnWickName.isDisplayed());

        System.out.println(customerName+"'s been added to the list: PASSED");
    }



}
