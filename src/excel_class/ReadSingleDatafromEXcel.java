package excel_class;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadSingleDatafromEXcel {
	public static void main(String[] args) throws Throwable {
		// reading a single data from excel file
		FileInputStream opensheet = new FileInputStream("./excel/Test_data.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(opensheet);
		XSSFSheet sheet = workbook.getSheet("Encounter");
		//it will start index from 0 so number of rows will be "excelrowcountnomber-1"
		int norow = sheet.getFirstRowNum();
		System.out.println("Number of rows in the excel shet are:" + norow);
		XSSFRow row11 = sheet.getRow(10);

		XSSFCell cell4 = row11.getCell(6);

		String capturee = cell4.toString();
		System.out.println("The value got from the excel sheet is :" + capturee);

		int lastcellnumber = sheet.getRow(0).getLastCellNum();
		System.out.println("Number of  cells number is :" + lastcellnumber);

	}

}
