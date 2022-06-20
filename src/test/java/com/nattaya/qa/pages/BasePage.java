package com.nattaya.qa.pages;

import com.nattaya.qa.utilities.BrowserUtils;
import com.nattaya.qa.utilities.ConfigurationReader;
import com.nattaya.qa.utilities.Driver;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    public BasePage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

        @FindBy(xpath = "//div[@class='card-body'][.='Elements']")
        public WebElement elementsTile;

      /*  @Given("user is on homepage")
        public void userIsOnHttpsDemoqaCom() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env1"));
        BrowserUtils.waitForPageToLoad(3);

    }*/

}
