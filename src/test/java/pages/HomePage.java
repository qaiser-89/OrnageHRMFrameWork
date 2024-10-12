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


    public void loginValidation()
    {
      boolean status=  Utility.waitForElement(driver, dashboard).isDisplayed();
        Assert.assertTrue(status= true);
    }

    public void clickOnAdminModule()
    {
        Utility.clickElement(driver, driver.findElement(admin_btn));

    }

}