package uk.co.studentvoiceonline.android.activity.action;

import uk.co.studentvoiceonline.University;
import uk.co.studentvoiceonline.android.R;
import android.content.Context;

public class ViewOnQypeWebsite extends ViewWebLinkAction {

	private static final String ACTION_LABEL = "Reviews on Qype";
	private static final int ICON = R.drawable.reviews;
	
	public static ViewOnQypeWebsite viewQypeReviewsFor(Context activity, University university) {
		return new ViewOnQypeWebsite(university.qypeLink(), activity);
	}
	
	private ViewOnQypeWebsite(String qypeLink, Context activity) {
		super(takingTheUserTo(qypeLink), ACTION_LABEL, activity, ICON);
	}
}
