package com.keepit.web.setupBrowser;

import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public abstract class DriverManager {

    protected WebDriver webDriver;
    protected abstract void createDriver();

    public void quitDriver() {
        if (null != webDriver) {
            webDriver.quit();
            webDriver = null;
        }
    }
    public WebDriver getDriver() {
        if (webDriver == null) {
            createDriver();
        }
        return webDriver;
    }

    protected void configureDriver(WebDriver webDriver) {
        if (webDriver != null) {
            webDriver.manage().window().maximize();
            webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        }
    }

}
