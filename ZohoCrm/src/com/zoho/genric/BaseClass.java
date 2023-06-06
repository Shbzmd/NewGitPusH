package com.zoho.genric;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.*;
import com.beust.jcommander.Parameter;
import com.zoho.POM.*;
public class BaseClass {

	
	public WebDriver driver;
	
	static {
		
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		System.setProperty("webdriver.edge.driver", "./driver/msedgedriver.exe");
	}
	
	@BeforeTest
	public void OpenBrower() {
		
		
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.MINUTES);
		
	}
	
	@AfterTest
	public void CloseBrower() {
		Reporter.log("closeBrowser",true);
		//driver.close();
	}
	
	@BeforeMethod
	public void login() throws IOException {
		
		Reporter.log("Login",true);
		FileInputStream fis =new FileInputStream("./data/commondata.property"); 
		Properties p= new Properties();
		p.load(fis);
		String url = p.getProperty("url");
		String un=p.getProperty("username");
		String pw=p.getProperty("password");
		
		driver.get(url);
		
		LoginPage l=new LoginPage(driver);
		l.setlogin(un, pw);
		
	}
	
	@AfterMethod
	public void LogOut() {
		
		Reporter.log("Logout",true);
		
	
}
}

