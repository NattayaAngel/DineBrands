package com.nattaya.qa.pages;

import com.nattaya.qa.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {

    public HomePage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }


        @FindBy(xpath = "//span[.='Check Box']")
        public WebElement checkBox;

        @FindBy(xpath = "//button[@aria-label='Expand all']")
        public WebElement plusBtn;

        @FindBy(xpath = "//span[@class='rct-checkbox']/following-sibling::*")
        public WebElement angular;

        @FindBy(xpath = "//span[@class='rct-title'][.='Angular']")
        public WebElement angularText;

        @FindBy(xpath = "//div[.='Alerts, Frame & Windows']")
        public WebElement alertsFrameWindows;


////span[@class='rct-checkbox']/following-sibling::*
////span[.='Angular'][1]
}


