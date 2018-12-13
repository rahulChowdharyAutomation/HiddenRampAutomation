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

public class TC_01 extends TestMethodSetup {
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
		log.info("setting option clicked");
		if(commonFunction.elementDisplayedOrNot(OR.SETTINGS_HEADER_INSIDE_SETTINGOPTION)==true);
		log.info("ele1 is displayed");
		if(commonFunction.elementDisplayedOrNot(OR.BLOCKING_OPTION_IN_SETTINGS)==true);
		log.info("ele2 is displayed");
		if(commonFunction.elementDisplayedOrNot(OR.CHANGEPASSWORD_OPTION_IN_SETTINGS)==true);
		log.info("ele3 is displayed");
		if(commonFunction.elementDisplayedOrNot(OR.DATAPOLICY_OPTION_IN_SETTINGS)==true);
		log.info("ele4 is displayed");
		if(commonFunction.elementDisplayedOrNot(OR.FEEDBACK_OPTION_IN_SETTINGS)==true);
		log.info("ele5 is displayed");
		if(commonFunction.elementDisplayedOrNot(OR.PRIVACYPOLICY_OPTION_IN_SETTINGS)==true);
		log.info("ele6 is displayed");
		if(commonFunction.elementDisplayedOrNot(OR.REPORTANISSUE_OPTION_IN_SETTINGS)==true);
		log.info("ele7 is displayed");
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
		ob=TestCaseReader.gettestdata("MyTestCases.xlsx", "Sheet1", "TC_01", "yes");
		
		return ob;
		


}
}