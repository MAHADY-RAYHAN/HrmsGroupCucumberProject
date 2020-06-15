package com.hrms.steps;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.hrms.utils.CommonMethods;
import com.hrms.utils.ConfigsReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddMultipleDependents extends CommonMethods {

	@Given("Admin login successfully to Hrms Application")
	public void admin_login_successfully_to_Hrms_Application() {
	    login.login(ConfigsReader.getProperty("username"), ConfigsReader.getProperty("password"));
	    String expected="Welcome Admin";
	    String actual=dashboard.welcome.getText();
	    Assert.assertEquals("Text does not match", expected, actual);
	}

	@Given("Admin navaigate to PIM page")
	public void admin_navaigate_to_PIM_page() {
		wait(2);
	    click(dashboard.PIM);
	}

	@When("Admin search Employee by id {string} and click search")
	public void admin_search_Employee_by_id_and_click_search(String string) {
	    sendText(dashboard.empId, string);
	    click(dashboard.searchButton);
	}

	@When("Admin click on the employe name")	
	public void admin_click_on_the_employe_name_and_the_employee_is_displayed_successfully() {
		wait(2);
	    click(dashboard.searchByName);
	    wait(2);
	}

	@When("Admin click on Dependents")
	public void admin_click_on_Dependents() {
	    click(dependents.DependentsLink);
	}

	@Then("click on add and enters  {string},{string},{string},{string}")
	public void click_on_add_and_enters(String string, String string2, String string3, String string4) {
	    click(dependents.AddDependentbtn);
	    sendText(dependents.dependentNames, string);
	    selectDdValue(dependents.relationshipSelect, string2);
	    wait(5);
	    sendText(dependents.deRelationship, string3);
	    sendText(dependents.dateOfBirth, string4);
	    
	    click(dependents.saveButton);
	    
	    String expected="Mahady";
	    
	    for(WebElement ele:dependents.validation) {
	    	String actual=ele.getText();
	    	if(actual.contains(expected)) {
	    		Assert.assertEquals("Text is not matched", expected, actual);
	    	}
	    }
	    
	    
	    
	}
}
