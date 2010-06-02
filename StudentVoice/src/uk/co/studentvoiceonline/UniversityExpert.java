package uk.co.studentvoiceonline;

import java.util.Arrays;
import java.util.List;


public class UniversityExpert {

	//For now, the universities are hard-coded here as we explore the data required for them
	//TODO: Move this to a local DB
	//TODO: Enable update of local DB by refreshing from server-side data (which will need a server somewhere :-)
	
	public List<University> whatAreTheUniversities() {
		return  Arrays.asList(
				new University("American Intercontinental University","W1U 4RY","11155520901330056671","http://www.ucas.ac.uk/students/choosingcourses/choosinguni/instguide/a/a50", "http://www.qype.co.uk/place/preview/uk-2700870-american-intercontinental-university-marylebone-london"),
				new University("Birkbeck, University of London","WC1E 7HX","10880530465000407538","http://www.ucas.ac.uk/students/choosingcourses/choosinguni/instguide/b/b24","http://www.qype.co.uk/place/78011-Birkbeck-College-London"),
				new University("Central School of Speech and Drama, University of London","NW3 3HY","1072782153629315779","http://www.ucas.ac.uk/students/choosingcourses/choosinguni/instguide/c/c35","http://www.qype.co.uk/place/488633-Central-School-Of-Speech-Drama-London"),
				new University("Courtauld Institute of Art (University of London)","WC2R 0RN","10116671075525023549","http://www.ucas.ac.uk/students/choosingcourses/choosinguni/instguide/c/c80","http://www.qype.co.uk/place/133187-Courtauld-Institute-of-Art-London"),
				new University("Goldsmiths College, University of London","SE14 6NW","1002601385452425671","http://www.ucas.ac.uk/students/choosingcourses/choosinguni/instguide/g/g56","http://www.qype.co.uk/place/preview/uk-2668393-goldsmiths-college-university-of-london-new-cross-london"),
				new University("Heythrop College (University of London)","W8 5HQ","10835989593760698084","http://www.ucas.ac.uk/students/choosingcourses/choosinguni/instguide/h/h48","http://www.qype.co.uk/place/909057-Heythrop-College-London"),
				new University("King's College London (University of London)","WC2R 2LS","13846261910202610806","http://www.ucas.ac.uk/students/choosingcourses/choosinguni/instguide/k/k60","http://www.qype.co.uk/place/196985-Kings-College-London-London"),
				new University("Kingston University","KT1 2HX", "10316787477712959008", "http://www.ucas.ac.uk/students/choosingcourses/choosinguni/instguide/k/k84","http://www.qype.co.uk/place/473017-Kingston-University-London"),
				new University("London Metropolitan University","N7 8DB","6229147341851947924","http://www.ucas.ac.uk/students/choosingcourses/choosinguni/instguide/l/l68","http://www.qype.co.uk/place/219911-London-Metropolitan-University-London"),
				new University("London School of Economics and Political Science (LSE)","WC2A 2AE","2050772752166985308","http://www.ucas.ac.uk/students/choosingcourses/choosinguni/instguide/l/l72","http://www.qype.co.uk/place/78639-London-School-of-Economics-Political-Science-London"),
				new University("London South Bank University","SE1 0AA","2540528147409724364","http://www.ucas.ac.uk/students/choosingcourses/choosinguni/instguide/l/l75","http://www.qype.co.uk/place/1001458-South-Bank-University-London"),
				new University("Queen Mary, University of London","E1 4NS","9635784459719167520","http://www.ucas.ac.uk/students/choosingcourses/choosinguni/instguide/q/q50","http://www.qype.co.uk/place/1006990-Queen-Mary-University-of-London-London"),
				new University("Royal Holloway, University of London","TW20 0EX","13746896549791748443","http://www.ucas.ac.uk/students/choosingcourses/choosinguni/instguide/r/r72","http://www.qype.co.uk/place/1456986-Royal-Holloway-University-of-London-London"),
				new University("Royal Veterinary College (University of London)","NW1 0TU","16013454900763898126","http://www.ucas.ac.uk/students/choosingcourses/choosinguni/instguide/r/r84","http://www.qype.co.uk/place/1033835-The-Royal-Veterinary-College-London"),
				new University("School of Oriental and African Studies (University of London)","WC1H 0XG","6371754648843883649","http://www.ucas.ac.uk/students/choosingcourses/choosinguni/instguide/s/s09","http://www.qype.co.uk/place/326181-School-Of-Oriental-African-Studies-London"),
				new University("St George's, University of London","SW17 0RE","10828006040904170641","http://www.ucas.ac.uk/students/choosingcourses/choosinguni/instguide/s/s49","http://www.qype.co.uk/place/1457009-St-Georges-University-of-London-London"),
				new University("The School of Pharmacy (University of London)","WC1N 1AX","3846371113663047455","http://www.ucas.ac.uk/students/choosingcourses/choosinguni/instguide/s/s12","http://www.qype.co.uk/place/1457016-The-School-of-Pharmacy-University-of-London--London"),
				new University("University College London (University of London)","WC1E 6BT","668903451243308006","http://www.ucas.ac.uk/students/choosingcourses/choosinguni/instguide/u/u80","http://www.qype.co.uk/place/1457026-University-College-London-University-of-London--London"),
				new University("University of East London","E16 2RD","95718589772144530","http://www.ucas.ac.uk/students/choosingcourses/choosinguni/instguide/e/e28","http://www.qype.co.uk/place/1457030-University-of-East-London-London"),
				new University("University of Greenwich","SE10 9LS","13452187737645653133","http://www.ucas.ac.uk/students/choosingcourses/choosinguni/instguide/g/g70","http://www.qype.co.uk/place/99340-University-of-Greenwich-London"),
				new University("University of The Arts London","W1K 5DA","16242444985143667808","http://www.ucas.ac.uk/students/choosingcourses/choosinguni/instguide/u/u65","http://www.qype.co.uk/place/1457034-University-of-The-Arts-London-London")
				);
							
	}
}