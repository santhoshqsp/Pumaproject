package genericlibraries;

import java.io.FileInputStream;


import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel implements constant {
	public static String getdata(String sheet,int row,int cell) {
		String s="";
		try {
	FileInputStream f=new FileInputStream(excelpath);
	Workbook wb = WorkbookFactory.create(f);
	s=wb.getSheet(sheet).getRow(row).getCell(cell).toString();
	
	}
		catch(Exception e) {
			
		}
		return s;
	}

}
