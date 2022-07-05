package org.liveet.PageComponents;

import org.liveet.AbstractComponents.AbstractComponent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class liveetLogo extends AbstractComponent {
    WebDriver driver;
    By liveetLogo = By.xpath("(//img[@class='header-logo h-6 md:h-6 mr-0 md:mr-8 self-center my-4'])[1]");
    By EQA = By.xpath("//h1[contains(text(),'CREATE EQA PROGRAMS')]");
    public liveetLogo(WebDriver driver, By liveetLogo) {
        super(driver, liveetLogo);
    }

    public boolean checkLogo()
    {
        findElement(liveetLogo);
        return true;
    }

    public boolean checkEQA ()
    {
        findElement(EQA);
        return true;
    }
}
