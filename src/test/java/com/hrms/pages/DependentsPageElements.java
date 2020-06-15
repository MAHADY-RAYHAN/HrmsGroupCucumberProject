package com.hrms.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;

public class DependentsPageElements {

	@FindBy(linkText = "Dependents")
	public WebElement DependentsLink;
	
	@FindBy(id = "btnAddDependent")
	public WebElement AddDependentbtn;
	
	@FindBy(id = "dependent_name")
	public WebElement dependentNames;
	
	@FindBy(xpath = "//select[@id='dependent_relationshipType']")
	public WebElement relationshipSelect;
	
	@FindBy(id = "dependent_dateOfBirth")
	public WebElement dateOfBirth;
	
	@FindBy(id = "dependent_relationship")
	public WebElement otherRelationship;
	
	@FindBy(id = "dependent_relationship")
	public WebElement deRelationship;
	
	@FindBy(id = "btnSaveDependent")
	public WebElement saveButton;
	
	@FindBy(xpath = "//table[@id='dependent_list']//tbody//tr//td")
	public List <WebElement> validation;

	

	public DependentsPageElements() {
		PageFactory.initElements(BaseClass.driver, this);		
	}
}
