package uk.co.studentvoiceonline.android.activity.action;

import android.content.Context;
import android.content.Intent;

public class Action {

	private final Intent intent;
	private final String label;
	private final Context activity;
	protected int iconReference;

	public Action(Intent intent, String label, Context activity) {
		this.intent = intent;
		this.label = label;
		this.activity = activity;
	}
	
	public void now() {
		activity.startActivity(intent);
	}
	
	public String label() {
		return label;
	}
	
	public int iconReference() {
		return iconReference;
	}

}
