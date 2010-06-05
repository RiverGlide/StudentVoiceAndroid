package uk.co.studentvoiceonline.android.activity;

import uk.co.studentvoiceonline.R;
import android.app.AlertDialog;
import android.content.Context;

public class Credits {

	public static void shownFor(Context activity) {
		AlertDialog dialog = createCreditsDialogForThe(activity);
        
        dialog.show();
	}

	private static AlertDialog createCreditsDialogForThe(Context activity) {
		AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setTitle("Credits");
        builder.setMessage(R.string.credits);
        return builder.create();
        
	}
}
