package com.keepit.web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    private WebDriver webDriver;

    @FindBy(css = "div[class='add-device-button-container ng-scope']")
    protected WebElement buttonAddConnector;


    public HomePage(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);
    }

        public ConnectorsDropDown addCloudConnectors(){
        buttonAddConnector.click();
        return new ConnectorsDropDown(webDriver);

    }

}
