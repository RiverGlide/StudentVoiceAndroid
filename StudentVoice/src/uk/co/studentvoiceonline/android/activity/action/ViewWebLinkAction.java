package uk.co.studentvoiceonline.android.activity.action;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

public abstract class ViewWebLinkAction extends Action {

	private static final String VIEW = "android.intent.action.VIEW";
	
	public ViewWebLinkAction(Intent intent, String label, Context activity, int iconRef) {
		super(intent, label, activity, iconRef);
	}

	protected static Intent takingTheUserTo(String link) {
		Intent theIntent = new Intent(VIEW,	Uri.parse(link));
		return theIntent;
	}
}
