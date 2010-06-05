package uk.co.studentvoiceonline.android.adapter;

import java.util.List;

import uk.co.studentvoiceonline.R;
import uk.co.studentvoiceonline.android.activity.action.Action;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ActionsAdapter extends ArrayAdapter<Action> {

	private final List<Action> actions;
	
	public ActionsAdapter(Context activity,	List<Action> actions) {
		super(activity,
			R.layout.action_item,
			R.id.action_name,
			actions);
		
		this.actions = actions;
	}
	
	public View getView(int position, View convertView, ViewGroup parent) { 
		View row = super.getView(position, convertView, parent); 
		
		TextView label=(TextView)row.findViewById(R.id.action_name); 
		label.setText(actions.get(position).label()); 
		
		ImageView icon = (ImageView)row.findViewById(R.id.action_icon);
		icon.setImageResource(actions.get(position).iconReference()); 
		
		return(row);
	}
}