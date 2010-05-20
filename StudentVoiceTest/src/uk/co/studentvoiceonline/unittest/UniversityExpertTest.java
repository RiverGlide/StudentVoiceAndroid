package uk.co.studentvoiceonline.unittest;

import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;
import uk.co.studentvoiceonline.University;
import uk.co.studentvoiceonline.UniversityExpert;

public class UniversityExpertTest extends TestCase {
	
	public void testCreateArrayFromUniversities() throws Exception {
		University university1 = new University("Some Uni");
		University university2 = new University("Some Other Uni");
		
		List<University> list = listContaining(university1, university2);
		University[] expectedArray = new University[]{university1,university2};
		University[] arrayFromList = UniversityExpert.arrayOf(list);
		
		assertThatArraysContainTheSameItems(expectedArray, arrayFromList);
	}

	private List<University> listContaining(University... universities) {
		List<University> list = new ArrayList<University>();
		for (University university : universities) {
			list.add(university);
		}
		return list;
	}

	private void assertThatArraysContainTheSameItems(University[] expectedArray,
			University[] arrayFromList) {
		assertEquals(expectedArray.length, arrayFromList.length);
		for (int i = 0; i < arrayFromList.length; i++) {
			assertSame(expectedArray[i], arrayFromList[i]);
		}
	}
}
