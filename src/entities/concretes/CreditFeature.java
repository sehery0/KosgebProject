package entities.concretes;

public class CreditFeature {
	private int creditFeatureId;
	private Feature feature;
	private Credit credit;

	public CreditFeature() {
		super();
	}

	public CreditFeature(int creditFeatureId, Feature feature, Credit credit) {
		super();
		this.creditFeatureId = creditFeatureId;
		this.feature = feature;
		this.credit = credit;
	}

	public int getCreditFeatureId() {
		return creditFeatureId;
	}

	public void setCreditFeatureId(int creditFeatureId) {
		this.creditFeatureId = creditFeatureId;
	}

	public Feature getFeature() {
		return feature;
	}

	public void setFeature(Feature feature) {
		this.feature = feature;
	}

	public Credit getCredit() {
		return credit;
	}

	public void setCredit(Credit credit) {
		this.credit = credit;
	}

}
