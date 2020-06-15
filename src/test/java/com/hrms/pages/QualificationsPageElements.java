package com.hrms.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;

public class QualificationsPageElements {

	@FindBy(linkText = "Qualifications")
	public WebElement qualificationsLink;
	
	@FindBy(id = "addWorkExperience")
	public WebElement addButon;
	
	@FindBy(id = "experience_employer")
	public WebElement companyName;
	
	@FindBy(id = "experience_jobtitle")
	public WebElement jobTitle;
	
	@FindBy(id = "experience_from_date")
	public WebElement fromDate;
	
	@FindBy(id = "experience_to_date")
	public WebElement toDate;
	
	@FindBy(id = "experience_comments")
	public WebElement comment;
	
	@FindBy(id = "btnWorkExpSave")
	public WebElement saveButton;
	
	@FindBy(xpath = "//table[@class='table hover']//tbody//tr//td")
	public List <WebElement> validation;

	

	public QualificationsPageElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}
}
