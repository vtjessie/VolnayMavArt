package volnay.PageFactory;



	import java.util.List;

	import volnay.Mod.Util;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class HomePage {
		
		WebDriver driver;

		
		@FindBy(id="organName")
		 WebElement titleText;
		 
		
		@FindBy(xpath="//*[@id='mainAddEvent']")
		WebElement clickCreatEvent;
		
		@FindBy(xpath="//*[@id='infotab']")
		WebElement clickMainMenu;
		
		@FindBy(id="eventContainer")
		WebElement clickYourEvents;
		
	 	@FindBy(id="infotab")
	 	WebElement clickCloseButton;
		
	 	 @FindBy(id="eventCard")
		 WebElement eventCont; 
	 	 
	 	
	 	
	 	
	 	@FindBy(xpath="*//*[@id='eventContainer']/div[@class='eventCard']")
	 	 WebElement eventNos;
	 	
	 	@FindBy(xpath="*//*[@id='eventContainer']/div[@class='eventCard']")
	 	List <WebElement> eventList;

	 	@FindBy(xpath="//following::button[text()='Edit']")
		 WebElement eventEdit;
	 	
	 	@FindBy(xpath="*//*[@id='eventContainer']/div[1]/p[5]/button[@class='editBtn']")
	    List <WebElement> eventEditList;
			
	 	 @FindBy(id="eventUpdate")
		 WebElement eventUpdate;

	 	 
	 	@FindBy(id="removeEvent")
		 WebElement removeEvent;
	 	
	 	
	     public HomePage(WebDriver driver) {
			 
			 this.driver = driver ;
			 
			//This initElements method will create all WebElements

		     PageFactory.initElements(driver, this);
			 
		 }
	     
	     //Get the title of Login Page

		    public String getLoginTitle(){

		     return    titleText.getText();

		    }
		    
		    public void clickMenu() {
		    	clickMainMenu.click();
		    	
		    }
		    
		    public void clickEvent() {
		    	clickCreatEvent.click();
		    	
		    }
		    
		    public void clickYurEvent() {
		    	clickYourEvents.click();
		    	
		    }
		    
		    public WebElement sentYurEvent() {
		    	WebElement element =clickYourEvents;
		    	return element;
		    	
		    }
		    
		    public void clickClose() {
		    	clickCloseButton.click();
		    }
		    
		    public void clickEdit() {
		    	eventEdit.click();
		    }
		    
		    
		    public void eventUpdates() {
		    	eventUpdate.click();
		    }
		    
		    public void removeEvents() {
		    	removeEvent.click();
		    }
		    
		    public WebElement eventEdited() {
		     //	eventEdit.click();
		    	WebElement element =eventEdit ;
		    	return element;

		    }
		    
		    
		    public WebElement eventContainer() {
		    //	clickYourEvents.click();
		    	WebElement element =eventEdit ;
		    	return element;

		    }
		    
		    public  WebElement nthOfEvents(int n) {
		    	System.out.println("   .."+eventList.size()+" "+(eventList.get(eventList.size()-1)).getText( ));
		    	return eventList.get(eventList.size()-1);
		    	
		    }

		    
		    public void clickEventEdit(String event ) {
		    	WebElement element =eventList.get(eventList.size()-1);
		    	System.out.println("   .."+eventEditList.size());
		    	String s = "BirthDay ";
		        element =	element.findElement(By.xpath("//parent::h4[text()='"+event+"']//following::button[text()='Edit']")) ;
		    	Util.ScrollDownBy(element);
		    	 element.click();

		    }
		    
		    public String createEvent() {
		    	String title =this.getLoginTitle();
		    	this.createEvent();
		    	return title;
		    	
		    }
		 

	}

