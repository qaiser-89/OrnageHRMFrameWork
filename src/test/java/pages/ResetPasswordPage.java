package pages;

import Helper.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

public class ResetPasswordPage {
    WebDriver driver;

    public ResetPasswordPage(WebDriver driver) {
        this.driver = driver;
    }

    protected By reset_pass_text = By.xpath("//p[normalize-space()='Please enter your username to identify your account to reset your password']");
    protected By cancel_btn = By.xpath("//button[normalize-space()='Cancel']");
    protected By reset_pass_btn = By.xpath("//button[normalize-space()='Reset Password']");
    public void resetPassword()
    {
       String text= Utility.waitForElement(driver, reset_pass_text).getText();
       text.contains("Please enter your username to identify your account to reset your password");
        Reporter.log(text, true);
        Utility.waitForElement(driver, cancel_btn).isDisplayed();
        Utility.waitForElement(driver, reset_pass_btn).isDisplayed();
        Utility.sleep(2);
        Utility.waitForElement(driver, cancel_btn).click();
    }
}
