package volnay.PageFactory;



	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;


	public class LoginPage {
		
		
		WebDriver driver;
		
		 @FindBy(id="username")
		 WebElement Name;

		 @FindBy(id="password")
		 WebElement password;
		 
		 @FindBy(xpath="*//*[@class='login100-form-btn']")
		 WebElement login;
		 
		
		 
		 public LoginPage(WebDriver driver) {
			 
			 this.driver = driver;
			 
			//This initElements method will create all WebElements

		     PageFactory.initElements(driver, this);
			 
		 }
		 
		 
		 //Set user name in textbox

		    public void setUserName(String strUserName){

		         Name.sendKeys(strUserName);     
		    }

		    //Set password in password textbox

		    public void setPassword(String strPassword){

		    password.sendKeys(strPassword);

		    }

		    //Click on login button

		    public void clickLogin(){

		            login.click();

		    } 
		  
		    
		 
		    
		/**    
		     * This POM method will be exposed in test case to login in the application

		     * @param strUserName

		     * @param strPasword

		     * @return

		     */

		    public void loginToVolnay(String strUserName,String strPasword){

		        //Fill user name

		        this.setUserName(strUserName);

		        //Fill password

		        this.setPassword(strPasword);

		        //Click Login button

		        this.clickLogin();           

		    }
	}



