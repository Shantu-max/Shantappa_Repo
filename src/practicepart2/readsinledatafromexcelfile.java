package practicepart2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class readsinledatafromexcelfile 
{

	@Test
	public void readData() throws IOException
	{
		FileInputStream read=new FileInputStream("./Excel2/readme.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(read);
		XSSFSheet sheet = workbook.getSheet("conduent");
		XSSFRow row = sheet.getRow(8);
		XSSFCell cell = row.getCell(6);
		String RedData = cell.toString();
		System.out.println(RedData);
		//if there is no data present in the webpage and if we try to read the data then we will get nullpointerException
		
		
		
		
	}
	
	
}

