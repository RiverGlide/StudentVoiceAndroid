package uk.co.studentvoiceonline.adapter;
import java.util.List;

import uk.co.studentvoiceonline.domain.University;
import android.content.Context;
import android.widget.ArrayAdapter;


public class UniversitiesAdapter extends ArrayAdapter<University> {
	private static final int LIST_LAYOUT = android.R.layout.simple_list_item_1;
	
	public static UniversitiesAdapter forListing(List<University> theUniversities, Context duringThisActivity) {
		return new UniversitiesAdapter(duringThisActivity, theUniversities);
	}
	
	public static Context during(Context theActivity) {
		return theActivity;
	}
	
	private UniversitiesAdapter(Context theActivity, List<University> theUniversities) {
		super(theActivity,
				LIST_LAYOUT,
				theUniversities
				);
	}
}
