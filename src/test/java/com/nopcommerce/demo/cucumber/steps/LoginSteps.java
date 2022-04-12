package com.nopcommerce.demo.cucumber.steps;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;


/**
 * By Bhoomi
 **/
public class LoginSteps  {


    @Given("^I am on homepage$")
    public void iAmOnHomepage() {
        System.out.println("I am on homepage");
    }

    @When("^I click on login link$")
    public void iClickOnLoginLink() {
       new HomePage().clickOnLoginLink();


    }

    @Then("^i should navigate to login page successfully$")
    public void iShouldNavigateToLoginPageSuccessfully() {
        String expectedMessage = "Welcome, Please Sign In!";
        String actualMessage = new LoginPage().getWelcomeText();
        Assert.assertEquals("Login page not displayed",expectedMessage, actualMessage);
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
        String expectedErrorMessage = "Login was unsuccessful. Please correct the errors and try again.\n"
                + "No customer account found";

        Assert.assertEquals("",expectedErrorMessage,new LoginPage().getErrorMessage());
    }

    @Then("^I should see the error message \"([^\"]*)\"$")
    public void iShouldSeeTheErrorMessage(String message)  {
        Assert.assertEquals("error message not displayed",message,new LoginPage().getErrorMessage());
    }
}
