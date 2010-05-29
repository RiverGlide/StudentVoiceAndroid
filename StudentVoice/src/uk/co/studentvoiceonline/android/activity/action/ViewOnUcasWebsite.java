package uk.co.studentvoiceonline.android.activity.action;

import uk.co.studentvoiceonline.android.R;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

public class ViewOnUcasWebsite extends Action {

	private static final String UCAS_ACTION_LABEL = "UCAS information";
	private static final String VIEW = "android.intent.action.VIEW";
	private static final int UCAS_ICON = R.drawable.ucas;
	
	public ViewOnUcasWebsite(String ucasLink, Context activity) {
		super(takingTheUserToUcas(ucasLink), UCAS_ACTION_LABEL, activity);
		iconReference=UCAS_ICON;
	}
	
	private static Intent takingTheUserToUcas(String ucasLink) {
		Intent theIntent = new Intent(VIEW,	Uri.parse(ucasLink));
		return theIntent;
	}

}
