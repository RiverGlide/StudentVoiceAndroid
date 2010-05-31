package uk.co.studentvoiceonline.android.activity.action;

import uk.co.studentvoiceonline.android.R;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

public class MapSearch extends Action {
	
	private static final int ICON = R.drawable.map;
	private static final String ACTION_ITEM_LABEL = "View on Map";
	private static final String GOOGLE_MAPS_PACKAGE_NAME = "com.google.android.apps.maps";
	private static final String MAPS_ACTIVITY_NAME = "com.google.android.maps.MapsActivity";
	private static final ComponentName GOOGLE_MAPS = new ComponentName(GOOGLE_MAPS_PACKAGE_NAME, MAPS_ACTIVITY_NAME);
	public static final String MAPS_BASE_URL = "http://maps.google.com/maps";
	private static final String MAP_QUERYSTRING_PREFIX = "?q=";
	private static final String VIEW = "android.intent.action.VIEW";

	public static MapSearch typicalMapSearchFor(Context activity, String searchString) {
		return new MapSearch(
				MAPS_BASE_URL + MAP_QUERYSTRING_PREFIX + searchString,
				activity);
	}
	
	public static MapSearch placeSearchFor(Context activity, String placeId) {
		return new MapSearch(
				MAPS_BASE_URL + "/place?cid=" + placeId,
				activity);
	}
	
	private MapSearch(String query, Context activity) {
		super(showAMap(query), ACTION_ITEM_LABEL, activity, ICON);
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
