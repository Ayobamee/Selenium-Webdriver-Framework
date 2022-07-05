package org.liveet.PageComponents;

import org.liveet.AbstractComponents.AbstractComponent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class advancedFaceRecognisitionLink extends AbstractComponent {
    WebDriver driver;
    By advancedFaceRecognisitionLink = By.xpath("(//img[@class='header-logo h-6 md:h-6 mr-0 md:mr-8 self-center my-4'])[1]");

    public advancedFaceRecognisitionLink(WebDriver driver, By advancedFaceRecognisitionLink) {
        super(driver, advancedFaceRecognisitionLink);
    }

    public boolean checkAdvancedFaceReg()
    {
        findElement(advancedFaceRecognisitionLink);
        return true;
    }
}
