package Tests;
import Base.BaseClass;
import DataProvider.DataProvidersClass;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.ResetPasswordPage;

public class LogInTest extends BaseClass
{

    @Test(priority = 1)
    public void invalidLogIn()
    {
        LoginPage lp=new LoginPage(driver);
        boolean invalid_msg =lp.invalidLogin();
        Assert.assertTrue(invalid_msg);
    }

    @Test(priority = 3 ,dataProvider = "TestData" , dataProviderClass = DataProvidersClass.class)
    public void validLogInToApplication(String User_Name, String Password)
    {
        LoginPage lp=new LoginPage(driver);
        lp.getTile();
        lp.signInToApp(User_Name, Password );
        HomePage hp=new HomePage(driver);
        hp.loginValidation();
    }

    @Test(priority = 2)
    public void validateResetPasswordLink()
    {
        LoginPage lp=new LoginPage(driver);
        lp.clickOnForgotPassword();
        ResetPasswordPage reset= new ResetPasswordPage(driver);
        reset.resetPassword();
    }


}
