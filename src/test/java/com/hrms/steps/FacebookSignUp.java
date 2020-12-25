package com.hrms.steps;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.hrms.utils.CommonMethods;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FacebookSignUp extends CommonMethods {
	@Given("that user clicks on create a new account")
	public void that_user_clicks_on_create_a_new_account() {
		click(driver.findElement(By.xpath("//div[@class='_6ltg']/a")));
	}

	@When("user selects {string}")
	public void user_selects(String Gender) {
	    List <WebElement> rbutton = driver.findElements(By.xpath("//span[@class='_5k_2 _5dba']/label"));
	    
	    for (WebElement btn : rbutton) {
			if (btn.getText().equalsIgnoreCase(Gender)) {
				btn.click();
				break;
			}
		}
	}


	@Then("user is able to sign up")
	public void user_is_able_to_sign_up() {
		click(driver.findElement(By.xpath("//div[@class='_1lch']/button")));
	}
}
