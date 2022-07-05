package org.liveet.Actions;

import org.liveet.PageObjects.LandingPage;
import org.openqa.selenium.WebDriver;


public class actions {
    WebDriver driver;

    public actions(WebDriver driver) {
        this.driver = driver;
    }

    public void LandingPageView() {

        LandingPage landingPage = new LandingPage(driver);
        landingPage.getfeatureLink().click();


    }

}