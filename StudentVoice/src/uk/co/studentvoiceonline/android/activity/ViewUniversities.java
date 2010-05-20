package uk.co.studentvoiceonline.android.activity;

import static uk.co.studentvoiceonline.android.adapter.UniversitiesAdapter.during;
import static uk.co.studentvoiceonline.android.adapter.UniversitiesAdapter.forListing;

import java.util.List;

import uk.co.studentvoiceonline.University;
import uk.co.studentvoiceonline.UniversityExpert;
import uk.co.studentvoiceonline.android.R;
import android.app.ListActivity;
import android.os.Bundle;

public class ViewUniversities extends ListActivity {
    private static final int VIEW_UNIVERSITIES_LAYOUT = R.layout.view_universities;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        display(theUniversities());
        enableUserToFilterTextByTyping();
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