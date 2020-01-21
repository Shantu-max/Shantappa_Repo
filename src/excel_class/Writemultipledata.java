package excel_class;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Writemultipledata 
{
	@Test
	public void writedata() throws IOException 
	{
		FileOutputStream out=new FileOutputStream("./excel/write.xlsx");
		XSSFWorkbook book=new XSSFWorkbook();
		XSSFSheet sheet=book.createSheet("testdata");
		
		for(int i=0;i<3;i++) 
		{
		XSSFRow	row=sheet.createRow(i);
			for(int j=0;j<3;j++) 
			{
				row.createCell(j).setCellValue("I LOVE MY INDIA");
				
				
				
			}
			
		}
		book.write(out);
		out.close();
		
		
	}

}
