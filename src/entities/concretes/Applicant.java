package entities.concretes;

public class Applicant extends User{
	private int applicantId;
	private String applicantNumber;

	public Applicant() {
		super();
	}

	public Applicant(int id, String userName, String password, String email, int applicantId, String applicantNumber) {
		super(id, userName, password, email);
		this.applicantId = applicantId;
		this.applicantNumber = applicantNumber;
	}

	public int getApplicantId() {
		return applicantId;
	}

	public void setApplicantId(int applicantId) {
		this.applicantId = applicantId;
	}

	public String getApplicantNumber() {
		return applicantNumber;
	}

	public void setApplicantNumber(String applicantNumber) {
		this.applicantNumber = applicantNumber;
	}
	
	

	

}
