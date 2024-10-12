package pages;

import Helper.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdminPage {
    WebDriver driver;
    public AdminPage(WebDriver driver)
    {
        this.driver=driver;
    }

    protected By add_btnd = By.xpath("//button[normalize-space()='Add']");

    public void clickOnAdminBtn()
    {
        Utility.clickElement(driver, Utility.waitForElement(driver , add_btnd));
    }
}
