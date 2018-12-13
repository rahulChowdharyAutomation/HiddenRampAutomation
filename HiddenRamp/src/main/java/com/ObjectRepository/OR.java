package com.ObjectRepository;

public class OR {
	//CONNECTIONS IN MY PROFILE PAGE
	public static final String GMAIL_SIGNIN_LINK="//a[@class='gmail-nav__nav-link gmail-nav__nav-link__sign-in']";
	public static final String HIDDENRAMP_FB_LOGIN_ICON="//img[@src='/drawable/facebook-icon.png']";
	public static final String HIDDENRAMP_FB_LOGIN_USERNAME_TEXTBOX="//input[@type='text']";
	public static final String HIDDENRAMP_FB_LOGIN_PASSWORD_TEXTBOX="//input[@type='password']";
	public static final String HIDDENRAMP_FB_LOGIN_SUBMIT_BUTTON="//button[@value='1']";
	public static final String HIDDENRAMP_GOTOUSERSHOMEPAGE_LINK="//a[@class='goToProfile']";
	public static final String HIDDENRAMP_GOTOCONNECTIONS_LINK="(//div[@class='goToConnections'])[1]";
	public static final String HIDDENRAMP_SEARCHBUTTON_TEXTBOX_INSIDECONNECTIONS="(//input[@type='text'])[3]";
	public static final String HIDDENRAMP_FRIENDCOUNT_TAB="//span[@class=' friendCount']";
	public static final String HIDDENRAMP_FOLLOWINGCOUNT_TAB="//span[@class=' followingCount']";
	public static final String HIDDENRAMP_FOLLOWERSCOUNT_TAB="//span[@class=' followerCount']";
	

	//SETTINGS ICON IN THE HOME PAGE
	public static final String HOMEPAGE_SETTINGS_ICON_DROPDOWN="//a[@onclick='ToggleSetting()']";
	public static final String HOMEPAGE_SETTINGSOPTION_FROM_DROPDOWN="//a[@href='/settings']";
	public static final String HOMEPAGE_LOGOUTOPTION_FROM_DROPDOWN="(//a[@href='#'])[2]";
	public static final String SETTINGS_HEADER_INSIDE_SETTINGOPTION="//h2[contains(text(),'Settings')]";
	public static final String BLOCKING_OPTION_IN_SETTINGS="(//a[@class='gray'])[1]";
	public static final String CHANGEPASSWORD_OPTION_IN_SETTINGS="(//a[@class='gray'])[2]";
	public static final String DATAPOLICY_OPTION_IN_SETTINGS="(//a[@class='gray'])[3]";
	public static final String FEEDBACK_OPTION_IN_SETTINGS="(//a[@class='gray'])[4]";
	public static final String PRIVACYPOLICY_OPTION_IN_SETTINGS="(//a[@class='gray'])[5]";
	public static final String REPORTANISSUE_OPTION_IN_SETTINGS="(//a[@class='gray'])[6]";
	public static final String PROFILEPHOTO_OF_BLOCKEDUSER="//div[@class='profile-photo pull-left']";
	public static final String PROFILENAME_OF_BLOCKEDUSER="//div[@class='profile-name']";
	public static final String UNBLOCK_BUTTON_INSIDE_BLOCKEDUSERS="//button[@class='btn background-gradient btn_block unblockButtonClick']";
}
