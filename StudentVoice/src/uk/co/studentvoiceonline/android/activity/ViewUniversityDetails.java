package uk.co.studentvoiceonline.android.activity;

import uk.co.studentvoiceonline.University;
import uk.co.studentvoiceonline.android.R;
import android.app.Activity;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class ViewUniversityDetails extends Activity {
		
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.view_university_detail);

		University theChosenUniversity = ViewUniversities.theChosenUniversity; 
		showTheNameOf(theChosenUniversity);
		showALinkToTheUcasWebsiteFor(theChosenUniversity);
	}

	private void showALinkToTheUcasWebsiteFor(University theChosenUniversity) {
		TextView ucasLink = (TextView)findViewById(R.id.ucas_link);
		ucasLink.setText(ucasLinkFor(theChosenUniversity));
		ucasLink.setMovementMethod(LinkMovementMethod.getInstance());
	}

	private Spanned ucasLinkFor(University theChosenUniversity) {
		return Html.fromHtml(
				"<a href=\"" 
				+ theChosenUniversity.ucasLink()
				+"\">"
				+ "View on UCAS website"
				+"</a>"
				);
	}

	private void showTheNameOf(University theChosenUniversity) {
		TextView text = (TextView)findViewById(R.id.university_name);
		text.setText(theChosenUniversity.name() + "\n");
	}
}
