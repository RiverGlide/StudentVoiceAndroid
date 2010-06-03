package uk.co.studentvoiceonline.android.activity;

import java.util.Arrays;
import java.util.List;

import uk.co.studentvoiceonline.University;
import uk.co.studentvoiceonline.android.R;
import uk.co.studentvoiceonline.android.activity.action.Action;
import uk.co.studentvoiceonline.android.adapter.ActionsAdapter;
import android.app.ListActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

public abstract class UniversityActionsListActivity extends ListActivity {
	
	protected List<Action> actions;
	protected String message = "";
	
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.action_list);

		showTheNameOf(theChosenUniversity());
		showThe(message);
		showTheActionsFor(theChosenUniversity());
	}

    private void showThe(String message) {
		TextView tv = (TextView)findViewById(R.id.message);
		tv.setText(message);
	}

	public boolean onCreateOptionsMenu(Menu menu) {
	    menu.add("Credits");
	    return true;
	}

	public boolean onOptionsItemSelected(MenuItem item) {
	    	Credits.shownFor(this);
	        return true;
	}
    
	@Override
    protected void onListItemClick(ListView l, View v, int theChosenItem, long id) {
        super.onListItemClick(l, v, theChosenItem, id);
        
        Action action = actions.get(theChosenItem);
        action.now();
    }
	
    protected University theChosenUniversity() {
    	return ViewUniversities.theChosenUniversity;
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
