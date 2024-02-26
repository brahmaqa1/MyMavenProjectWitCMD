package ExcelBasics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtilties 
{  // WebUtilities --->  textbox,checkbox,radio btn
	//                  reusable methods  realted to each webelment 
	//  contains resuable methods of excel file 
	//   
	
	public static int getRowscnt(String xlFile,String sheetName) throws EncryptedDocumentException, IOException
	{
//		String xlFile = "C:\\brahma\\Practise\\MyTestData.xlsx";
		FileInputStream fis  = new FileInputStream(xlFile);
		//  wb
		Workbook wb = WorkbookFactory.create(fis);
		// sheet
		Sheet sh = wb.getSheet(sheetName);
		int rowsCnt= sh.getLastRowNum();
//		System.out.println("rowsCnt="+rowsCnt);//  3  actual cnt = 4
		return rowsCnt +1;
	}
	
	//readDataFromExcel(xlFile,"Mysheet",0,0)
	//readDataFromExcel(xlFile,"Users",0,0)
	public static String readDataFromExcel(String xlFile,String sheet, int rowNo, int cellNo) throws EncryptedDocumentException, IOException
	{
		//wb
		FileInputStream fis  = new FileInputStream(xlFile);
		Workbook wb = WorkbookFactory.create(fis);		
		//sheet
		Sheet sh = wb.getSheet(sheet);		
		// read data 0 , 0
//		String data = sh.getRow(rowNo).getCell(cellNo).toString();
//		rowNo =  rowNo -1;// 1-1=0
//		cellNo = cellNo -1;// 1-1= 0
		String data = sh.getRow(rowNo-1).getCell(cellNo-1).toString();
		System.out.println("data form cell="+ rowNo  + ","+cellNo +"-->"+ data);
		return data;
	}
//	isGivenSheetExist(xlFile, "Mysheet");
//	isGivenSheetExist(xlFile, "Users");
	
	public static void isGivenSheetExist(String xlFile,String sheet) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis  = new FileInputStream(xlFile);
		Workbook wb = WorkbookFactory.create(fis);		
		//sheet
		int sheetIndexno = wb.getSheetIndex(sheet)	;
		//            0
		// sheetIndexno  = 0
		if(sheetIndexno>=0)
		{//    0> =0 
			System.out.println("Given sheet= " +sheet+" is  available in excel = "+xlFile);	
		}
		
		else
		{
			System.out.println("Given sheet= " +sheet+" is  not available in excel = "+xlFile);	
		}
		
		
	}

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
				//  Apache POI:

				String xlFile = "C:\\brahma\\Practise\\MyTestData.xlsx";

				// call getRowSCnt
				int  rowsCnt2 =	getRowscnt(xlFile, "Mysheet");
				System.out.println("rowsCnt2="+rowsCnt2);// 5
				
				// read from 'users' sheet
				rowsCnt2 =	getRowscnt(xlFile, "Users");
				System.out.println("rowsCnt2="+rowsCnt2);// 1
				
				// read data from 1,1
				String data = readDataFromExcel(xlFile,"Mysheet",1,1);
				System.out.println("data00="+data);
				
				//   1st row 2nd col
				data = readDataFromExcel(xlFile,"Mysheet",1,2);
				System.out.println("data01="+data);
				
				
				data = readDataFromExcel(xlFile,"Users",1,1);
				System.out.println("From users sheet , data="+data);
				
				// 
				data = readDataFromExcel(xlFile,"Users",1,2);
				System.out.println("From users sheet , data="+data);//100
				
				//
				isGivenSheetExist(xlFile, "Mysheet");
				isGivenSheetExist(xlFile, "Users");
				
				isGivenSheetExist(xlFile, "Users1234");
				
	}

}
