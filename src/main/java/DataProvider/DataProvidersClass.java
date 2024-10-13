package DataProvider;

import org.testng.annotations.DataProvider;

public class DataProvidersClass 
{
	@DataProvider(name= "TestData")
	public static Object[][] getData()
	{
		Object[][] arr=	ExcelReader.getDataFromExcel("LoginData");
		return arr;
	}


	@DataProvider(name= "TestDataForAddingUser")
	public static Object[][] getDataForAddUser()
	{
		Object[][] arr=	ExcelReader.getDataFromExcel("AddUserData");
		return arr;
	}
	

}
