package com.nattaya.qa.steps_definitions;

import com.nattaya.qa.pages.AlertsPage;
import com.nattaya.qa.pages.ElementsPage;
import com.nattaya.qa.pages.HomePage;
import com.nattaya.qa.utilities.BrowserUtils;
import com.nattaya.qa.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.*;

public class Alert_steps {

    ElementsPage elementsPage = new ElementsPage();
    AlertsPage alertsPage = new AlertsPage();
    HomePage homePage = new HomePage();

    @When("user selects Alert Frame & Windows tile")
    public void user_selects_alerts_frame_windows_tile() {
        BrowserUtils.waitForPageToLoad(10);
        homePage.alertsFrameWindows.click();
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

    @Then("Verify the alert pop up has appeared and close the alert pop up")
   /* public static boolean verify_the_alert_pop_up_has_appeared_and_close_the_alert() {
        try {
            BrowserUtils.waitForPageToLoad(10);
            Driver.getDriver().switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }
*/
        public static boolean verify_the_alert_pop_up_has_appeared_and_close_the_alert() {
            try {
                BrowserUtils.waitForPageToLoad(10);
                Driver.getDriver().getTitle();
                // Alert did not show
                return false;
            } catch (UnhandledAlertException e) {
                // Alert showed
                return true;
            }
        }

        public static void closeTheAlert() {
            Alert alert = Driver.getDriver().switchTo().alert();
            alert.accept();
        }


}
