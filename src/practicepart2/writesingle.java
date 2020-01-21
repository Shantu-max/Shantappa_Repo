package practicepart2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class writesingle 
{
	@Test
	public void writesingledata() throws IOException 
	{
		FileOutputStream out=new FileOutputStream("./Excel2/writehere.xlsx");
		XSSFWorkbook book=new XSSFWorkbook();
		XSSFSheet sheet = book.createSheet("gadagron");
		XSSFRow row = sheet.createRow(10);
		XSSFCell cell = row.createCell(5);
		cell.setCellValue("10/12/2019");
		book.write(out);
		out.close();
		book.close();
		
	
		
		
		
		
		
		
	}

}
