package volnay.Test;



	import org.testng.annotations.Test;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;


	import volnay.Mod.Util;
	import volnay.Mod.AddEventFields;
	import volnay.PageFactory.AddEventPage;
	import volnay.PageFactory.LoginPage;


	import org.testng.annotations.DataProvider;
	import org.testng.annotations.BeforeTest;

	import java.util.ArrayList;
	import java.util.List;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.testng.Assert;
	import org.testng.AssertJUnit;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeClass;

	import volnay.PageFactory.AddEventPage;
	import volnay.PageFactory.EditEventPage;
	import volnay.PageFactory.HomePage;
	import org.apache.commons.io.FileUtils;


public class LoginTest {
 
		WebDriver driver;
		LoginPage objLogin;

	    HomePage  homepageinf;
	    AddEventPage eventPage;
	    EditEventPage editPage;
	    
	    
	  @Test(dataProvider = "dp")
	  public void test_Home_Page_Appear_Correct(String user,String pass,ArrayList <AddEventFields> inputs) throws Exception {
		  objLogin = new  LoginPage(driver);

		  homepageinf = new HomePage(driver);

		  eventPage   = new AddEventPage(driver);
		  
		  editPage   = new EditEventPage(driver);

		  //Verify login page title
		  
		  objLogin.loginToVolnay(user,pass);
		  
			 Thread.sleep(3000);

		 String volnay = homepageinf.getLoginTitle();
		 
		 
		 try {
		// 	 AssertJUnit.assertEquals(volnay, "ACTON BOXBOROUGH COMMUNITY" );
		 	  AssertJUnit.assertEquals(volnay, "VOLNAY" );

	    }catch (Exception e){
		      e.printStackTrace();}
		 Thread.sleep(3000);

		 homepageinf.clickEvent();
		 Thread.sleep(3000);
		 eventPage.addEventData(inputs.get(0));
		 Thread.sleep(1000);

		 Util.checkAlert();
		 
		 Thread.sleep(3000);

		 homepageinf.clickMenu();
		 Util.ScrollDownBy(homepageinf.sentYurEvent());
		 Thread.sleep(1000);

		 Util.takeSnapShot(driver,"FirstScreenShot.png");
		 
//		 homepageinf.clickClose();  EDITING........
		 
		 Thread.sleep(3000);

		 
		 Util.ScrollDownBy(homepageinf.nthOfEvents(5));
		 Thread.sleep(3000);
	 	  homepageinf.clickEventEdit(inputs.get(0).getTitleText());
	 	 
	 	 Thread.sleep(3000);
		 editPage.updateEventData(inputs.get(1));
	 	 Thread.sleep(1000);

		 Util.checkAlert();
		 
		 Thread.sleep(3000);
		 Util.checkAlert();
	  	 Thread.sleep(3000);
		 homepageinf.clickMenu();
		 Util.ScrollDownBy(homepageinf.sentYurEvent());
		 Thread.sleep(1000);
	 	 
		 Util.takeSnapShot(driver,"Edited.png");
		 
		/* Util.ScrollDownBy(homepageinf.eventContainer());
		 
		 WebElement myContainer= homepageinf.eventContainer();
		 
		
		 Thread.sleep(1000);
	 	 homepageinf.clickEdit();
	 	 
		 Util.ScrollDownBy(homepageinf.eventEdited());*/ Thread.sleep(3000);

		 
		 Util.ScrollDownBy(homepageinf.nthOfEvents(5));
		 Thread.sleep(3000);
	 	  homepageinf.clickEventEdit(inputs.get(0).getTitleText());
	 	 
	 	 Thread.sleep(3000);
	 	 Util.ScrollDownBy(editPage.removeButton());
		 editPage.removeEventData();
	 	 Thread.sleep(1000);

		// Util.checkAlert();
		 
		// Thread.sleep(3000);
		 Util.checkAlert();
	  	 Thread.sleep(3000);
		 homepageinf.clickMenu();
		 Util.ScrollDownBy(homepageinf.sentYurEvent());
		 Thread.sleep(1000);
	 	 
		 Util.takeSnapShot(driver,"Deleted.png");
		 
		 
		 

		 
		 
		 
	  }

	  @DataProvider
	   public Object[][] dp() {
		  String name="infant.derrick.gnanasusairaj@gmail.com";
		  String password ="Gnanasusairaj123";
		  List <AddEventFields> inputs  = new ArrayList<AddEventFields>(); 
		  inputs.add( new  AddEventFields("10/09/2019", "10.10AM", "BirthDay ", " Descript","5","5", "tags ", " name", "email ", " Acton"));
		  inputs.add( new  AddEventFields("10/09/2019", "12.00AM", "BirthDay ", " Divi's Party","5","15", "tags ", " Divine", "Infant123 ", " Acton"));

		  return new Object[][]{ {name,	password,  inputs  } };
	  
	  }
	  
	  @BeforeTest
	  void launchBrowser() {

	  driver = Util.setChromedriver();
	 driver.get(Util.BASE_URL);
	// driver.manage().window().maximize();
	 } 

	  
	  @AfterTest
	  public void afterTest() {
		//  driver.close();
	  }

	 
}
