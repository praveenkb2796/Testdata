package Hybridframeworkgen;


import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class hydfrmdata {
	      public  String value="";
	public static  void fectch_data()
	{
                      try {
	FileInputStream fis = new FileInputStream("./Excel/Hybfrmdata.xlxs");// it is class we can create object for class not for interface
						                   Workbook book = WorkbookFactory.create(fis);// because it doesnot support constructor
						                             Sheet sheet = book.createSheet();
						                                    Row row = sheet.createRow(1);
						                                  Cell cell = row.createCell(2);
						                                   String value = cell.toString();
						                                              
						
						
						
						
						
						
						
						
						
						
						
						
						
						
					} catch (FileNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
                       
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
