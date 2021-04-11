package excelFileTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.record.formula.functions.Count;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class A4_ReadNumberTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
String m="5";
File f= new File("C:\\Vcentry\\Workspace\\A11_FileHandlingTest\\File\\number.xlsx");
FileInputStream fis = new FileInputStream(f);
XSSFWorkbook workbook = new XSSFWorkbook(fis);
XSSFSheet sheet = workbook.getSheet("Home");
int rowcount = sheet.getLastRowNum()+1;
int columncount = sheet.getRow(0).getLastCellNum();
for(int i=0; i<rowcount; i++){
	for(int j=0; j<columncount; j++){
		if(sheet.getRow(i).getCell(j).getCellType()==Cell.CELL_TYPE_STRING){
			//sheet.getRow(i).getCell(j).setCellType(Cell.CELL_TYPE_STRING);
			String data= sheet.getRow(i).getCell(j).getStringCellValue();
			System.out.println(data+ "");
		}
		else if(sheet.getRow(i).getCell(j).getCellType()==Cell.CELL_TYPE_NUMERIC){
			//sheet.getRow(i).getCell(j).setCellType(Cell.CELL_TYPE_STRING);
			int data= (int) sheet.getRow(i).getCell(j).getNumericCellValue();
			System.out.println(data+ "");
		}
	}
	System.out.println();
}
	}

}
