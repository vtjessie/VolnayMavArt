package volnay.PageFactory;
 

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import volnay.Mod.Util;
import volnay.Mod.AddEventFields;


public class AddEventPage {
	
	WebDriver driver;

	@FindBy(id="secondDate")
	 WebElement dateText;
	
	@FindBy(id="eventTime")
	 WebElement timeText;
	
	@FindBy(id="eventTitle")
	 WebElement titleText;
	
	@FindBy(id="eventDes")
	 WebElement descriptionText;
	
	@FindBy(id="eventReq")
	 WebElement requiredVolunt;
	
	@FindBy(id="eventTag")
	 WebElement tagsInf;
	
	@FindBy(id="eventCname")
	 WebElement  coordinatorName;
	
	
	@FindBy(id="eventCemail")
	 WebElement coordinatorEmail;
	
	@FindBy(id="eventAddress")
	 WebElement venueAd;
	
	@FindBy(id="eventAdd")
	 WebElement add;
	
	@FindBy(id="eventUpdate")
	 WebElement update;
	
	public AddEventPage(WebDriver driver) {
		 
		 this.driver = driver;
		 
		//This initElements method will create all WebElements

	     PageFactory.initElements(driver, this);
		 
	 }
	
	public void enterDate(String date){
		  dateText.sendKeys(date);
	}
	
	public void enterTime(String tim){
		timeText.sendKeys(tim);
	//	timeText.click();
	}
	
	public void enterTitle(String title){
		titleText.sendKeys(title);
	}
	
	public void enterDescription(String desc){
			descriptionText.sendKeys(desc);
			
	}
	
	public void enterVolunteers(String volunteers){
		requiredVolunt.sendKeys(volunteers);
		
	}
	
	public void enterTags(String tags){
		tagsInf.sendKeys(tags);		
	}
	
	public void enterCordinatorName(String name){
		coordinatorName.sendKeys(name);		
	}
	
	public void enterCordinatorEmail(String email){
		coordinatorEmail.sendKeys(email);		
	}
	
	public void enterVenue(String venue){
		venueAd.sendKeys(venue);		
	}
	
	public void enterAdd(){
		add.click();	
	}
	
	
	public void updateAdd(){
		update.click();	
	}
	
	public void enterEventData(AddEventFields inputs) {
		this.enterDate(inputs.getDateText());
		this.enterTime(inputs.getTimeText());
		this.enterTitle(inputs.getTitleText());
		this.enterDescription(inputs.getDescriptionText());
		this.enterVolunteers(inputs.getRequiredVolunt());

		//this.addVolunteers(inputs.getAddedVolunt());

		this.enterTags(inputs.getTags());
		this.enterCordinatorName(inputs.getCoordinatorName());
		this.enterCordinatorEmail(inputs.getCoordinatorEmail());
		this.enterVenue(inputs.getVenue());
	//	this.enterAdd();
	} 
	public void addEventData(AddEventFields inputs) {
		this.enterEventData(inputs);
		this.enterAdd();

		
	}
	
	public void updateEventData(AddEventFields inputs) throws InterruptedException {
		this.enterEventData(inputs);
		 Thread.sleep(3000);

		 Util.ScrollDownBy(update);
		this.updateAdd();

		
	}
 }
