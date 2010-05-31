package uk.co.studentvoiceonline.android.activity;

import static uk.co.studentvoiceonline.android.activity.action.TypicalMapSearch.searchMapsFor;
import static uk.co.studentvoiceonline.android.activity.action.ViewLocalAttractions.showLocalAttractionsMenuFollowing;
import static uk.co.studentvoiceonline.android.activity.action.ViewOnQypeWebsite.viewQypeReviewsFor;
import static uk.co.studentvoiceonline.android.activity.action.ViewOnUcasWebsite.viewUcasInfoAbout;


import uk.co.studentvoiceonline.University;
import android.os.Bundle;

public class ViewUniversityDetails extends UniversityActionsListActivity {

	public void onCreate(Bundle savedInstanceState) {
		University university =  theChosenUniversity();
		
		actions = theFollowing(
				viewQypeReviewsFor(this, university),
				viewUcasInfoAbout(this, university),
				showLocalAttractionsMenuFollowing(this),
				searchMapsFor(this, university.name())
				);
		
		super.onCreate(savedInstanceState);
	}
}