package com.hrms.steps;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.hrms.utils.CommonMethods;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class amazonSearchItem extends CommonMethods {

	@Given("User is able to navigat Amazon Web Page")
	public void user_is_able_to_navigat_Amazon_Web_Page() {
	    
	}

	@When("User can Search")
	public void user_can_Search(DataTable dealData) {
		WebElement srch = driver.findElement(By.id("nav-search-submit-button"));
		
		List<String> dealvalu= dealData.row(0);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(dealvalu.get(0));
		srch.click();
		wait(2);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(dealvalu.get(1));
		wait(2);
		srch.clear();
		wait(2);
		srch.click();
		wait(2);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(dealvalu.get(2));
		srch.clear();
		wait(2);
		srch.click();
	}

//	@When("click on search box")
//	public void click_on_search_box() {
//	    driver.findElement(By.id("nav-search-submit-button")).click();
//	}



}
