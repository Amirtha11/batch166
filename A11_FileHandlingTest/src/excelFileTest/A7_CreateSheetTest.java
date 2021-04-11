package excelFileTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class A7_CreateSheetTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f= new File("C:\\Vcentry\\Workspace\\A11_FileHandlingTest\\File\\blank.xlsx");
		FileInputStream fis = new FileInputStream(f);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.createSheet("Vcentry");
		XSSFRow row = sheet.createRow(1);
		XSSFCell cell= row.createCell(1);
		cell.setCellValue("Vcentry Guindy");
		FileOutputStream fos = new FileOutputStream(f);
		workbook.write(fos);
		fos.close();
	}

}
