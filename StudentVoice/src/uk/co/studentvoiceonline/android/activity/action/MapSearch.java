package uk.co.studentvoiceonline.android.activity.action;

import uk.co.studentvoiceonline.R;
import uk.co.studentvoiceonline.University;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

public class MapSearch extends Action {
	
	private static final int ICON = R.drawable.map;
	private static final String DEFAULT_LABEL = "View on Map";
	private static final String GOOGLE_MAPS_PACKAGE_NAME = "com.google.android.apps.maps";
	private static final String MAPS_ACTIVITY_NAME = "com.google.android.maps.MapsActivity";
	private static final ComponentName GOOGLE_MAPS = new ComponentName(GOOGLE_MAPS_PACKAGE_NAME, MAPS_ACTIVITY_NAME);
	public static final String MAPS_BASE_URL = "http://maps.google.com/maps/?q=";
	private static final String VIEW = "android.intent.action.VIEW";

	public static MapSearch searchMapsFor(Context activity, String searchString) {
		return new MapSearch(
				activity,
				MAPS_BASE_URL + searchString,
				DEFAULT_LABEL);
	}
	
	public static MapSearch searchNear(Context activity, University university, String searchFor, int iconReference ) {
		return new MapSearch(
				MAPS_BASE_URL + searchFor + " " + university.postCode(),
				activity,
				searchFor,
				iconReference);
	}
	
	private MapSearch(Context activity, String query, String label) {
		this(query, activity, label, ICON);
	}
	
	private MapSearch(String query, Context activity, String label, int iconReference) {
		super(showAMap(query), label, activity, iconReference);
	}
	
	private static Intent showAMap(String thingToSearchFor) {
		Intent theIntent = new Intent(VIEW,	mapQueryFor(thingToSearchFor));
		theIntent.setComponent(GOOGLE_MAPS);
		return theIntent;
	}
	
	private static Uri mapQueryFor(String query) {
		return Uri.parse(query);
	}
}
