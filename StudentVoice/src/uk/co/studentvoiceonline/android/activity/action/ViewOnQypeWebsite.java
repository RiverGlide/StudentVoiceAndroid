package uk.co.studentvoiceonline.android.activity.action;

import uk.co.studentvoiceonline.android.R;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

public class ViewOnQypeWebsite extends Action {

	private static final String ACTION_LABEL = "Reviews on Qype";
	private static final String VIEW = "android.intent.action.VIEW";
	private static final int ICON = R.drawable.reviews;
	
	public ViewOnQypeWebsite(String qypeLink, Context activity) {
		super(takingTheUserToUcas(qypeLink), ACTION_LABEL, activity);
		iconReference=ICON;
	}
	
	private static Intent takingTheUserToUcas(String ucasLink) {
		Intent theIntent = new Intent(VIEW,	Uri.parse(ucasLink));
		return theIntent;
	}

}
