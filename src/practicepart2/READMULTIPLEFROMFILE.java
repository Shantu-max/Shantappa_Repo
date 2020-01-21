package practicepart2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class READMULTIPLEFROMFILE
{
	@Test
	public void ReadMultiple() throws IOException {
		FileInputStream read=new FileInputStream("./Excel2/readme.xlsx");
		XSSFWorkbook book=new XSSFWorkbook(read);
		XSSFSheet sheet = book.getSheet("conduent");
		
		for(int i=0;i<=sheet.getLastRowNum();i++) 
		{
			System.out.println();
			for(int j=0;j<sheet.getRow(0).getLastCellNum();j++) 
			{
				XSSFRow row = sheet.getRow(i);
				XSSFCell cell = row.getCell(j);
				System.out.print(" "+cell.toString()+"                               ");
			}
		}
		
		
	}

}
