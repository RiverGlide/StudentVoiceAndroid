package uk.co.studentvoiceonline.adapter;

import java.util.List;

import uk.co.studentvoiceonline.University;


public class Universities {

	public static University[] arrayOf(List<University> list) {
		University[] universities = new University[]{};
		return list.toArray(universities);
	}

}
