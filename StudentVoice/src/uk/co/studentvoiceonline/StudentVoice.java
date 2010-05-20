package uk.co.studentvoiceonline;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

public class StudentVoice extends ListActivity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
		setListAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,getUniversities()));
		getListView().setTextFilterEnabled(true);
    }

	private String[] getUniversities() {
		return new String[]{
				"Greenwich University",
				"North London University",
				"Oxford University",
				"Cambridge University",
				"South Bank University",
				"Brunel University",
				"University of Hertfordshire",
				"Some other University",
				"Lancaster University",
				"Leicester University",
				"This other University"
				};
	}
}