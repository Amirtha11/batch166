package excelFileTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class A1_ExcelFileTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
File f= new File("C:\\Vcentry\\Workspace\\A11_FileHandlingTest\\File\\Test.xlsx");
FileInputStream fis = new FileInputStream(f);
XSSFWorkbook workbook = new XSSFWorkbook(fis);
XSSFSheet sheet = workbook.getSheet("Home");
int rowcount = sheet.getLastRowNum()+1; //+1 to avoid indexing
int columncount = sheet.getRow(0).getLastCellNum();
System.out.println(rowcount);
System.out.println(columncount);


	}

}
