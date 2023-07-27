package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.AddContactPage;
import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory;

public class AddContactTest {
	
	

	WebDriver driver;
	
	String userName = "demo@techfios.com";
	String passWord = "abc123";
	String expectedTextDashboardValidation = "Dashboard";
	String fullName = "Selenium";
	String company = "Techfios";
	String email = "abc@techfios.com";
	
	
	@Test
	public void userShouldBeAbleToAddCustomer() {
		
		
		driver = BrowserFactory.init();
		
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.insertUserName(userName);
		loginPage.insertPassWord(passWord);
		loginPage.clickSignInButton();
		
		DashboardPage dashboardpage = PageFactory.initElements(driver, DashboardPage.class);
		dashboardpage.validateDashboardPage(expectedTextDashboardValidation);
		dashboardpage.clickCustomersButton();
		dashboardpage.clickAddAcustomer();
		
		AddContactPage addContactPage = PageFactory.initElements(driver, AddContactPage.class);
		addContactPage.selectCompany(fullName);
		addContactPage.selectCompany(company);
		addContactPage.selectCompany(email);
	}
	
	
	
	
	
	

}
