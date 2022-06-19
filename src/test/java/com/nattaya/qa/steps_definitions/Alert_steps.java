package com.nattaya.qa.steps_definitions;

import com.nattaya.qa.pages.AlertsPage;
import com.nattaya.qa.pages.ElementsPage;
import com.nattaya.qa.utilities.BrowserUtils;
import com.nattaya.qa.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.NoAlertPresentException;

public class Alert_steps {

    ElementsPage elementsPage = new ElementsPage();
    AlertsPage alertsPage = new AlertsPage();

    @When("user selects {string}")
    public void user_select_(String string) {
        BrowserUtils.waitForPageToLoad(10);
        elementsPage.alertFrameWindows.click();
    }

    @And("user selects {string} option from the side menu")
    public void user_selects_alerts_option_from_the_side_menu(String string) {
        BrowserUtils.waitForPageToLoad(10);
        elementsPage.alertOption.click();

    }

    @And("user clicks on the {string}")
    public void userClicksOnTheButton(String string) {
        alertsPage.clickMeBtn.click();

    }

    @Then("Verify the alert pop up has appeared")
    public boolean verify_the_alert_pop_up_has_appeared() {

        try {
            Driver.getDriver().switchTo().alert();
            BrowserUtils.waitForPageToLoad(10);
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }


    }



}
