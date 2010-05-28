package uk.co.studentvoiceonline.android.activity;

import java.util.Arrays;
import java.util.List;

import uk.co.studentvoiceonline.University;
import uk.co.studentvoiceonline.android.R;
import uk.co.studentvoiceonline.android.activity.action.TypicalMapSearch;
import android.app.ListActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class ViewUniversityDetails extends ListActivity {

	private List<Action> actions;
	private static final String VIEW = "android.intent.action.VIEW";//FIXME
	
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.view_university_detail);

		University theChosenUniversity = ViewUniversities.theChosenUniversity; 
		showTheNameOf(theChosenUniversity);
		actions = theActionsFor(theChosenUniversity);
	}
	
    @Override
    protected void onListItemClick(ListView l, View v, int thePositionSelected, long id) {
        super.onListItemClick(l, v, thePositionSelected, id);

        Action[] array = new Action[]{};
        array = actions.toArray(array);
        array[thePositionSelected].now();
    }
	
	private List<Action> theActionsFor(University theChosenUniversity) {
		
		List<Action> actions = Arrays.asList(
				mapFor(theChosenUniversity),
				ucasPageFor(theChosenUniversity)				
				);
		
		setListAdapter(new ArrayAdapter<Action>(this,
				R.layout.action_item,
				R.id.action_name,
				actions));
		return actions;
	}

	private Action ucasPageFor(University theChosenUniversity) {
		return new Action(takingTheUserToUcas(theChosenUniversity), "UCAS information", this);
	}

	private Action mapFor(University theChosenUniversity) {
		return new TypicalMapSearch(theChosenUniversity.name(),this);
	}

	private Intent takingTheUserToUcas(University theChosenUniversity) {
		Intent theIntent = new Intent(VIEW,	Uri.parse(theChosenUniversity.ucasLink()));
		return theIntent;
	}

	private void showTheNameOf(University theChosenUniversity) {
		TextView text = (TextView)findViewById(R.id.university_name);
		text.setText(theChosenUniversity.name() + "\n");
	}
}
