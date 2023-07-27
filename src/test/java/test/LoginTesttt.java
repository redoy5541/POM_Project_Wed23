package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory;

public class LoginTesttt {
	
	
   WebDriver driver;
	
	String userName = "demo@techfios.com";
	String passWord = "abc123";
	String expectedTextDashboardValidation = "Dashboard";
	
	@Test
	public void validUserShouldBeAbleToLogin() {
		
		
	driver = BrowserFactory.init();
  
	LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
	loginPage.insertUserName(userName);
	loginPage.insertPassWord(passWord);
	loginPage.clickSignInButton();
	
	DashboardPage dashboardpage = PageFactory.initElements(driver, DashboardPage.class);
	dashboardpage.validateDashboardPage(expectedTextDashboardValidation);
	
	BrowserFactory.tearDown();
	
	}
	
}
