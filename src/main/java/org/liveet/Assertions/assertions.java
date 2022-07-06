package org.liveet.Assertions;

import org.liveet.PageComponents.advancedFaceRecognisitionLink;
import org.liveet.PageObjects.LandingPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class assertions {

    WebDriver driver;

    public assertions(WebDriver driver) {
        this.driver = driver;
    }

    public void AssertLandingPageView() {

        String url = "https://liveet.co/index#features";
        String currenturl = driver.getCurrentUrl();
        String ActualTitle = driver.getTitle();
        String ExpectedTitle = "Home";
        Assert.assertEquals(ActualTitle, ExpectedTitle);
        Assert.assertEquals(url, currenturl);
        System.out.println("Test passed, page url and page titles are correct");

    }

    public void FeaturesDisplayed() {
        LandingPage landingPage = new LandingPage(driver);
        if (landingPage.getadvancedFaceRecognisitionLink().checkAdvancedFaceReg()) {
            System.out.println("Test passed, advanced face recognisition feature is visible");
        } else {
            System.out.println("Element is Absent");
        }

    }

}