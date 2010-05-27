package uk.co.studentvoiceonline.android.activity;

import uk.co.studentvoiceonline.android.R;
import android.app.Activity;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class ViewUniversityDetails extends Activity {

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.view_university_detail);
		TextView text = (TextView)findViewById(R.id.university_name);
		text.setText(ViewUniversities.theChosenUniversity.name() + "\n");
		
		TextView ucasLink = (TextView)findViewById(R.id.ucas_link);
		
		ucasLink.setText(Html.fromHtml(
				"<a href=\"" 
				+ ViewUniversities.theChosenUniversity.ucasLink()
				+"\">"
				+ "View on UCAS website"
				+"</a>"));
		ucasLink.setMovementMethod(LinkMovementMethod.getInstance());
	}
}
