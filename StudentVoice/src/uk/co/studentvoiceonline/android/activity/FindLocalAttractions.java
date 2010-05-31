package uk.co.studentvoiceonline.android.activity;

import java.util.Arrays;

import uk.co.studentvoiceonline.android.activity.action.Action;
import uk.co.studentvoiceonline.android.activity.action.TypicalMapSearch;
import android.os.Bundle;

public class FindLocalAttractions extends UniversityActionsListActivity {
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		actions = Arrays.asList(
				(Action)new TypicalMapSearch(theChosenUniversity().placeId(),this)
				);
		super.onCreate(savedInstanceState);
	}
}
