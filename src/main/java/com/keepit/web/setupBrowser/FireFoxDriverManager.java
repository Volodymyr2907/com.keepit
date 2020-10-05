package com.keepit.web.setupBrowser;

import io.github.bonigarcia.wdm.FirefoxDriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.log4j.BasicConfigurator;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxDriverManager extends DriverManager {

    //configuration for firefox driver
    @Override
    public void createDriver() {
        BasicConfigurator.configure();
        WebDriverManager firefoxDriverManager = new FirefoxDriverManager();
        firefoxDriverManager.firefoxdriver().setup();
        webDriver = new FirefoxDriver();
        configureDriver(webDriver);
    }
}
