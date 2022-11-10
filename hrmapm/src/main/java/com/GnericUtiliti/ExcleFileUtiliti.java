package com.GnericUtiliti;

import java.io.FileInputStream;
import java.io.IOException;

import  org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.w3c.dom.events.EventException;

public class ExcleFileUtiliti {
	public String readDatafromExcleFile( String SheetName,int RowNo,int columNo) throws EventException, IOException
	{
		FileInputStream fil = new FileInputStream(I_pathconstant.exclefilepath);
		     Workbook book = WorkbookFactory.create(fil);
		   Sheet sheet = book.getSheet(SheetName);
		       Row row = sheet.getRow(RowNo);
		           Cell cle = row.getCell(columNo);
		          String value = cle.toString();
		        		  book.close();
		          return value;
	}
}
