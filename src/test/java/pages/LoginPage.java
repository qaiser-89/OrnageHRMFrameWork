package pages;

import Helper.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

public class LoginPage
{
    WebDriver driver;
    public LoginPage (WebDriver driver)
    {
        this.driver = driver;
    }

    protected By email = By.xpath("//input[@placeholder='Username']");
    protected By password = By.xpath("//input[@placeholder='Password']");
    protected By sign_btn = By.xpath("//button[normalize-space()='Login']");
    protected By forgot_pass_btn = By.xpath("//div//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']");
    protected By invalid_Creditials = By.xpath("//p[normalize-space()='Invalid credentials']");

    public void getTile()
    {
      String appTitle= driver.getTitle();
        Reporter.log("App Title is:  "+appTitle, true);
    }

    public  HomePage signInToApp(String uName, String Pass)
    {
        Utility.waitForElement(driver, email).sendKeys(uName);
        Utility.waitForElement(driver, password).sendKeys(Pass);
        Utility.clickElement(driver, driver.findElement(sign_btn));
        HomePage hp=new HomePage(driver);
        return hp;
    }

    public boolean invalidLogin()
    {
        Utility.waitForElement(driver, email).sendKeys("Test");
        Utility.waitForElement(driver, password).sendKeys("TEst");
        Utility.waitForElement(driver, sign_btn).click();
      boolean status=  Utility.waitForElement(driver, invalid_Creditials).isDisplayed();
      return status;
    }

    public ResetPasswordPage clickOnForgotPassword()
    {
        Utility.clickElement(driver, driver.findElement(forgot_pass_btn));
        ResetPasswordPage rpp=new ResetPasswordPage(driver);
        return rpp;
    }


}
