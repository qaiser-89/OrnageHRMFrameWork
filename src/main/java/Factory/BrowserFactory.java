package Factory;
import DataProvider.ConfigReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Reporter;

public class BrowserFactory
{
   public static WebDriver driver;

    public static WebDriver getDriver()
    {
        return driver;
    }

    public static WebDriver getBrowser(String browserName, String AppURL)
    {
        if(browserName.equalsIgnoreCase("Chrome")|| browserName.equalsIgnoreCase("Google Chrome"))
        {
            ChromeOptions options=new ChromeOptions();
            if(ConfigReader.getProperty("HeadlessMode").equalsIgnoreCase("True"))
            {
                options.addArguments("--headless=new");
                Reporter.log("Chrome is running in Headless Mode!!, you can change the setting in Config file", true);
            }
            driver = new ChromeDriver(options);
        }
        else if (browserName.equalsIgnoreCase("Microsoft Edge")|| browserName.equalsIgnoreCase("MS Edge"))
        {
            driver=new EdgeDriver();
        }
        else if (browserName.equalsIgnoreCase("FireFox")||browserName.equalsIgnoreCase("Mozilla FireFox"))
        {
            driver = new FirefoxDriver();
        }
        else if (browserName.equalsIgnoreCase("Apple Safari")|| browserName.equalsIgnoreCase("safari"))
        {
            driver =new SafariDriver();
        }
        else
        {
            Reporter.log("Problem in seting up Browser we only support Chrome, FireFox, Edge and Safari browsers currenty!! ",true);
        }
        driver.get(AppURL);
        driver.manage().window().maximize();
        return driver;
    }
    public static void shutingDownBrowser()
    {
        driver.quit();
    }
}
