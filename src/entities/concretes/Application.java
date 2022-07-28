package entities.concretes;

public class Application {
	private int applicationId;
	private String state;
	private Applicant applicant;
	private Credit credit;

	public Application() {
		super();
	}

	public Application(int applicationId, String state, Applicant applicant, Credit credit) {
		super();
		this.applicationId = applicationId;
		this.state = state;
		this.applicant = applicant;
		this.credit = credit;
	}

	public int getApplicationId() {
		return applicationId;
	}

	public void setApplicationId(int applicationId) {
		this.applicationId = applicationId;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Applicant getApplicant() {
		return applicant;
	}

	public void setApplicant(Applicant applicant) {
		this.applicant = applicant;
	}

	public Credit getCredit() {
		return credit;
	}

	public void setCredit(Credit credit) {
		this.credit = credit;
	}

	

}
