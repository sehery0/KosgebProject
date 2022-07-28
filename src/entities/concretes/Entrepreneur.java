package entities.concretes;

public class Entrepreneur extends Applicant{
	private int entrepreneurId;
	private String firstName;
	private String lastName;
	private String nationalIdentity;
	
	
	public Entrepreneur() {
		super();
	}
	
	
	public Entrepreneur(int id, String userName, String password, String email, int applicantId, String applicantNumber, int entrepreneurId, String firstName, String lastName, String nationalIdentity) {
		super(id, userName, password, email, applicantId, applicantNumber);
		this.entrepreneurId = entrepreneurId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.nationalIdentity = nationalIdentity;
	}


	public int getEntrepreneurId() {
		return entrepreneurId;
	}


	public void setEntrepreneurId(int entrepreneurId) {
		this.entrepreneurId = entrepreneurId;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getNationalIdentity() {
		return nationalIdentity;
	}


	public void setNationalIdentity(String nationalIdentity) {
		this.nationalIdentity = nationalIdentity;
	}
	
	
	

}
