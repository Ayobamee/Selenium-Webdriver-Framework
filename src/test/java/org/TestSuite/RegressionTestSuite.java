package org.TestSuite;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import reusable.loadBrowser;
import org.liveet.Actions.actions;
import org.liveet.Assertions.assertions;

import java.io.IOException;


public class RegressionTestSuite extends loadBrowser {

    @BeforeTest
    public void loadApp() throws InterruptedException, IOException {
        //Load app.
        driver = loadBrowser();
    }


    //Test that user can access the liveet landing page successfully.
    @Test
    public void landingPageTest() throws InterruptedException, IOException {
        assertions assertObj = new assertions(driver);
        //Assert landing page view
        assertObj.AssertLandingPageView();


    }

    @Test
    public void featuresTest() throws InterruptedException, IOException {
        //Performs some test actions
        actions actionsObj = new actions(driver);
        actionsObj.LandingPageView();

        //Assert features are displayed
        assertions assertObj = new assertions(driver);
        assertObj.FeaturesDisplayed();

    }

    @AfterTest
    public void teardown() throws InterruptedException, IOException {
        //close the app
        driver.quit();

    }
}
