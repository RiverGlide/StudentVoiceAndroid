package uk.co.studentvoiceonline;

import java.util.ArrayList;
import java.util.List;


public class UniversityExpert {

	public List<University> whatAreTheUniversities() {
		String[] uniNames =  new String[]{
				"Greenwich University",
				"North London University",
				"Oxford University",
				"Cambridge University",
				"South Bank University",
				"Brunel University",
				"University of Hertfordshire",
				"Some other University",
				"Lancaster University",
				"Leicester University",
				"This other University"
				};
		
		ArrayList<University> universityList = new ArrayList<University>();
		
		for (String name : uniNames) {
			universityList.add(new University(name));
		}
		return universityList;			
	}
}
