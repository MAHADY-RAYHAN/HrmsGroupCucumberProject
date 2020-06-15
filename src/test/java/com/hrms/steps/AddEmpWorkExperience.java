package com.hrms.steps;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.hrms.utils.CommonMethods;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class AddEmpWorkExperience extends CommonMethods{

	@When("Admin click on Qualifications")
	public void admin_click_on_Qualifications() {
	    click(qualifications.qualificationsLink);
	}

	@Then("click on add and enters {string},{string},{string},{string},{string}")
	public void click_on_add_and_enters(String string, String string2, String string3, String string4, String string5) {
	    click(qualifications.addButon);
	    sendText(qualifications.companyName, string);
	    sendText(qualifications.jobTitle, string2);
	    sendText(qualifications.fromDate, string3);
	    sendText(qualifications.toDate, string4);
	    sendText(qualifications.comment, string5);
	    click(qualifications.saveButton);
	    wait(4);
	    
	    String expected= "syntax";
	    
	    for(WebElement ele:qualifications.validation) {
	    	String actual=ele.getText();
	    	if(actual.contains(expected)) {
	    		Assert.assertEquals("Text is not matched", expected, actual);
	    	}
	    }
	    
	}
}
