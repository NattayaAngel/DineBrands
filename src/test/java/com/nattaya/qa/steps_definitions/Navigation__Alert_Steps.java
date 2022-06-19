package com.nattaya.qa.steps_definitions;

import com.nattaya.qa.pages.AlertsPage;
import com.nattaya.qa.pages.ElementsPage;
import com.nattaya.qa.pages.HomePage;
import com.nattaya.qa.utilities.BrowserUtils;
import com.nattaya.qa.utilities.ConfigurationReader;
import com.nattaya.qa.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.NoAlertPresentException;


public class Navigation__Alert_Steps {

    HomePage homePage = new HomePage();

    @Given("user is on homepage")
    public void userIsOnHttpsDemoqaCom() {
    Driver.getDriver().get(ConfigurationReader.getProperty("env"));
    BrowserUtils.waitForPageToLoad(3000);
    }
    @When("user select {string} tile")
    public void user_select_tile(String string) {
        homePage.elementsTile.click();
    }

    @When("user select the {string} option from the side menu")
    public void user_select_the_option_from_the_side_menu(String string) {
        homePage.checkBox.click();
    }
    @When("user clicks on the {string} button on the top right corner")
    public void user_clicks_on_the_button_on_the_top_right_corner(String string) {
        homePage.plusBtn.click();
    }

    @When("user select {string} checkbox")
    public void user_select_checkbox(String string) {
        homePage.angular.click();
    }

    @Then("verify that the selection is {string} checkbox")
    public void verify_that_the_selection_is_checkbox(String string) {
        String actualText = homePage.angularText.getText();
        String expectedText = "Angular";
        Assert.assertEquals(expectedText, actualText);

    }
    @Then("user unchecks {string} checkbox")
    public void user_unchecks_checkbox(String string) {
        homePage.angular.click();
    }
    @Then("verify the checkbox in not selected")
    public void verify_the_checkbox_in_not_selected() {
        if (!homePage.angular.isSelected()) {
            System.out.println("Angular is unchecked");
        } else {
            System.out.println("Angular is checked)");
        }
    }



}
