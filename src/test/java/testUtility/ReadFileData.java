package testUtility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;



public class ReadFileData {
	
	public static String fetchDataFromExcel (int i, int j) throws IOException   {
		String data= "";
		String path = "src"+File.separator+"test"+File.separator+"resources"+File.separator+"TestExcel"+File.separator+"Testcase.xlsx";
		FileInputStream file = new FileInputStream(path);
		
		Sheet s = WorkbookFactory.create(file).getSheet("Velocity");
		
		Cell c= s.getRow(i).getCell(j);
		CellType type = c.getCellType();
		
		if(type==CellType.STRING)
		{
			data = c.getStringCellValue();
		}
		  else	if(type==CellType.NUMERIC)
		{
			double Number = c.getNumericCellValue();
			data=Double.toString(Number);
		}
		  else if(type==CellType.BLANK)
		{
			data ="";
		}
		return data;
	}
	
		
		
	}
	

