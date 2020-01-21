package excel_class;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class write2 
{
@Test
public void display() throws IOException 
{
	FileOutputStream out=new FileOutputStream("./excel/write.xlsx");
	XSSFWorkbook book=new XSSFWorkbook();
	XSSFSheet sheet = book.createSheet("important");
	XSSFRow Row = sheet.createRow(11);
	XSSFCell cell = Row.createCell(11);
	cell.setCellValue("added");
	book.write(out);
	out.close();
	
	
	
	
	
}
}

