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

        @FindBy(xpath = "//span[.='Angular'][1]")
        public WebElement angular;

        @FindBy(xpath = "//span[.='Angular']")
        public WebElement angularText;


}


