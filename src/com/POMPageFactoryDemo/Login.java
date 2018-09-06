package com.POMPageFactoryDemo;

import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.How;

	public class Login {

		//Define User name Field
		@FindBy(how=How.XPATH, using="//input[@name='username']")
		private WebElement usernameField;
		
		//Define Password Field
		@FindBy(how=How.XPATH, using="//input[@name='password']")
		private WebElement passwordField;
		
		//Define Login Button
		@FindBy(how=How.XPATH, using="//*[@class='btn green pull-right']")
		private WebElement loginButton;
		
		//Define User name Enter Method
		public void EnterUserName(String usernametext)
		{
			usernameField.sendKeys(usernametext);
		}
		
		//Define Password Enter Method
			public void EnterPassword(String passwordtext)
			{
				passwordField.sendKeys(passwordtext);
			}
			
		//Define Login Button Click Method
			public void ClickLoginButton()
			{
				loginButton.click();
			}
		
	}