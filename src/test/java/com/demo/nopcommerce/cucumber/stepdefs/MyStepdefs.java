package com.demo.nopcommerce.cucumber.stepdefs;

import com.demo.nopcommerce.pages.HomePage;
import com.demo.nopcommerce.pages.LoginPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

/**
 * Created by Jay
 */
public class MyStepdefs {

    @Given("^I am on home page$")
    public void iAmOnHomePage() {
    }

    @When("^I click on login link$")
    public void iClickOnLoginLink() {
        new HomePage().clickOnLoginLink();
    }

    @Then("^I should navigate to page successfully$")
    public void iShouldNavigateToPageSuccessfully() {
        Assert.assertEquals(new LoginPage().getWelcomeText(), "Welcome, Please Sign In");
    }

    @And("^I enter email \"([^\"]*)\"$")
    public void iEnterEmail(String email)  {
        new LoginPage().enterEmailId(email);
    }

    @And("^I enter password \"([^\"]*)\"$")
    public void iEnterPassword(String password)  {
        new LoginPage().enterPassword(password);

    }

    @And("^I click on login button$")
    public void iClickOnLoginButton() {
        new LoginPage().clickOnLoginButton();
    }

    @Then("^I should login successfully$")
    public void iShouldLoginSuccessfully() {
        Assert.assertEquals(new LoginPage().getWelcomeToStoreText(), "Welcome to our store");
    }

    @Then("^I should see the error message \"([^\"]*)\"$")
    public void iShouldSeeTheErrorMessage(String errorMessage) {
        Assert.assertEquals(new LoginPage().getErrorMessage(), errorMessage);
    }
}
