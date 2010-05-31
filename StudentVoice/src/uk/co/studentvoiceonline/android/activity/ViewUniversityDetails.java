package uk.co.studentvoiceonline.android.activity;

import java.util.Arrays;

import uk.co.studentvoiceonline.University;
import uk.co.studentvoiceonline.android.activity.action.Action;
import uk.co.studentvoiceonline.android.activity.action.TypicalMapSearch;
import uk.co.studentvoiceonline.android.activity.action.ViewLocalAttractions;
import uk.co.studentvoiceonline.android.activity.action.ViewOnQypeWebsite;
import uk.co.studentvoiceonline.android.activity.action.ViewOnUcasWebsite;
import android.os.Bundle;

public class ViewUniversityDetails extends UniversityActionsListActivity {

	public void onCreate(Bundle savedInstanceState) {
		actions = Arrays.asList(
				viewQypeReviewsFor(theChosenUniversity()),
				viewUcasInfoAbout(theChosenUniversity()),
				new ViewLocalAttractions(this),
				mapFor(theChosenUniversity())
				);
		super.onCreate(savedInstanceState);
	}

	private ViewOnQypeWebsite viewQypeReviewsFor(University theChosenUniversity) {
		return new ViewOnQypeWebsite(theChosenUniversity.qypeLink(),this);
	}

	private ViewOnUcasWebsite viewUcasInfoAbout(University theChosenUniversity) {
		return new ViewOnUcasWebsite(theChosenUniversity.ucasLink(),this);
	}

	private Action mapFor(University theChosenUniversity) {
		return new TypicalMapSearch(theChosenUniversity.name(),this);
	}
}