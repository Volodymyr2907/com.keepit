package com.keepit.web.setupBrowser;

public class DriverManagerFactory {


    //method for choosing browser to be opened
    public DriverManager chooseBrowser(String browser){
        DriverManager driverManager = null;
        if (browser.equals("CH"))
            driverManager = new ChromeDriverManager();
        else if (browser.equals("FF"))
            driverManager = new FireFoxDriverManager();

        return driverManager;
    }
}
