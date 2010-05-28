package uk.co.studentvoiceonline.android.activity.action;

import uk.co.studentvoiceonline.android.activity.Action;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

public class ViewOnUcasWebsite extends Action {

	private static final String UCAS_ACTION_LABEL = "UCAS information";
	private static final String VIEW = "android.intent.action.VIEW";
	
	public ViewOnUcasWebsite(String ucasLink, Context activity) {
		super(takingTheUserToUcas(ucasLink), UCAS_ACTION_LABEL, activity);
	}
	
	private static Intent takingTheUserToUcas(String ucasLink) {
		Intent theIntent = new Intent(VIEW,	Uri.parse(ucasLink));
		return theIntent;
	}

}
