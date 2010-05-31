package uk.co.studentvoiceonline;

public class University {

	private final String name;
	private final String ucasLink;
	private final String qypeLink;
	private final String placeId;
	private final String postCode;

	public University(String name, String postCode, String placeId, String ucasLink, String qypeLink) {
		this.name = name;
		this.postCode = postCode;
		this.placeId = placeId;
		this.ucasLink = ucasLink;
		this.qypeLink = qypeLink;
	}
	
	public String name() {
		return name;
	}
	
	@Override
	public String toString() {
		return name;
	}

	public String ucasLink() {
		return ucasLink;
	}
	
	public String qypeLink() {
		return qypeLink;
	}

	public String placeId() {
		return placeId;
	}

	public String postCode() {
		return postCode;
	}
}
