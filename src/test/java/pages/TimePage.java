package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TimePage
{
    WebDriver driver;

    public TimePage(WebDriver driver)
    {
        this.driver=driver;
    }

    protected By name_type =By.xpath("//input[@placeholder='Type for hints...']");
    protected By view_btn = By.xpath("button[type='submit']");
    protected By no_time_found = By.xpath("//p[text()='No Timesheets Found']");
    protected By create_timesheet = By.xpath("//button[text()=' Create Timesheet ']");
    protected By project_field = By.xpath("//th[normalize-space()='Project']//following::input[1]");
    protected By activity_field = By.xpath("//th[normalize-space()='Activity']/following::div[11]");
    protected By acitivity_selection = By.xpath("//span[normalize-space()='Manage Employee Inquiries']");
    protected By Monday_field= By.xpath("//th[normalize-space()='Activity']/following::div[17]");
    protected By Tuesday_field= By.xpath("//th[normalize-space()='Activity']/following::div[18]");
    protected By Wednesday_field= By.xpath("//th[normalize-space()='Activity']/following::div[24]");
    protected By Thursday_field= By.xpath("//th[normalize-space()='Activity']/following::div[26]");
    protected By Friday_field= By.xpath("//th[normalize-space()='Activity']/following::div[29]");
    protected By Saturday_field= By.xpath("//th[normalize-space()='Activity']/following::div[32]");
    protected By Sunday_field= By.xpath("//th[normalize-space()='Activity']/following::div[35]");
    protected By save_btn = By.xpath("//button[normalize-space()='Save']");
    protected By cancel_btn = By.xpath("//button[normalize-space()='Cancel']");
    protected By reset_btn = By.xpath("//button[normalize-space()='Reset']");



}
