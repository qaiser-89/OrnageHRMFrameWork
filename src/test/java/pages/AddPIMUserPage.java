package pages;

import Helper.Utility;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

public class AddPIMUserPage
{
    WebDriver driver;
    public AddPIMUserPage(WebDriver driver)
    {
        this.driver= driver;
    }

    protected By add_btn = By.xpath("/html/body/div/div[1]/div[1]/header/div[2]/nav/ul/li[3]/a");
    protected By emp_first_name = By.xpath("//input[@placeholder='First Name']");
    protected By emp_middle_name = By.xpath("//input[@placeholder='Middle Name']");
    protected By emp_last_name = By.xpath("//input[@placeholder='Last Name']");
    protected By emp_id_field = By.xpath("//label[text()='Employee Id']//following::input[1]"); //First clear and then add id code
    protected By create_login_btn = By.xpath("//p[text()='Create Login Details']/following::div[1]");
    protected By user_name_btn = By.xpath("//label[normalize-space()='Username']//following::input[1]");
    protected By password_field = By.xpath("//label[text()='Password']/following::input[1]");
    protected By password_con_field = By.xpath("//label[text()='Password']/following::input[2]");
    protected By cancel_btn = By.xpath("//button[normalize-space()='Cancel']");
    protected By save_btn = By.xpath("//button[normalize-space()='Save']");
    protected By success_msg = By.xpath("//p[contains(.,'Successfully Saved')]");




    protected By other_id_field = By.xpath("//label[text()='Other Id']/following::input[1]");
    protected By driving_license = By.xpath("//label[contains(.,\"Driver's License Number\")]/following::input[1]");
    protected By license_expiry = By.xpath("//label[contains(.,\"License Expiry Date\")]/following::input[1]");
    protected By marital_status = By.xpath("//label[contains(.,'Marital Status')]/following::div[1]");
    protected By gender_male = By.xpath("//label[normalize-space()='Male']");
    protected By date_of_birth = By.xpath("//label[text()='Date of Birth']/following::input[1]");
    protected By blood_type = By.xpath("//label[text()='Blood Type']/following::div[1]");
    protected By blood_O_selection = By.xpath("//label[text()='Blood Type']/following::div[12]");



    public void addNewPIMUser(String Fname,String Mname, String Lname, String id, String Uname,String pass, String conPass)
    {
        Utility.waitForElement(driver, add_btn).click();
        Utility.waitForElement(driver, emp_first_name).sendKeys(Fname);
        Utility.waitForElement(driver, emp_middle_name).sendKeys(Mname);
        Utility.waitForElement(driver, emp_last_name).sendKeys(Lname);
        Utility.waitForElement(driver, emp_id_field).sendKeys(id);
        Utility.waitForElement(driver, create_login_btn).click();
        Utility.waitForElement(driver, user_name_btn).sendKeys(Uname);
        Utility.waitForElement(driver, password_field).sendKeys(pass);
        Utility.waitForElement(driver, password_con_field).sendKeys(conPass);
        Utility.waitForElement(driver, save_btn).click();
        Utility.waitForElement(driver, success_msg).isDisplayed();
    }
        Faker fake=new Faker();
    //same testcase by using fakers class/library:


    public void addNewPMIUserUsingFackerClass()
    {
        Utility.waitForElement(driver, add_btn).click();
        String fname = fake.name().firstName();
        Utility.waitForElement(driver, emp_first_name).sendKeys(fname);
        String mname = fake.name().lastName();
        Utility.waitForElement(driver, emp_middle_name).sendKeys(mname);
        String lname = fake.name().lastName();
        Utility.waitForElement(driver, emp_last_name).sendKeys(lname);
        Utility.waitForElement(driver, emp_id_field).sendKeys("1");
        Utility.waitForElement(driver, create_login_btn).click();
        String usrname = fake.name().fullName();
        Utility.waitForElement(driver, user_name_btn).sendKeys(usrname);
        Utility.waitForElement(driver, password_field).sendKeys("Test@123");
        Utility.waitForElement(driver, password_con_field).sendKeys("Test@123");
        Utility.waitForElement(driver, save_btn).click();
        Utility.waitForElement(driver, success_msg).isDisplayed();
        Utility.sleep(3);

        /*Utility.waitForElement(driver, other_id_field).sendKeys(fake.idNumber().invalid());
        Utility.waitForElement(driver, driving_license).sendKeys(fake.idNumber().valid());
        Utility.waitForElement(driver, license_expiry).sendKeys("2026-10-15");
        Utility.waitForElement(driver, marital_status).sendKeys("Married");
        Utility.waitForElement(driver, gender_male).click();
        Utility.waitForElement(driver, date_of_birth).sendKeys("2001-10-15");
        Utility.waitForElement(driver, blood_type).click();
        Utility.waitForElement(driver, blood_O_selection).click();*/

        Reporter.log("valid ID number is:  "+fake.idNumber().invalid(), true);
        Reporter.log(driver.getCurrentUrl(), true);
        Reporter.log("Fake fname used is"+fname, true);
        Reporter.log("Fake mname used is"+mname, true);
        Reporter.log("Fake lname used is"+lname, true);
        Reporter.log("Fake usrname used is"+usrname, true);
    }

    public boolean checkCancelBtnAvailable()
    {
      boolean  canbt = Utility.waitForElement(driver, cancel_btn).isDisplayed();
        return canbt;
    }



}
