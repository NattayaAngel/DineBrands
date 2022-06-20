package com.nattaya.qa.pages;

import com.nattaya.qa.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AlertsPage extends BasePage{

    public AlertsPage() {

        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "//div[@class='mt-4 row']")
    public WebElement clickMeBtn;



    }

