package com.keepit.web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {


    HomePage homePage;

    private static final  String HOME_PAGE_URL = "https://ws-test.keepit.com/";
    private WebDriver webDriver;
    WelcomePopUp welcomePopUp;

    @FindBy (id = "login-form-login")
    protected WebElement emailField;
    @FindBy (id = "login-form-password")
    protected WebElement passwordField;
    @FindBy (id = "login-form-login-button")
    protected WebElement signInButton;


    public LoginPage(WebDriver webDriver) {
        this.webDriver = webDriver;
        this.welcomePopUp= new WelcomePopUp(webDriver);
        PageFactory.initElements(webDriver,this);
    }

    public LoginPage open() {
        webDriver.get(HOME_PAGE_URL);
        return new LoginPage(webDriver);
    }

    public LoginPage login(String password, String username) {
    emailField.sendKeys(username);
    passwordField.sendKeys(password);
    signInButton.click();
    return new LoginPage(webDriver);
    }

    public HomePage homePage() {
        return homePage;
    }
    public WelcomePopUp welcomePopUp() {
        return welcomePopUp;
    }


}
