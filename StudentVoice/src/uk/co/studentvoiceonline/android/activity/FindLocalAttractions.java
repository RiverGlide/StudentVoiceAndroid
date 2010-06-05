package uk.co.studentvoiceonline.android.activity;

import static uk.co.studentvoiceonline.android.activity.action.MapSearch.searchNear;
import uk.co.studentvoiceonline.R;
import uk.co.studentvoiceonline.University;
import android.os.Bundle;

public class FindLocalAttractions extends UniversityActionsListActivity {
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		University university = theChosenUniversity();
		
		message="What kind of thing are you interested in?";
		
		actions = theFollowing(
					searchNear(this, university, "Bars and Clubs", 	R.drawable.bars_clubs),
					searchNear(this, university, "Coffee Bars", 	R.drawable.cafe),
					searchNear(this, university, "Free WiFi", 		R.drawable.wifi),
					searchNear(this, university, "Book Stores", 	R.drawable.book_stores),
					searchNear(this, university, "Banks", 	        R.drawable.banks),
					searchNear(this, university, "Fast Food",	 	R.drawable.fast_food),
					searchNear(this, university, "Libraries", 		R.drawable.libraries),
					searchNear(this, university, "Cinemas", 		R.drawable.cinema),
					searchNear(this, university, "Shopping Centres",R.drawable.shopping_centres),
					searchNear(this, university, "Restaurants", 	R.drawable.eating_out),
					searchNear(this, university, "Romantic Places", R.drawable.romantic_places)					
				);
		
		super.onCreate(savedInstanceState);
	}
}
