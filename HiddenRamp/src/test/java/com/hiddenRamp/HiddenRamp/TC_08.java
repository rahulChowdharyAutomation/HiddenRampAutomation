package com.hiddenRamp.HiddenRamp;

import java.util.List;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.ObjectRepository.OR;
import com.utils.TestCaseReader;
import com.utils.TestMethodSetup;
import com.utils.commonFunction;

public class TC_08 extends TestMethodSetup {
	@Test(priority=1,dataProvider="value")
	public void loginsteps(List testarray)
	{
		String url=testarray.get(1).toString();
		commonFunction.navigateUrl(url);
		commonFunction.click(OR.HIDDENRAMP_FB_LOGIN_ICON);
		commonFunction.enterInput(OR.HIDDENRAMP_FB_LOGIN_USERNAME_TEXTBOX, "meetrahi9@gmail.com");
		commonFunction.enterInput(OR.HIDDENRAMP_FB_LOGIN_PASSWORD_TEXTBOX, "keepsafedude9");
		commonFunction.click(OR.HIDDENRAMP_FB_LOGIN_SUBMIT_BUTTON);
	}
	
	Logger log=Logger.getLogger(TC_02.class);
	@Test(priority=2,dataProvider="value")
	public void teststeps(List testarray)
	{
		 try {
		PropertyConfigurator.configure("/Users/rahulchowdhary/eclipse-workspace/HiddenRamp/log4j.properties");
		commonFunction.click(OR.HOMEPAGE_SETTINGS_ICON_DROPDOWN);
		log.info("dropdown clicked");
		commonFunction.click(OR.HOMEPAGE_SETTINGSOPTION_FROM_DROPDOWN);
		commonFunction.click(OR.BLOCKING_OPTION_IN_SETTINGS);
		if(commonFunction.elementDisplayedOrNot(OR.PROFILENAME_OF_BLOCKEDUSER)==true)
			log.info("profile name is displayed");
			if(commonFunction.elementDisplayedOrNot(OR.PROFILEPHOTO_OF_BLOCKEDUSER)==true)
				log.info("profile photo is displayed");
				if(commonFunction.elementDisplayedOrNot(OR.UNBLOCK_BUTTON_INSIDE_BLOCKEDUSERS)==true)
					log.info("unblock button is displayed");
		 }
		 catch(Exception e) {
			 System.out.println(e);
			 log.info("test failed");
		 }
		
	}
	
	
	
	@DataProvider(name="value")
	public Object[][] testdata()
	{
		Object[][] ob;
		ob=TestCaseReader.gettestdata("MyTestCases.xlsx", "Sheet1", "TC_08", "yes");
		
		return ob;
		
	}

}
