package reusable;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class loadBrowser {
    public WebDriver driver;
    public Properties prop;


    public WebDriver  loadBrowser () throws IOException, InterruptedException {
        prop = new Properties();
        FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "//utilities//datadriven.properties");
        prop.load(fis);

        if (prop.getProperty("browser").equals("chrome")){
            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//driver//chromedriver");
            driver = new ChromeDriver();


        }

        else if(prop.getProperty("browser").equals("firefox")) {
            driver = new FirefoxDriver();

        }

        else {

            driver = new InternetExplorerDriver();

        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        //Open liveet home page.
        //driver.get(prop.getProperty("URL"));
        driver.get("https://liveet.co/");



        return driver;
    }

}
