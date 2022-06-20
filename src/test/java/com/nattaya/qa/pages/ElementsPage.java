package com.nattaya.qa.pages;

import com.nattaya.qa.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ElementsPage extends BasePage {

    public ElementsPage() {

        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "//span[text()='Alerts']")
    public WebElement alertOption;


}

