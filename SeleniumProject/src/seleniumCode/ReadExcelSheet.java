package seleniumCode;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelSheet {
	
	XSSFWorkbook  wb ;
	XSSFSheet sheet1;
	
	public  ReadExcelSheet(String Path)
	{
		try {
			File scrfile = new File(Path);
			FileInputStream fis = new FileInputStream(scrfile);
			
			wb = new XSSFWorkbook(fis);	
	
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
		
	}
	
	public String ReadData(int Sheetnumber,int rownum,int cellnum)
	{
		sheet1=wb.getSheetAt(Sheetnumber);
		String data=sheet1.getRow(rownum).getCell(cellnum).getStringCellValue();
		return data;
		
		
	}
	
	public int rowCount(int sheetIndex)
	{
	
		int row=wb.getSheetAt(sheetIndex).getLastRowNum();
		row=row+1;
		return row;
	}

}
