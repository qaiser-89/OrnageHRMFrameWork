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
	

}
