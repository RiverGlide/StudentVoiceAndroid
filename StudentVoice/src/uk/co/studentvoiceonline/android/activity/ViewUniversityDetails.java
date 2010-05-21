package uk.co.studentvoiceonline.android.activity;

import uk.co.studentvoiceonline.android.R;
import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class ViewUniversityDetails extends Activity {

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.view_university_detail);
		TextView text = (TextView)findViewById(R.id.university_name);
		text.setText("Name: " + ViewUniversities.theChosenUniversity + "\n");
	}
}
