package com.hrms.testbase;

import com.hrms.pages.DashboardPageElements;
import com.hrms.pages.LoginPageElements;
import com.hrms.pages.DependentsPageElements;
import com.hrms.pages.QualificationsPageElements;

//initializes all pages class and stores references in static varibales
//that will called/used in test classes
public class PageInitializer extends BaseClass{

	public static LoginPageElements login;
	public static DashboardPageElements dashboard;
	public static DependentsPageElements dependents;
	public static QualificationsPageElements qualifications;
	
	public static void initialize() {
		
		login=new LoginPageElements();
		dashboard=new DashboardPageElements();
		dependents=new DependentsPageElements();
		qualifications=new QualificationsPageElements();
	}
}
