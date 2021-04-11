package excelFileTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.extensions.XSSFCellAlignment;

public class A3_ReadAllCellTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
 File f= new File("C:\\Vcentry\\Workspace\\A11_FileHandlingTest\\File\\Test.xlsx");
 FileInputStream fis = new FileInputStream(f);
 XSSFWorkbook workbook = new XSSFWorkbook(fis);
 XSSFSheet sheet = workbook.getSheet("Home");
 int rowcount = sheet.getLastRowNum()+1;
 int columncount = sheet.getRow(0).getLastCellNum();
 for(int i=0; i<rowcount; i++){
	 for(int j=0; j<columncount; j++){
		 String data = sheet.getRow(i).getCell(j).getStringCellValue();
		 System.out.println(data+ "");
		 
	 }
	 System.out.println();
 }
 
	}

}
