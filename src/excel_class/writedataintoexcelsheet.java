package excel_class;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class writedataintoexcelsheet
{
	@Test
	public void Write() throws IOException
	{
		FileOutputStream out=new FileOutputStream("./excel/write.xlsx");
		XSSFWorkbook book=new XSSFWorkbook();
		
		XSSFSheet created = book.createSheet("contact");
		XSSFRow count = created.createRow(4);
		XSSFCell count1 = count.createCell(0);
		count1.setCellValue(true);
		book.write(out);
		out.close();
		
		
	
		
		
		
	}

}
