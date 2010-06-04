package uk.co.studentvoiceonline.android.activity;

import uk.co.studentvoiceonline.android.R;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;

public class Welcome extends Activity {

	private Intent nextActivity;
	private SharedPreferences prefs;

	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome);

        theUserCanChooseToContinue();
        theUserCanChooseToSkipThisActivity();
    }

	private void theUserCanChooseToSkipThisActivity() {
		skipThisActivityFromUserPreference(whetherThisScreenWillBeShownAgain());
	}

	private void skipThisActivityFromUserPreference(boolean shouldShowAgain) {
		if (!shouldShowAgain) {
        	startActivity(nextActivity);
        }
	}

	private boolean whetherThisScreenWillBeShownAgain() {
		prefs = getPreferences(MODE_PRIVATE);
        CheckBox showAgain = (CheckBox)findViewById(R.id.show_again);
        
        boolean shouldShowAgain = prefs.getBoolean("show_welcome_screen_again", true);
        
        showAgain.setChecked(shouldShowAgain);
                
        showAgain.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        		SharedPreferences.Editor editor = prefs.edit();
        		editor.putBoolean("show_welcome_screen_again", isChecked);
        		editor.commit();
        	}
        });
		return shouldShowAgain;
	}

	private void theUserCanChooseToContinue() {
		nextActivity = new Intent(this,ViewUniversities.class);
		
		final Button button = (Button) findViewById(R.id.next);
        button.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
                startActivity(nextActivity);
            }
        });
	}

	public boolean onCreateOptionsMenu(Menu menu) {
		menu.add("Credits");
		return true;
	}

	public boolean onOptionsItemSelected(MenuItem item) {
		Credits.shownFor(this);
		return true;
	}
}