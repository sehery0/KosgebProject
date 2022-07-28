package entities.concretes;

public class BlackList {
	private int blackListId;
	private Applicant applicant;

	public BlackList() {
		super();
	}

	public BlackList(int blackListId, Applicant applicant) {
		super();
		this.blackListId = blackListId;
		this.applicant = applicant;
	}

	public int getBlackListId() {
		return blackListId;
	}

	public void setBlackListId(int blackListId) {
		this.blackListId = blackListId;
	}

	public Applicant getApplicant() {
		return applicant;
	}

	public void setApplicant(Applicant applicant) {
		this.applicant = applicant;
	}

}
