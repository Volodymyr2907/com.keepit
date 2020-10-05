package com.keepit.web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateConnectorPopUp {

    private WebDriver webDriver;

    @FindBy (css = "h2[class='md-title ng-binding']")
    protected WebElement popUpTitle;

    public CreateConnectorPopUp (WebDriver webDriver){
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver,this);
    }

    public String getPopUpTitle(){
        popUpTitle.getText();
        return popUpTitle.getText();
    }


}
