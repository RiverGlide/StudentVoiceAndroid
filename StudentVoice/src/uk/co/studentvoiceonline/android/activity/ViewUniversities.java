package uk.co.studentvoiceonline.android.activity;

import static uk.co.studentvoiceonline.android.adapter.UniversitiesAdapter.during;
import static uk.co.studentvoiceonline.android.adapter.UniversitiesAdapter.forListing;

import java.util.List;

import uk.co.studentvoiceonline.University;
import uk.co.studentvoiceonline.UniversityExpert;
import uk.co.studentvoiceonline.android.R;
import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;

public class ViewUniversities extends ListActivity {
	private static final int VIEW_DETAILS = 1;
	private static final int VIEW_UNIVERSITIES_LAYOUT = R.layout.view_universities;
	public static University theChosenUniversity; //TODO: should at least use a preference
	
	private ViewUniversities thisVeryActivity = this;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        showAListOf(theUniversities());
        theUserCanFilterThemByTyping();
    }
    
    @Override
    protected void onListItemClick(ListView l, View v, int thePositionSelected, long id) {
        super.onListItemClick(l, v, thePositionSelected, id);

        theChosenUniversity = theUniversityIn(thePositionSelected);
        showItsDetails();
    }
    
	public boolean onCreateOptionsMenu(Menu menu) {
	    menu.add("Credits");
	    return true;
	}

	public boolean onOptionsItemSelected(MenuItem item) {
	    	Credits.shownFor(this);
	        return true;
	}


	////////////////////////////////////////////////////////
	private void showAListOf(List<University> theUniversities) {
		setContentView(VIEW_UNIVERSITIES_LAYOUT);
		setListAdapter(forListing(theUniversities, during(thisVeryActivity)));
	}

	private void theUserCanFilterThemByTyping() {
		getListView().setTextFilterEnabled(true);
	}

	private List<University> theUniversities() {
		return new UniversityExpert().whatAreTheUniversities();
	}
	
	private University theUniversityIn(int fromThisPosition) {
		return (University)getListAdapter().getItem(fromThisPosition);
	}

	private void showItsDetails() {
		transitionTo(VIEW_DETAILS, definedByThe(ViewUniversityDetails.class));
	}

	private void transitionTo(int requestCode, Class<? extends Activity> activityClass) {
		Intent i = new Intent(this, activityClass);
        startActivityForResult(i, requestCode);
	}

	private Class<? extends Activity> definedByThe(
			Class<? extends Activity> activityClass) {
		return activityClass;
	}
}