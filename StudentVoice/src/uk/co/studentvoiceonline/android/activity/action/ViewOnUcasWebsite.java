package uk.co.studentvoiceonline.android.activity.action;

import uk.co.studentvoiceonline.android.R;
import android.content.Context;

public class ViewOnUcasWebsite extends ViewWebLinkAction {

	private static final String ACTION_LABEL = "UCAS information";
	private static final int ICON = R.drawable.ucas;
	
	public ViewOnUcasWebsite(String ucasLink, Context activity) {
		super(takingTheUserTo(ucasLink), ACTION_LABEL, activity, ICON);
	}
}
