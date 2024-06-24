package com.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login {
	
	WebDriver driver;

@Given("user should be facebook login page")
public void user_should_be_facebook_login_page() {
	driver =new ChromeDriver();
	driver.get("https://www.facebook.com/");
   }

@When("user should enter the username and password")
public void user_should_enter_the_username_and_password() {
	driver.findElement(By.id("email")).sendKeys("hayanthika");
	driver.findElement(By.id("pass")).sendKeys("hayanthika@123");
}

@When("user should click the login button")
public void user_should_click_the_login_button() {
	driver.findElement(By.name("login")).click();
  }

@Then("user should verify login is successfull")
public void user_should_verify_login_is_successfull() {
	System.out.println("login is successful");
   
}




}
