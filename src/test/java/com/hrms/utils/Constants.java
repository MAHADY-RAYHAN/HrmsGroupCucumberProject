package com.hrms.utils;

import java.io.File;

public class Constants {
	
	public static final String CONFIGURATION_FILEPATH=System.getProperty("user.dir")+"\\src\\test\\resources\\configs\\configurations.properties";
	
	public static final int IMPLICIT_WAIT_TIME=15;
	
	public static final int EXPLICIT_WAIT_TIME=30;	

	public static final String REPORT_FILEPATH=System.getProperty("user.dir")+"\\HrmsGroupCucumberProject\\target\\html-report\\HRMS.html";

	public static final String SCREENSHOT_FILEPATH=System.getProperty("user.dir")+"/screenshot/";
}