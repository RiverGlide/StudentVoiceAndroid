package uk.co.studentvoiceonline.android.activity;

import static uk.co.studentvoiceonline.android.activity.action.MapSearch.searchMapsFor;
import static uk.co.studentvoiceonline.android.activity.action.GooglePlaces.informationOnGoogleFor;
import static uk.co.studentvoiceonline.android.activity.action.ViewLocalAttractions.showLocalAttractionsMenuFollowing;
import static uk.co.studentvoiceonline.android.activity.action.ViewOnQypeWebsite.viewQypeReviewsFor;
import static uk.co.studentvoiceonline.android.activity.action.ViewOnUcasWebsite.viewUcasInfoAbout;
import uk.co.studentvoiceonline.University;
import android.os.Bundle;

public class ViewUniversityDetails extends UniversityActionsListActivity {

	public void onCreate(Bundle savedInstanceState) {
		University university =  theChosenUniversity();
		
		message = "So, what do you want to look into?";
		
		actions = theFollowing(
				viewQypeReviewsFor(this, university),
				informationOnGoogleFor(this, university.placeId()),
				showLocalAttractionsMenuFollowing(this),
				searchMapsFor(this, university.name()),
				viewUcasInfoAbout(this, university)
				);
		
		super.onCreate(savedInstanceState);
	}
}