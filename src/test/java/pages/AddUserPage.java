package pages;
import Helper.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class AddUserPage
{
    WebDriver driver;
    public AddUserPage(WebDriver driver) {
        this.driver = driver;
    }
    protected By select_role_btn = By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]");
    protected By select_admin_roleBtn = By.xpath("//span[contains(text(),'Admin')]");
    protected By employee_nameField = By.xpath("//input[@placeholder='Type for hints...']");
    protected By emoloyee_selection = By.xpath("//div[@role='listbox']//div[2]");
    protected By status_click = By.xpath("//div[contains(text(),'-- Select --')]");
    protected By status_enabled = By.xpath("//span[normalize-space()='Enabled']");
    protected By user_name = By.xpath("(//input[@autocomplete='off'])[1]");
    protected By password = By.xpath("//body//div[@id='app']//div//div//div//div//div//div//div//div[1]//div[1]//div[2]//input[1]");
    protected By password_confirm = By.xpath("//body/div[@id='app']/div/div/div/div/div/form/div/div/div[2]/div[1]/div[2]/input[1]");
    protected By cancel_btn = By.xpath("//button[normalize-space()='Cancel']");
    protected By save_btn = By.xpath("//button[normalize-space()='Save']");
    protected By success_msg = By.xpath("//div[@aria-live='assertive']//div//div//div//i");

public void addNewUser(String emp_Name, String Usr_name, String pass, String confirm_pass)
{
    Utility.waitForElement(driver, select_role_btn).click();
    Utility.waitForElement(driver, select_admin_roleBtn).click();
    Utility.waitForElement(driver, employee_nameField).sendKeys(emp_Name);
    Utility.waitForElement(driver, emoloyee_selection).click();
    Utility.waitForElement(driver, status_click).click();
    Utility.waitForElement(driver, status_enabled).click();
    Utility.waitForElement(driver, user_name).sendKeys(Usr_name);
    Utility.waitForElement(driver, password).sendKeys(pass);
    Utility.waitForElement(driver, password_confirm).sendKeys(confirm_pass);
    Utility.waitForElement(driver, save_btn).click();
}
public boolean successMsgShowed()
{
  boolean successMsgShowed=Utility.waitForElement(driver, success_msg).isDisplayed();
  return successMsgShowed;
}


}
