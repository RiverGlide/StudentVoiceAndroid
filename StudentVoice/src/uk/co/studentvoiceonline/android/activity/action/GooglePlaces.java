package uk.co.studentvoiceonline.android.activity.action;

import uk.co.studentvoiceonline.R;
import android.content.Context;

public class GooglePlaces extends ViewWebLinkAction {
	
	private static final int ICON = R.drawable.default_icon;
	private static final String ACTION_ITEM_LABEL = "About this place (Google)";

	public static GooglePlaces informationOnGoogleFor(Context activity, String placeId) {
		return new GooglePlaces(
				"http://www.google.com/maps" + "/place?cid=" + placeId,
				activity);
	}
	
	private GooglePlaces(String link, Context activity) {
		super(takingTheUserTo(link), ACTION_ITEM_LABEL, activity, ICON);
	}
}
