package uk.co.studentvoiceonline.android.activity.action;

import uk.co.studentvoiceonline.University;
import uk.co.studentvoiceonline.android.R;
import android.content.Context;

public class ViewOnUcasWebsite extends ViewWebLinkAction {

	private static final String ACTION_LABEL = "UCAS information";
	private static final int ICON = R.drawable.ucas;
	
	public static ViewOnUcasWebsite viewUcasInfoAbout(Context activity, University university) {
		return new ViewOnUcasWebsite(university.ucasLink(), activity);
	}
	
	private ViewOnUcasWebsite(String link, Context activity) {
		super(takingTheUserTo(link), ACTION_LABEL, activity, ICON);
	}
}
