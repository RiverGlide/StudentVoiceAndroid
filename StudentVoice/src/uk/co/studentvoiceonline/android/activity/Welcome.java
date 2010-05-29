package uk.co.studentvoiceonline.android.activity;

import uk.co.studentvoiceonline.android.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Welcome extends Activity {

	private Intent next;
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        next = new Intent(this,ViewUniversities.class);
        
        setContentView(R.layout.welcome);
        
        final Button button = (Button) findViewById(R.id.next);

        button.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
                startActivity(next);
            }
        });
    }
}