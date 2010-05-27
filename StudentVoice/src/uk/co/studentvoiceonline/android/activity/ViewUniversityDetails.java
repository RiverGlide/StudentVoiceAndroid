package uk.co.studentvoiceonline.android.activity;

import java.util.Arrays;
import java.util.List;

import uk.co.studentvoiceonline.University;
import uk.co.studentvoiceonline.android.R;
import android.app.ListActivity;
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class ViewUniversityDetails extends ListActivity {
	private static final String VIEW = "android.intent.action.VIEW";
	private static final String MAPS_ACTIVITY_NAME = "com.google.android.maps.MapsActivity";
	private static final String GOOGLE_MAPS_PACKAGE_NAME = "com.google.android.apps.maps";
	private static final ComponentName GOOGLE_MAPS = new ComponentName(GOOGLE_MAPS_PACKAGE_NAME, MAPS_ACTIVITY_NAME);
	private static final String MAPS_BASE_URL = "http://maps.google.com/maps?q=";
	private List<Action> actions;
	
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.view_university_detail);

		University theChosenUniversity = ViewUniversities.theChosenUniversity; 
		showTheNameOf(theChosenUniversity);
		actions = theActionsFor(theChosenUniversity);
	}
	
    @Override
    protected void onListItemClick(ListView l, View v, int thePositionSelected, long id) {
        super.onListItemClick(l, v, thePositionSelected, id);

        Action[] array = new Action[]{};
        array = actions.toArray(array);
        array[thePositionSelected].now();
    }
	
	private List<Action> theActionsFor(University theChosenUniversity) {
		List<Action> actions = Arrays.asList(
				new Action(showAMapDisplaying(theChosenUniversity), "View on Map", this),
				new Action(takingTheUserToUcas(theChosenUniversity), "UCAS information", this)
				);
		
		setListAdapter(new ArrayAdapter<Action>(this,
				R.layout.action_item,
				R.id.action_name,
				actions));
		return actions;
	}

	private Intent takingTheUserToUcas(University theChosenUniversity) {
		Intent theIntent = new Intent(VIEW,	Uri.parse(theChosenUniversity.ucasLink()));
		return theIntent;
	}

	private void showTheNameOf(University theChosenUniversity) {
		TextView text = (TextView)findViewById(R.id.university_name);
		text.setText(theChosenUniversity.name() + "\n");
	}
	
	private Intent showAMapDisplaying(University theChosenUniversity) {
		Intent theIntent = new Intent(VIEW,	mapBasedOnAQueryFor(theChosenUniversity));
		theIntent.setComponent(GOOGLE_MAPS);
		return theIntent;
	}
	
	private Uri mapBasedOnAQueryFor(University theChosenUniversity) {
		return Uri.parse(MAPS_BASE_URL + theChosenUniversity.name());
	}

}
