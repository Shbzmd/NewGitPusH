package com.zoho.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.zoho.genric.*;
public class LoginPage {

	@FindBy(xpath=("//input[@id='userName']"))
	private WebElement UsrNmTbx;
	
	@FindBy(xpath="//input[@id='passWord']")
	private WebElement PwdTbx;
	
	@FindBy(xpath="//input[@title='Sign In']")
	private WebElement SignInBtn;
	
	
	public LoginPage(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
		
		}
	
	public void setlogin(String un,String pw) {
		
		UsrNmTbx.sendKeys(un);
		PwdTbx.sendKeys(pw);
		SignInBtn.click();
		
}
}
