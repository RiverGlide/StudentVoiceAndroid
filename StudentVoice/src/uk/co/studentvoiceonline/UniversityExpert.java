package uk.co.studentvoiceonline;

import java.util.ArrayList;
import java.util.List;


public class UniversityExpert {

	public List<University> whatAreTheUniversities() {
		String[] uniNames =  new String[]{
				"University College London",
				"King's College London", 
				"Birkbeck, University of London", 
				"American Intercontinental University", 
				"St George's, University of London",
				"London South Bank University",
				"University of East London", 
				"University of London Institute in Paris", 
				"London Metropolitan University",
				"Royal Veterinary College", 
				"University of The Arts London",
				"London School of Economics and Political Science", 
				"Central School of Speech and Drama",
				"Royal Holloway",
				"Heythrop College", 
				"The School of Pharmacy", 
				"Queen Mary, University of London",
				"Goldsmiths, University of London",
				"School of Oriental and African Studies", 
				"Court auld Institute of Art",
				"University of Greenwich"
				};
		
		ArrayList<University> universityList = new ArrayList<University>();
		
		for (String name : uniNames) {
			universityList.add(new University(name));
		}
		return universityList;			
	}
}
