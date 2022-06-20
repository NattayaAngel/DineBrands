package com.nattaya.qa.steps_definitions;

import com.nattaya.qa.pages.AlertsPage;
import com.nattaya.qa.pages.ElementsPage;
import com.nattaya.qa.utilities.BrowserUtils;
import com.nattaya.qa.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;

public class Alert_steps {

    ElementsPage elementsPage = new ElementsPage();
    AlertsPage alertsPage = new AlertsPage();

    @And("user selects Alert, Frame, & Windows")
    public void user_selects_alerts_frame_windows_tile_from_the_side_menu() {
        BrowserUtils.waitForPageToLoad(10);
        elementsPage.alertFrameWindowsTiles.click();
    }
    @And("user selects Alerts option from the side menu")
    public void selectsAlertsOptionFromTheSideMenu() {
        BrowserUtils.waitForPageToLoad(10);
        elementsPage.alertOption.click();
    }
    @And("user clicks on the On button click alert will appear after five seconds click me button")
    public void userClicksOnTheOnButtonClickAlertWillAppearAfterSecondsClickMeButton() {
        BrowserUtils.waitForPageToLoad(10);
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
    @And("close the alert pop up")
    public void closeTheAlertPopUp() {
    Alert alert = Driver.getDriver().switchTo().alert();
    alert.accept();
    }
}
