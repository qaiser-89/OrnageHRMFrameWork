package pages;

import Helper.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddPIMUserPage
{
    WebDriver driver;
    public AddPIMUserPage(WebDriver driver)
    {
        this.driver= driver;
    }

    protected By add_btn = By.xpath("//li[contains(.,'Add Employee')]");
    protected By emp_first_name = By.xpath("//input[@placeholder='First Name']");
    protected By emp_middle_name = By.xpath("//input[@placeholder='Middle Name']");
    protected By emp_last_name = By.xpath("//input[@placeholder='Last Name']");
    protected By emp_id_field = By.xpath("//li[@class='oxd-topbar-body-nav-tab --visited']"); //First clear and then add id code
    protected By create_login_btn = By.xpath("//body/div[@id='app']/div/div/div/div/div/form/div/div/div/div/label/span[1]");
    protected By user_name_btn = By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[2]/input[1]");
    protected By password_field = By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[2]/div[4]/div[1]/div[1]/div[1]/div[2]/input[1]");
    protected By password_con_field = By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[2]/div[4]/div[1]/div[2]/div[1]/div[2]/input[1]");
    protected By cancel_btn = By.xpath("//button[normalize-space()='Cancel']");
    protected By save_btn = By.xpath("//button[normalize-space()='Save']");


    public void addNewPIMUser(String Fname,String Mname, String Lname, String id, String Uname,String pass, String conPass)
    {
        Utility.waitForElement(driver, add_btn).click();
        Utility.waitForElement(driver, emp_first_name).sendKeys(Fname);
        Utility.waitForElement(driver, emp_middle_name).sendKeys(Mname);
        Utility.waitForElement(driver, emp_last_name).sendKeys(Lname);
        Utility.waitForElement(driver, emp_id_field).clear();
        Utility.sleep(2);
        Utility.waitForElement(driver, emp_id_field).sendKeys(id);
        Utility.waitForElement(driver, create_login_btn).click();
        Utility.waitForElement(driver, user_name_btn).sendKeys(Uname);
        Utility.waitForElement(driver, password_field).sendKeys(pass);
        Utility.waitForElement(driver, password_con_field).sendKeys(conPass);
        Utility.waitForElement(driver, save_btn).click();
    }

    public boolean checkCancelBtnAvailable()
    {
      boolean  canbt = Utility.waitForElement(driver, cancel_btn).isDisplayed();
        return canbt;
    }
}
