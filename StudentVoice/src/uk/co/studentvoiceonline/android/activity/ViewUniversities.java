package uk.co.studentvoiceonline.android.activity;

import static uk.co.studentvoiceonline.android.adapter.UniversitiesAdapter.during;
import static uk.co.studentvoiceonline.android.adapter.UniversitiesAdapter.forListing;

import java.util.List;

import uk.co.studentvoiceonline.University;
import uk.co.studentvoiceonline.UniversityExpert;
import uk.co.studentvoiceonline.android.R;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

public class ViewUniversities extends ListActivity {
    private static final int VIEW_DETAILS = 1;
	private static final int VIEW_UNIVERSITIES_LAYOUT = R.layout.view_universities;
	public static University currentUniversity; //FIXME
	
	private List<University> theUniversities;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        theUniversities = theUniversities();
        display(theUniversities);
        enableUserToFilterTextByTyping();
    }
    
    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        Intent i = new Intent(this, ViewUniversityDetails.class);
        University[] universities = new University[]{};
        universities = theUniversities.toArray(universities);
        currentUniversity = universities[position];
        startActivityForResult(i, VIEW_DETAILS);
    }

	////////////////////////////////////////////////////////
	private void display(List<University> theUniversities) {
		setContentView(VIEW_UNIVERSITIES_LAYOUT);
		setListAdapter(forListing(theUniversities, during(this)));
	}

	private void enableUserToFilterTextByTyping() {
		getListView().setTextFilterEnabled(true);
	}

	private List<University> theUniversities() {
		return new UniversityExpert().whatAreTheUniversities();
	}
}