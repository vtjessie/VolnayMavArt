package volnay.Mod;



public class AddEventFields {
		private String dateText;
		private String timeText;
		private String titleText;
		private String descriptionText;
		private String requiredVolunt;
		private String addedVolunt;

		private String tags;
		private String coordinatorName;
		private String coordinatorEmail;
		private String venue;
		
		
		public AddEventFields(String dateText,String timeText,String titleText,
				String descriptionText,String requiredVolunt,String addedVolunt,String tags,
				String coordinatorName,String coordinatorEmail,String venue){
			this.setDateText(dateText);
			this.setTimeText(timeText);
			this.setTitleText(titleText);
			this.descriptionText=descriptionText;
			this.setDescriptionText(requiredVolunt);
			this.setRequiredVolunt(requiredVolunt);

		 	this.setAddedVolunt(addedVolunt);

			this.setTags(tags);
			this.setCoordinatorName(coordinatorName);
			this.setCoordinatorEmail(coordinatorEmail);
			this.setVenue(venue);
			
		}
	 	public String getDateText() {
			return dateText;
		}

		public String getTimeText() {
			return timeText;
		}

		public String getTitleText() {
			return titleText;
		}

		public String getDescriptionText() {
			return descriptionText;
		}

		public String getRequiredVolunt() {
			return requiredVolunt;
		}

		public String getAddedVolunt() {
			return addedVolunt;
		}

		public String getTags() {
			return tags;
		}

		public String getCoordinatorName() {
			return coordinatorName;
		}

		public String getCoordinatorEmail() {
			return coordinatorEmail;
		}

		public String getVenue() {
			return venue;
		}



		public void setDateText(String dateText) {
			this.dateText = dateText;
		}

		public void setTimeText(String timeText) {
			this.timeText = timeText;
		}

		public void setTitleText(String titleText) {
			this.titleText = titleText;
		}

		public void setDescriptionText(String descriptionText) {
			this.descriptionText = descriptionText;
		}

		public void setRequiredVolunt(String requiredVolunt) {
			this.requiredVolunt = requiredVolunt;
		}

		public void setAddedVolunt(String addedVolunt) {
			this.addedVolunt = addedVolunt;
		}

		public void setTags(String tags) {
			this.tags = tags;
		}

		public void setCoordinatorName(String coordinatorName) {
			this.coordinatorName = coordinatorName;
		}

		public void setCoordinatorEmail(String coordinatorEmail) {
			this.coordinatorEmail = coordinatorEmail;
		}

		public void setVenue(String venue) {
			this.venue = venue;
		}
		
		 
	/*	public AddEventFields(AddEventFields input){
			this.dateText =input.dateText;
			this.timeText=input.timeText;
			this.titleText=input.titleText;
			this.descriptionText=input.descriptionText;
			this.requiredVolunt=input.requiredVolunt;
			this.addedVolunt=input.addedVolunt;

			this.tags=input.tags;
			this.coordinatorName=input.coordinatorName;
			this.coordinatorEmail=input.coordinatorEmail;
			this.venue=input.venue;
			
		} */

	}
