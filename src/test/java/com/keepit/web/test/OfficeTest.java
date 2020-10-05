package com.keepit.web.test;

import com.keepit.web.pages.*;
import com.keepit.web.setupBrowser.DriverManager;
import com.keepit.web.setupBrowser.DriverManagerFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import static org.testng.Assert.assertEquals;

public class OfficeTest {

    WebDriver webDriver;
    LoginPage loginPage;
    DriverManagerFactory driverManagerFactory = new DriverManagerFactory();
    DriverManager driverManager;

    //setting up browser
    @BeforeClass(alwaysRun = true)
    @Parameters({"browser"})
    public void setUp(String browser){
        driverManager = driverManagerFactory.chooseBrowser(browser);
        webDriver = driverManager.getDriver();

    }
    //opening home page
    @BeforeMethod(alwaysRun = true)
    public void openHomePage() {
        loginPage = new LoginPage(webDriver).open();
    }

    @Test
    @Parameters ({"password","username", "expectedTitleName"})
    public void testCreateOffice365Admin(String password, String username, String expectedTitleName){
        //steps
        loginPage.login(password,username);
        HomePage addConnector = loginPage.welcomePopUp().closePopUp();
        ConnectorsDropDown openListOfConnectors = addConnector.addCloudConnectors();
        CreateConnectorPopUp chooseOffice365Connector = openListOfConnectors.addOffice365Connector();
        //getting title from pop up and saved in variable
        String actualPopUpTitle = chooseOffice365Connector.getPopUpTitle();

        //verifying actual result with expected
        assertEquals(actualPopUpTitle, expectedTitleName);

    }

    //closing browser
    @AfterClass(alwaysRun = true)
    public void tearDown() {
        driverManager.quitDriver();

    }
}
