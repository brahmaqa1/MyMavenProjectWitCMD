package ExcelBasics;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.xalan.templates.StylesheetRoot;

public class ReadDataFromExcelByXssfworkbook {

	public static void main(String[] args) throws IOException {
		String xlFile = "C:\\brahma\\Practise\\MyTestData.xlsx";


		FileInputStream  fis = new FileInputStream(xlFile);
		// create obj for -XSSFWorkbook class

		
		XSSFWorkbook  wb = new XSSFWorkbook(fis);
		XSSFSheet xssfSh =       wb.getSheet("Mysheet");
		int rowsCnt = xssfSh.getLastRowNum();
		int colscnr = xssfSh.getRow(0).getLastCellNum();
			System.out.println("rowsCnt="+rowsCnt);
			System.out.println("colscnr="+colscnr);
			
		// read data from row no, cell no = 0,0 
			String data00=  xssfSh.getRow(0).getCell(0).toString();
			
		System.out.println("data00="+data00);
		// data00=ProductName

		// HW read data from  row no, cell no = 0,1


		// HW read data from  row no, cell no = 0,2


		// HW read data from  row no, cell no =1,0

		//		HW read data from  row no, cell no =1,1




	}

}
