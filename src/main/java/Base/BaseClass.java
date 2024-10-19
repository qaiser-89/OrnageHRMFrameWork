package Base;

import DataProvider.ConfigReader;
import Factory.BrowserFactory;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass
{
  public WebDriver driver;


   @BeforeClass
    public void brwoserSetup()
    {
        Reporter.log("Setting up the driver: running BaseClass browser setup", true);
        String browsertoUse= ConfigReader.getProperty("browser");
        String url= ConfigReader.getProperty("appURL");
        driver = BrowserFactory.getBrowser(browsertoUse, url);
        Reporter.log("Log INFO: Browser is up and Running!! ",true);

    }

    @AfterClass
    public void closeBrowser()
    {
        Reporter.log("Running after class", true);
        BrowserFactory.shutingDownBrowser();
        Reporter.log("Browser Closed!!", true);
    }


}
