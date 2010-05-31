package uk.co.studentvoiceonline.android.activity;

import static uk.co.studentvoiceonline.android.activity.action.MapSearch.typicalMapSearchFor;
import uk.co.studentvoiceonline.University;
import android.os.Bundle;

public class FindLocalAttractions extends UniversityActionsListActivity {
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		University university = theChosenUniversity();
		
		actions = theFollowing(
					typicalMapSearchFor(this, university.placeId())
				);
		super.onCreate(savedInstanceState);
	}
}
