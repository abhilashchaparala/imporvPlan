package org.example.stepdefinitions;

import com.microsoft.playwright.Page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.GooglePage;

public class GoogleStepDefinitions {
    Page page;
    GooglePage googlePage;

    @Given("user has access to google")
    public void userHasAccessToGoogle() {
        System.out.println("Has access to google");
        googlePage = new GooglePage();
        page = GooglePage.page;
    }

    @When("user opens google")
    public void userOpensGoogle() {
        googlePage.navigateToGoogle();
    }

    @And("user enters {string} in search box")
    public void userEntersInSearchBox(String text) {
        googlePage.enterText(text);
    }

    @And("user clicks on search button")
    public void userClicksOnSearchButton() {
        googlePage.clickSearch();
    }

    @Then("user should be navigated to search results page")
    public void userShouldBeNavigatedToSearchResultsPage() {
        googlePage.verifySearchPage();
    }
}
