package org.liveet.PageComponents;

import org.liveet.AbstractComponents.AbstractComponent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class featureLink extends AbstractComponent {
    WebDriver driver;
    By featureLink = By.xpath("//a[@class='nav-link capitalize h-full flex items-center'][normalize-space()='Features']");

    public featureLink(WebDriver driver, By featureLink) {
        super(driver, featureLink);
    }

    public void click()
    {
        findElement(featureLink).click();
    }

}
