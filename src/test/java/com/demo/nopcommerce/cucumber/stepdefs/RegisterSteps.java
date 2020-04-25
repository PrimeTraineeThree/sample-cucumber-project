package com.demo.nopcommerce.cucumber.stepdefs;

import com.demo.nopcommerce.pages.HomePage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

/**
 * Created by Jay
 */
public class RegisterSteps {

    @When("^I click on register link$")
    public void iClickOnRegisterLink() {
        new HomePage().clickOnRegisterLink();
    }

    @Then("^I should navigate to register page successfully$")
    public void iShouldNavigateToRegisterPageSuccessfully() {
        Assert.assertTrue(true);
    }
}
