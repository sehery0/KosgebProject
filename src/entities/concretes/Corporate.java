package entities.concretes;

public class Corporate extends Applicant {
	private int corporateId;
	private String companyName;
	private String taxNumber;
	private String scale;

	public Corporate() {
		super();
	}

	public Corporate(int id, String userName, String password, String email, int applicantId, String applicantNumber, int corporateId, String companyName, String taxNumber, String scale) {
		super(id, userName, password, email, applicantId, applicantNumber);
		this.corporateId = corporateId;
		this.companyName = companyName;
		this.taxNumber = taxNumber;
		this.scale = scale;
	}

	public int getCorporateId() {
		return corporateId;
	}

	public void setCorporateId(int corporateId) {
		this.corporateId = corporateId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getTaxNumber() {
		return taxNumber;
	}

	public void setTaxNumber(String taxNumber) {
		this.taxNumber = taxNumber;
	}

	public String getScale() {
		return scale;
	}

	public void setScale(String scale) {
		this.scale = scale;
	}

}
