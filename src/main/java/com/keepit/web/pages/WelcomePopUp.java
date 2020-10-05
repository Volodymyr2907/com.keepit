package com.keepit.web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WelcomePopUp {

    private WebDriver webDriver;
    @FindBy(css = "button[class='primary md-no-focus md-button']")
    protected WebElement gotItButton;


    public WelcomePopUp(WebDriver webDriver){
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);
    }

    public HomePage closePopUp() {
        WebDriverWait wait = new WebDriverWait(webDriver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(gotItButton)).click();
        return new HomePage(webDriver);
    }

}
