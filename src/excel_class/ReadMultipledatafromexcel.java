package excel_class;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadMultipledatafromexcel {

	
	@Test
	public static void main() throws IOException {
		// this will open excl sheet in input mode internally , we cant see it
		// and fillocation >>will be pointing towards the excel sheet(test_data) sheet
		FileInputStream fillocation = new FileInputStream("./excel/Test_data.xlsx");
		XSSFWorkbook book = new XSSFWorkbook(fillocation);

		XSSFSheet sheet = book.getSheet("Encounter");

		// we have to read muliple data from excel sheet
		// we need two for loop , one loop is when row number is 1 then i have to read
		// all the values in the specific row

		for (int i = 0; i <= sheet.getLastRowNum(); i++) {
		
System.out.println(" ");
			for (int j = 0; j < sheet.getRow(0).getLastCellNum(); j++) 
			{
				XSSFRow row = sheet.getRow(i);
				String read = row.getCell(j).toString();
				// System.out.println("The number of datas from the excel sheet are :"+read);
				System.out.print("  "+ read);
			}

		}

	}

}
