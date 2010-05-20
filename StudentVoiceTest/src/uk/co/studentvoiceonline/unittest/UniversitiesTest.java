package uk.co.studentvoiceonline.unittest;

import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;
import uk.co.studentvoiceonline.University;
import uk.co.studentvoiceonline.adapter.Universities;

public class UniversitiesTest extends TestCase {
	
	public void testCreateArrayFromUniversities() throws Exception {
		University university1 = new University("Some Uni");
		University university2 = new University("Some Uni");
		
		List<University> list = listContaining(university1, university2);
		University[] expectedArray = new University[]{university1,university2};
		University[] arrayFromList = Universities.arrayOf(list);
		
		assertEquals(expectedArray.length, arrayFromList.length);
		for (int i = 0; i < arrayFromList.length; i++) {
			assertSame(expectedArray[i], arrayFromList[i]);
		}
		
	}

	private List<University> listContaining(University university1,
			University university2) {
		List<University> list = new ArrayList<University>();
		list.add(university1);
		list.add(university2);
		return list;
	}
}
