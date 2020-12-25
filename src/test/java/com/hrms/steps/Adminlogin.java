package com.hrms.steps;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.hrms.utils.CommonMethods;
import com.hrms.utils.ConfigsReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Adminlogin extends CommonMethods {

	@Given("Admin can enter valid login credential")
	public void admin_can_enter_valid_login_credential() {
		sendText(login.username, ConfigsReader.getProperty("username"));
		sendText(login.password, ConfigsReader.getProperty("password"));
	}

	@When("Admin click on login button")
	public void admin_click_on_login_button() {
		login.loginBtn.click();
	}

	@Then("Admin can login successfully")
	public void admin_can_login_successfully() {
		String expected = "Dashboard";
		WebElement actual = driver.findElement(By.xpath("//div[@class='head']/h1"));
		String actual1 = actual.getText();

		boolean dashboard = actual.isDisplayed();
		Assert.assertTrue(dashboard);
		Assert.assertEquals("Text did not match", expected, actual1);
	}

}
