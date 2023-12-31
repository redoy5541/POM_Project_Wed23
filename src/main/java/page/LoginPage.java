package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	
	
	WebDriver driver;
	
    
    
    public LoginPage(WebDriver driver) {
   	 
   	 
    }
    
	
	@FindBy(how = How.XPATH, using= "//*[@id=\"username\"]") WebElement userNameElement;
	@FindBy(how = How.XPATH, using = "//*[@id=\"password\"]") WebElement passwordElement;
	@FindBy(how = How.XPATH, using = "/html/body/div/div/div/form/div[3]/button") WebElement signinButton;
	
	//corrosponfing methods
	public void insertUserName(String userName) {
		
		userNameElement.sendKeys(userName);
		
}
	public void insertPassWord(String password) {
		
		passwordElement.sendKeys(password);
		
		
	}
public void clickSignInButton() {
		
	signinButton.click();
}



public  void loginTest(String userName, String password) {
	
	userNameElement.sendKeys(userName);
	passwordElement.sendKeys(password);
	signinButton.click();
	
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
