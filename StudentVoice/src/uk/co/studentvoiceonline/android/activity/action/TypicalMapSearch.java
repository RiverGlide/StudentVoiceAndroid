package uk.co.studentvoiceonline.android.activity.action;

import uk.co.studentvoiceonline.android.R;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

public class TypicalMapSearch extends Action {
	
	private static final String ACTION_ITEM_LABEL = "View on Map";
	private static final String GOOGLE_MAPS_PACKAGE_NAME = "com.google.android.apps.maps";
	private static final String MAPS_ACTIVITY_NAME = "com.google.android.maps.MapsActivity";
	private static final ComponentName GOOGLE_MAPS = new ComponentName(GOOGLE_MAPS_PACKAGE_NAME, MAPS_ACTIVITY_NAME);
	private static final String MAPS_BASE_URL = "http://maps.google.com/maps?q=";
	private static final String VIEW = "android.intent.action.VIEW";

	public TypicalMapSearch(String thingToSearchFor, Context activity) {
		super(showAMapDisplaying(thingToSearchFor), ACTION_ITEM_LABEL, activity);
		iconReference=R.drawable.map;
	}
	
	private static Intent showAMapDisplaying(String thingToSearchFor) {
		Intent theIntent = new Intent(VIEW,	mapQueryFor(thingToSearchFor));
		theIntent.setComponent(GOOGLE_MAPS);
		return theIntent;
	}
	
	private static Uri mapQueryFor(String toSearchFor) {
		return Uri.parse(MAPS_BASE_URL + toSearchFor);
	}
}
