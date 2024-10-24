package utilPack;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelread {
	
	
	public static String[][] readexcel(String datafile) throws IOException{
		
		XSSFWorkbook wb = new  XSSFWorkbook("./ExcelFolder/"+datafile+".xlsx");
		
//		Accessing Sheet by index
		XSSFSheet sheet = wb.getSheetAt(0);
		
//		Get LastRow
		int rowcount = sheet.getLastRowNum();
		System.out.println(rowcount);
		
//		GetLastColumn
		int columncount = sheet.getRow(1).getLastCellNum();
		System.out.println(columncount);
		
//		Get Lastcellvalue
		String cellvalue = sheet.getRow(1).getCell(0).getStringCellValue();
		System.out.println(cellvalue);
		
		
		String[][] value = new String[rowcount] [columncount];
		
		for(int i = 1 ; i<= rowcount ; i++) {
			
			for(int j=0; j<columncount ; j++) {
				
				String data = sheet.getRow(i).getCell(j).getStringCellValue();
				value[i-1][j] = data;
				
				System.out.println(data);
			}
			
		}
		
		wb.close();
		return value;
		
	}

}

