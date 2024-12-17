package DataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.Reporter;

public class ExcelReader 
{
	public static Object[][] getDataFromExcel(String SheetName)
	{
		XSSFWorkbook enWorkBook=null;
		try
		{
			enWorkBook = new XSSFWorkbook(new FileInputStream(new File(System.getProperty("user.dir")+"/TestData/TestData.xlsx")));
		}
		catch (FileNotFoundException e) 
		{
		} catch (IOException e)
		{
			Reporter.log("LOG:Fail Could Not Load The Excel File"+e.getMessage(), true);
		}
		int rowCount=enWorkBook.getSheet(SheetName).getPhysicalNumberOfRows();
		int cellCount=enWorkBook.getSheet(SheetName).getRow(0).getPhysicalNumberOfCells();
		
		Object[][]arr=new Object[rowCount][cellCount];
		
		for(int i=0;i<rowCount;i++)
		{
			for(int j=0;j<cellCount;j++)
			{
				String valueString="";
				
				CellType type=enWorkBook.getSheet(SheetName).getRow(i).getCell(j).getCellType();
				if(type==CellType.STRING)
				{
					valueString=enWorkBook.getSheet(SheetName).getRow(i).getCell(j).getStringCellValue();
				}
				else if(type==CellType.NUMERIC)
				{
					double  doublevalue=enWorkBook.getSheet(SheetName).getRow(i).getCell(j).getNumericCellValue();
					valueString=String.valueOf(doublevalue);
				}
				else if(type==CellType.BOOLEAN)
				{
				Boolean valueboolean=enWorkBook.getSheet(SheetName).getRow(i).getCell(j).getBooleanCellValue();
				valueString=String.valueOf(valueboolean);
				}
				else if(type==CellType.BLANK)
				{
					valueString="";
				}
				arr[i][j]=valueString;	}
		}
		return arr;
		}
	}