package com.utils;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class TestCaseReader {
	
	public static List<List<String>> readxls(String xlsfilename,String sheetname,String testcaseid,String runmode)
	{
		
List<List<String>> finallist=new ArrayList<List<String>>();
		
		
		
		try {
			
			List<List<String>> mainlist=new ArrayList<List<String>>();
			
			List<String> list;
			
			String path=System.getProperty("user.dir")+"/src/TestData/";
			
			FileInputStream file=new FileInputStream(path+xlsfilename);
			
			Workbook wb=WorkbookFactory.create(file);
		
			Sheet sh=wb.getSheet(sheetname);
			
    int rowcount=sh.getPhysicalNumberOfRows();
			
			
			for(int i=0;i<rowcount;i++)
			{
				list = new ArrayList<String>();   //purpose of creating this list inside loop is because we want the scope of this list to be limited so that id doesn't pick up any garbage data if kept outside
				list.clear();      //ensuring there is no garbage data.
				
				Row ro=sh.getRow(i);
				
				int cellcount=ro.getLastCellNum();
				
				for(int j=0;j<cellcount;j++)
				{
					
					Cell ce=ro.getCell(j);
					
					ce.setCellType(Cell.CELL_TYPE_STRING);
					
					
					
					list.add(ce.getStringCellValue());  //entire cells of the 1st row is added to the list
					
				}
				
				mainlist.add(list);    //entire 1st row is added to the mainlist, then entire 2nd row and so on.
				
			}
			
			
			
			// code for deciding which test case you have to run
			mainlist.remove(0);   //this removes the entire 1st row or the header row from the mainlist 
			
			for(int i=0;i<mainlist.size();i++)
			{
				
				String tcid=mainlist.get(i).get(0);    //mainlist ka pehla row ka pehla cell get kr raha hai.
			   String runmde=mainlist.get(i).get(2);   //mainlist ka pehla row ka doosra cell get kr raha hai.
			   
			   
			   
			   if(runmode.equals(runmde) && testcaseid.equals(tcid))
			   {
				   
				   
				   finallist.add(mainlist.get(i));  //if the condition is true we add that particular row inside the final list.
				   
			   }	
			}
		} 
		catch (Exception e) 
		{
			
		}
		return finallist;	
		
	}
	
	
	
	public static Object[][] gettestdata(String xlsfilename,String sheetname,String testcaseid,String runmode)
	{
		
		Object[][] ob;
		List<List<String>> listvalue=readxls(xlsfilename, sheetname, testcaseid, runmode);  //final list is inside listvalue now
		
		ob=new Object[listvalue.size()][];     //size of the object is being determined by the size of listvalue
		
		for(int i=0;i<ob.length;i++)
		{
			
			ob[i]=new Object[] {listvalue.get(i)};    //individual object is being created for every element inside listvalue
			
		}
		
		
		return ob;
	}

}

