package Tests;
import Base.BaseClass;
import DataProvider.DataProvidersClass;
import org.testng.annotations.Test;
import pages.AddPIMUserPage;
import pages.AdminPage;
import pages.HomePage;
import pages.LoginPage;

public class AddPIMUserTest extends BaseClass
{
    @Test(dataProvider = "TestDataForAddingPIMUser", dataProviderClass = DataProvidersClass.class)
    public void AddPIMNewUser(String loginUname, String loginPass, String F_name, String M_name, String L_name, String id_to, String U_name, String pass_to_add, String conPass_to_add  )
    {
        LoginPage login=new LoginPage(driver);
        HomePage home=new HomePage(driver);
        AddPIMUserPage addPIMU=new AddPIMUserPage(driver);

        login.signInToApp( loginUname, loginPass);
        home.clickOnPIMModule();
        addPIMU.checkCancelBtnAvailable();
        addPIMU.addNewPIMUser(F_name, M_name, L_name, id_to, U_name, pass_to_add,conPass_to_add);
    }
}
