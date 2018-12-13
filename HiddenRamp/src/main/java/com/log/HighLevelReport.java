package com.log;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.utils.TestMethodSetup;

public class HighLevelReport extends TestMethodSetup{

	static ExtentReports report;
	 static ExtentTest logger;	
	
	public static void extentReport(String filePath)
	{
		
		report=new ExtentReports(filePath);
		logger=report.startTest("test started");
		
	}
}
