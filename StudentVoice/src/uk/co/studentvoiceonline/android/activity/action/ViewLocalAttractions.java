package uk.co.studentvoiceonline.android.activity.action;

import uk.co.studentvoiceonline.R;
import uk.co.studentvoiceonline.android.activity.FindLocalAttractions;
import android.content.Context;
import android.content.Intent;

public class ViewLocalAttractions extends Action {

	public static final String label = "Local Attractions";
	public static final int ICON = R.drawable.local_attractions;
	
	public static ViewLocalAttractions showLocalAttractionsMenuFollowing(Context activity) {
		return new ViewLocalAttractions(activity);
	}
	
	private ViewLocalAttractions(Context activity) {
		super(localAttractions(activity), label, activity, ICON);
	}

	private static Intent localAttractions(Context activity) {
		Intent i = new Intent(activity, FindLocalAttractions.class);
        return i;
	}

}
