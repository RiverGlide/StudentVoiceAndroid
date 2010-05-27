package uk.co.studentvoiceonline;

public class University {

	private final String name;
	private final String ucasLink;

	public University(String name, String ucasLink) {
		this.name = name;
		this.ucasLink = ucasLink;
	}
	
	public String name() {
		return name;
	}
	
	public String toString() {
		return name;
	}

	public String ucasLink() {
		return ucasLink;
	}
}
