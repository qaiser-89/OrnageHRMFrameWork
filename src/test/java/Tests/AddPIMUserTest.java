package Tests;
import Base.BaseClass;
import DataProvider.DataProvidersClass;
import org.testng.annotations.Test;
import pages.AdminPage;
import pages.HomePage;
import pages.LoginPage;

public class AddPIMUserTest extends BaseClass
{
    @Test(dataProvider = "TestDataForAddingPIMUser", dataProviderClass = DataProvidersClass.class)
    public void AddPIMNewUser(String loginUname, String loginPass)
    {
        LoginPage login=new LoginPage(driver);
        HomePage home=new HomePage(driver);
        AdminPage admin=new AdminPage(driver);

        login.signInToApp( loginUname, loginPass);
        home.clickOnPIMModule();

    }


}
