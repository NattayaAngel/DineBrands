package com.nattaya.qa.steps_definitions;

import com.nattaya.qa.pages.HomePage;
import com.nattaya.qa.utilities.BrowserUtils;
import com.nattaya.qa.utilities.ConfigurationReader;
import com.nattaya.qa.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Navigation__Alert_Steps {

    HomePage homePage = new HomePage();

    @Given("user is on homepage")
    public void userIsOnHttpsDemoqaCom() {
    Driver.getDriver().get(ConfigurationReader.getProperty("env"));
    BrowserUtils.waitForPageToLoad(3);
    }
    @When("user selects Elements tile")
    public void user_select_tile() {
        homePage.elementsTile.click();
    }

    @And("user selects the Check Box option from the side menu")
    public void user_select_the_option_from_the_side_menu() {
        homePage.checkBox.click();
    }
    @And("user clicks on the + button on the top right corner")
    public void user_clicks_on_the_button_on_the_top_right_corner() {
        homePage.plusBtn.click();
    }

    @And("user selects Home>Workspace>Angular checkbox")
    public void user_select_checkbox() {
        homePage.angular.click();
    }

    @Then("verify that the selection is Angular checkbox")
    public void verify_that_the_selection_is_checkbox() {
        String actualText = homePage.angularText.getText();
        String expectedText = "Angular";
        Assert.assertEquals(expectedText, actualText);

    }
    @And("user unchecks Angular checkbox")
    public void user_unchecks_checkbox() {
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
