package excelFileTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TaskTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f= new File("C:\\Vcentry\\Workspace\\A11_FileHandlingTest\\File\\blank.xlsx");
		FileInputStream fis = new FileInputStream(f);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.createSheet("task3");
		FileOutputStream fos =new FileOutputStream(f);
		
		for(int i=0; i<1000; i++){
			XSSFRow row = sheet.createRow(i);
			XSSFCell cell = row.createCell(i);
			cell.setCellValue("vcentry guindy"+ i);
		}
		workbook.write(fos);
		fos.close();
	}

}
