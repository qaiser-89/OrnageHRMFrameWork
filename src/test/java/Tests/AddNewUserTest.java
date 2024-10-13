package Tests;

import Base.BaseClass;
import DataProvider.DataProvidersClass;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AddUserPage;
import pages.AdminPage;
import pages.HomePage;
import pages.LoginPage;

public class AddNewUserTest extends BaseClass
{
    @Test(dataProvider = "TestDataForAddingUser" , dataProviderClass = DataProvidersClass.class)
    public void AddNewUserAdmin(String uname, String password, String empName, String UsrName, String Pass, String Con_Pass)
    {
        LoginPage login=new LoginPage(driver);
        HomePage home=new HomePage(driver);
        AdminPage admin=new AdminPage(driver);
        AddUserPage add=new AddUserPage(driver);
        login.signInToApp(uname, password);
        home.clickOnAdminModule();
        admin.clickOnAdminBtn();
        add.addNewUser(empName, UsrName, Pass, Con_Pass);
    }
    public void addUserValidation()
    {
        AddUserPage add=new AddUserPage(driver);
        Assert.assertTrue(add.successMsgShowed());
    }

}
