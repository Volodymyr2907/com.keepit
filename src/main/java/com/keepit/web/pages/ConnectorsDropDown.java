package com.keepit.web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConnectorsDropDown {

    private WebDriver webDriver;
    @FindBy(css = "[class='add-device-menu'] md-menu-item:first-child [class='md-button md-ink-ripple']")
    protected WebElement buttonAddOffice365;

    public ConnectorsDropDown(WebDriver webDriver){
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver,this);
    }

    public CreateConnectorPopUp addOffice365Connector(){
        buttonAddOffice365.click();
        return new CreateConnectorPopUp(webDriver);
    }

}
