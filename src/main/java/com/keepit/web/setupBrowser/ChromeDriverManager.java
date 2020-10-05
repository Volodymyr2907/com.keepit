package com.keepit.web.setupBrowser;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.log4j.BasicConfigurator;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverManager extends DriverManager {

    //configuration for chrome driver
    @Override
    public void createDriver() {
        BasicConfigurator.configure();
        WebDriverManager chromeDriverManager = new io.github.bonigarcia.wdm.ChromeDriverManager();
        chromeDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver();
        configureDriver(webDriver);
    }

}
