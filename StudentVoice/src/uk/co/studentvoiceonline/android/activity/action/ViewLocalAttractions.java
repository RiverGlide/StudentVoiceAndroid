package uk.co.studentvoiceonline.android.activity.action;

import uk.co.studentvoiceonline.android.R;
import uk.co.studentvoiceonline.android.activity.FindLocalAttractions;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;

public class ViewLocalAttractions extends Action {

	public static final String label = "Local Attractions";
	public static final int ICON = R.drawable.local_attractions;
	
	
	public ViewLocalAttractions(Context activity) {
		super(localAttractions(activity), label, activity, ICON);
	}

	private static Intent localAttractions(Context activity) {
		Intent i = new Intent(activity, FindLocalAttractions.class);
        return i;
	}

}
