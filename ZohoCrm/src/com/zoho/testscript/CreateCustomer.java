package com.zoho.testscript;

import java.io.IOException;
import java.sql.Driver;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.zoho.POM.CampaignsPage;
import com.zoho.genric.BaseClass;
import com.zoho.genric.*;

@Listeners(com.zoho.genric.ListenerImplementation.class)
public class CreateCustomer extends BaseClass {

	@Test
	public void TestCreateCustomer() throws EncryptedDocumentException, IOException, InterruptedException {

		Reporter.log("Shahbaz",true);

		Filib f=new Filib();
		String CampaignName = f.getExcelData("Create Campaign", 0, 1, "./data/ZohoCrm.xlsx");
		String CampDesc = f.getExcelData("Create Campaign", 1, 1, "./data/ZohoCrm.xlsx");

		
		CampaignsPage c=new CampaignsPage(driver);
		c.getCampBtn().click();
		c.getNwCmpBtn().click();
		Assert.assertTrue(c.getNwCmpBtn().isDisplayed(),"The name is not present");
		c.getCmpTbx().sendKeys(CampaignName);
		c.getCmpDesc().sendKeys(CampDesc);
		c.getCmpSvbtn().click();








	}
}

