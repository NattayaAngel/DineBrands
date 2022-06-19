package com.nattaya.qa.pages;

import com.nattaya.qa.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static org.bouncycastle.crypto.tls.ContentType.alert;

public class ElementsPage extends BasePage {

    public ElementsPage() {

        PageFactory.initElements(Driver.getDriver(), this);

    }
    @FindBy(xpath = "//div[@class='element-group']//div[text()='Alerts, Frame & Windows']")
    public WebElement alertFrameWindowsTiles;

    @FindBy(xpath = "//span[text()='Alerts']")
    public WebElement alertOption;


 /*   public void alertModule(){
        Driver.getDriver().findElement(By.xpath("//span[text()='" + alert+"']")).click();
    }
*/
}

