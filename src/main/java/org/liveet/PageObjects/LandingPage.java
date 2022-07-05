package org.liveet.PageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.liveet.PageComponents.*;

public class LandingPage {

    By liveetLogo = By.xpath("(//img[@class='header-logo h-6 md:h-6 mr-0 md:mr-8 self-center my-4'])[1]");
    By featureLink = By.xpath("//a[@class='nav-link capitalize h-full flex items-center'][normalize-space()='Features']");

    By advancedFaceRecognisitionLink = By.xpath("//h3[normalize-space()='Advanced Facial Recognition']");


    WebDriver driver;
    public LandingPage(WebDriver driver) {
        this.driver = driver;
    }

    public featureLink getfeatureLink() {
        return new featureLink(driver, featureLink);
    }

    public liveetLogo getliveetLogo() {
        return new liveetLogo(driver, liveetLogo);
    }

    public advancedFaceRecognisitionLink getadvancedFaceRecognisitionLink() {
        return new advancedFaceRecognisitionLink(driver, advancedFaceRecognisitionLink);
    }




}
