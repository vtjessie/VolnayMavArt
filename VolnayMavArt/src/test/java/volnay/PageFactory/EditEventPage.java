package volnay.PageFactory;


 

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	import volnay.Mod.Util;
	import volnay.Mod.AddEventFields;

	public class EditEventPage {

		WebDriver driver;

		@FindBy(id="dateE")
		 WebElement dateText;
		
		@FindBy(id="eventTimeE")
		 WebElement timeText;
		
		@FindBy(id="eventTitleE")
		 WebElement titleText;
		
		@FindBy(id="eventDesE")
		 WebElement descriptionText;
		
		@FindBy(id="eventReqE")
		 WebElement requiredVolunt;
		
		@FindBy(id="eventCurrE")
		 WebElement addedVolunt;
		
		@FindBy(id="eventTagE")
		 WebElement tagsInf;
		
		@FindBy(id="eventCnameE")
		 WebElement  coordinatorName;
		
		
		@FindBy(id="eventCemailE")
		 WebElement coordinatorEmail;
		
		@FindBy(id="eventAddressE")
		 WebElement venueAd;

		@FindBy(id="eventUpdate")
		 WebElement update;
		
		
		@FindBy(id="removeEvent")
		 WebElement remove;
		
		public EditEventPage(WebDriver driver) {
			 
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
		
		public void addVolunteers(String volunteers){
			addedVolunt.sendKeys(volunteers);
			
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
		
		public void enterRemove(){
			remove.click();	
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
	 	
		public void removeEventData() {
		//	this.enterEventData(inputs);
			this.enterRemove();

			
		}
		
		public void updateEventData(AddEventFields inputs) throws InterruptedException {
			this.enterEventData(inputs);
			 Thread.sleep(3000);

		//	 Util.ScrollDownBy(update);
			this.updateAdd();

			
		}
		
		public  WebElement removeButton() {
			return(remove);
		}
	 }
