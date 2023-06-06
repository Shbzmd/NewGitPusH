package com.zoho.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CampaignsPage {

	@FindBy(xpath="//a[contains(text(),'Campaigns')]")
	private WebElement CampBtn;
	
	@FindBy(xpath="//a[text()='New Campaign']")
	private WebElement NwCmpBtn;
	
	@FindBy(name="property(Campaign Name)")
	private WebElement CmpTbx;
	
	@FindBy(name="property(Description)")
	private WebElement CmpDesc;
	
	@FindBy(xpath="//input[@value='Save']")
	private WebElement CmpSvbtn;
	
	public CampaignsPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}

	public WebElement getCampBtn() {
		return CampBtn;
	}

	public WebElement getNwCmpBtn() {
		return NwCmpBtn;
	}
	
	public WebElement getCmpTbx() {
		return CmpTbx;
	}
	
	public WebElement getCmpDesc() {
		return CmpDesc;
	}
	
	public WebElement getCmpSvbtn() {
	return CmpSvbtn;
	
	}
	
}
