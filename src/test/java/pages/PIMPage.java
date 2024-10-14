package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PIMPage
{
    WebDriver driver;
    public PIMPage(WebDriver driver)
    {
        this.driver=driver;
    }

    protected By emp_name = By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/input[1]");
    protected By search_btn = By.xpath("//button[normalize-space()='Search']");
    protected By reset_btn = By.xpath("//button[normalize-space()='Reset']");
    /*protected By search_btn = By.xpath("//button[normalize-space()='Search']");
    protected By search_btn = By.xpath("//button[normalize-space()='Search']");
    protected By search_btn = By.xpath("//button[normalize-space()='Search']");
    protected By search_btn = By.xpath("//button[normalize-space()='Search']");
    protected By search_btn = By.xpath("//button[normalize-space()='Search']");
*/
}
