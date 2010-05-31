package uk.co.studentvoiceonline.android.activity;

import java.util.Arrays;
import java.util.List;

import uk.co.studentvoiceonline.University;
import uk.co.studentvoiceonline.android.R;
import uk.co.studentvoiceonline.android.activity.action.Action;
import uk.co.studentvoiceonline.android.adapter.ActionsAdapter;
import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

public abstract class UniversityActionsListActivity extends ListActivity {
	
	protected List<Action> actions;
	
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.find_local_attractions);

		showTheNameOf(theChosenUniversity());
		showTheActionsFor(theChosenUniversity());
	}

	protected University theChosenUniversity() {
		return ViewUniversities.theChosenUniversity;
	}
	
    @Override
    protected void onListItemClick(ListView l, View v, int thePositionSelected, long id) {
        super.onListItemClick(l, v, thePositionSelected, id);
        
        Action action = actions.get(thePositionSelected);
        action.now();
    }
	
	private void showTheNameOf(University theChosenUniversity) {
		TextView text = (TextView)findViewById(R.id.university_name);
		text.setText(theChosenUniversity.name() + "\n");
	}

	private void showTheActionsFor(University theChosenUniversity) {	
		setListAdapter(new ActionsAdapter(this,	actions));
	}

	protected List<Action> theFollowing(Action...list) {
		return Arrays.asList(list);
	}
}
