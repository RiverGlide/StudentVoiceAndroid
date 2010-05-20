package uk.co.studentvoiceonline;

import java.util.List;

import uk.co.studentvoiceonline.domain.University;
import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

public class ViewUniversities extends ListActivity {
    private static final int VIEW_UNIVERSITIES_LAYOUT = R.layout.view_universities;
	private static final int LIST_LAYOUT = android.R.layout.simple_list_item_1;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        display(theUniversities());
        enableUserToFilterTextByTyping();
    }

    ////////////////////////////////////////////////////////
	private void display(List<University> theUniversities) {
		setContentView(VIEW_UNIVERSITIES_LAYOUT);
		setListAdapter(forListing(theUniversities));
	}

	private void enableUserToFilterTextByTyping() {
		getListView().setTextFilterEnabled(true);
	}

	private ArrayAdapter<University> forListing(List<University> theUniversities) {
		return new ArrayAdapter<University>(
				this,
				LIST_LAYOUT,
				theUniversities
				);
	}

	private List<University> theUniversities() {
		return new UniversityExpert().whatAreTheUniversities();
	}
}