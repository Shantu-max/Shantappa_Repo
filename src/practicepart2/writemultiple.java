package practicepart2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class writemultiple {
	@Test
	public void Multiple() throws IOException, InterruptedException {
		FileOutputStream out = new FileOutputStream("./Excel2/writehere.xlsx");
		XSSFWorkbook book = new XSSFWorkbook();
		XSSFSheet sheet1 = book.createSheet("fresh_data");
		XSSFSheet sheet2 = book.createSheet("fresh_data1");

		for (int i = 0; i <= 10; i++) 
		{
			XSSFRow row = sheet1.createRow(i);
			XSSFRow row1 = sheet2.createRow(i);
			for (int j = 0; j <= 2; j++) {
				
		
				XSSFCell cell = row.createCell(j);
				XSSFCell cell1 = row1.createCell(j);
				cell.setCellValue("DEV2017");
				cell1.setCellValue("DEV20177");
			}
		}

		book.write(out);
		//book.close();
		out.close();
		
//row 0 
	}

}
