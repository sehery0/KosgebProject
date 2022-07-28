package entities.concretes;

public class Feature {
	private int featureId;
	private String featureName;
	private String featureValue;

	public Feature() {
		super();
	}

	public Feature(int featureId, String featureName, String featureValue) {
		super();
		this.featureId = featureId;
		this.featureName = featureName;
		this.featureValue = featureValue;
	}

	public Feature(int featureId, String featureName) {
		super();
		this.featureId = featureId;
		this.featureName = featureName;
	}

	public int getFeatureId() {
		return featureId;
	}

	public void setFeatureId(int featureId) {
		this.featureId = featureId;
	}

	public String getFeatureName() {
		return featureName;
	}

	public void setFeatureName(String featureName) {
		this.featureName = featureName;
	}

	public String getFeatureValue() {
		return featureValue;
	}

	public void setFeatureValue(String featureValue) {
		this.featureValue = featureValue;
	}

}
