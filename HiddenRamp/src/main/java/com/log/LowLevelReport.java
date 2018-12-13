package com.log;

import org.apache.log4j.PropertyConfigurator;

import com.utils.TestMethodSetup;

public class LowLevelReport extends TestMethodSetup {
	
	public static void log4j(String filepath)
	{
		
		PropertyConfigurator.configure(filepath);
	}

}
