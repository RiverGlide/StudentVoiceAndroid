package uk.co.studentvoiceonline.android.adapter;
import java.util.List;

import uk.co.studentvoiceonline.University;
import uk.co.studentvoiceonline.android.R;
import android.content.Context;
import android.widget.ArrayAdapter;


public class UniversitiesAdapter extends ArrayAdapter<University> {
	private static final int UNIVERSITY_LIST_ITEM = R.id.university_name;
	private static final int LIST_LAYOUT = R.layout.list_item;
	
	public static UniversitiesAdapter forListing(List<University> theUniversities, Context duringThisActivity) {
		return new UniversitiesAdapter(duringThisActivity, theUniversities);
	}
	
	public static Context during(Context theActivity) {
		return theActivity;
	}
	
	private UniversitiesAdapter(Context theActivity, List<University> theUniversities) {
		super(theActivity,
				LIST_LAYOUT,
				UNIVERSITY_LIST_ITEM,
				theUniversities
				);
	}
}
