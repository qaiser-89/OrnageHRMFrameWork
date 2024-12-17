package pages;

import Helper.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class HomePage {
    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    protected By dashboard = By.xpath("//h6[normalize-space()='Dashboard']");
    protected By admin_btn = By.xpath("//span[normalize-space()='Admin']");
    protected By pim_btn = By.xpath("//a[normalize-space()='PIM']");
    protected By time_btn = By.xpath("//span[text()='Time']");

    public void loginValidation()
    {
      boolean status=  Utility.waitForElement(driver, dashboard).isDisplayed();
        Assert.assertTrue(status= true);
    }

    public void clickOnAdminModule()
    {
        Utility.waitForElement(driver, admin_btn).click();

    }

    public AddPIMUserPage clickOnPIMModule()
    {
        Utility.waitForElement(driver, pim_btn).click();

        AddPIMUserPage addPIM=new AddPIMUserPage(driver);
        return addPIM;
    }

    public TimePage clickTimeModule()
    {
        Utility.waitForElement(driver, time_btn).click();
        TimePage TP=new TimePage(driver);
        return TP;
    }

}