package poi;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWriter {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileOutputStream fo = new FileOutputStream("C:\\FileHandling\\MyExcel.xlsx");	 //this tell where to create the workbook
		XSSFWorkbook workbook = new XSSFWorkbook();  //this creates a workbook
		
		//Now creating Sheet
		Sheet sheet = workbook.createSheet("Mysheet");   // use xssf model
		CellStyle style = workbook.createCellStyle();
		
		Row row1 = sheet.createRow(0); //create row
		style = workbook.createCellStyle();
		Cell cellA = row1.createCell(0); //create cell
		cellA.setCellValue("Hi, this cell is created from POI");	
		style.setFillForegroundColor(IndexedColors.ORANGE.getIndex());  //Fills color in the cell
		style.setFillPattern(FillPatternType.SOLID_FOREGROUND);			
		cellA.setCellStyle(style);
		
		//Change font style and size
		Font font = workbook.createFont();
		font.setFontHeightInPoints((short)12);
		font.setFontName("Aharoni");
		//font.setItalic(true);
		//font.setStrikeout(true);

		CellStyle style1 = workbook.createCellStyle();
		style.setFont(font);
		
		workbook.write(fo);
		workbook.close();
	
	
	
	
	}

}
