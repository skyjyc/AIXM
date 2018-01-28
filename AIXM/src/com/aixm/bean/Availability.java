package com.aixm.bean;

/**
 * Availability entity. @author MyEclipse Persistence Tools
 */

public class Availability implements java.io.Serializable {

	// Fields

	private String designator;
	private String operationalStatusValue;
	private String operationalStatusNilReason;
	private String warningValue;
	private String warningNilReason;
	private String useTypeValue;
	private String useTypeNilReason;
	private double usePriorPermissionValue;
	private String usePriorPermissionUom;
	private String usePriorPermissionNilReason;

	// Constructors

	/** default constructor */
	public Availability() {
	}

	/** minimal constructor */
	public Availability(String designator) {
		this.designator = designator;
	}

	/** full constructor */
	public Availability(String designator, String operationalStatusValue, String operationalStatusNilReason,
			String warningValue, String warningNilReason, String useTypeValue, String useTypeNilReason,
			double usePriorPermissionValue, String usePriorPermissionUom, String usePriorPermissionNilReason) {
		this.designator = designator;
		this.operationalStatusValue = operationalStatusValue;
		this.operationalStatusNilReason = operationalStatusNilReason;
		this.warningValue = warningValue;
		this.warningNilReason = warningNilReason;
		this.useTypeValue = useTypeValue;
		this.useTypeNilReason = useTypeNilReason;
		this.usePriorPermissionValue = usePriorPermissionValue;
		this.usePriorPermissionUom = usePriorPermissionUom;
		this.usePriorPermissionNilReason = usePriorPermissionNilReason;
	}

	// Property accessors

	public String getDesignator() {
		return this.designator;
	}

	public void setDesignator(String designator) {
		this.designator = designator;
	}

	public String getOperationalStatusValue() {
		return this.operationalStatusValue;
	}

	public void setOperationalStatusValue(String operationalStatusValue) {
		this.operationalStatusValue = operationalStatusValue;
	}

	public String getOperationalStatusNilReason() {
		return this.operationalStatusNilReason;
	}

	public void setOperationalStatusNilReason(String operationalStatusNilReason) {
		this.operationalStatusNilReason = operationalStatusNilReason;
	}

	public String getWarningValue() {
		return this.warningValue;
	}

	public void setWarningValue(String warningValue) {
		this.warningValue = warningValue;
	}

	public String getWarningNilReason() {
		return this.warningNilReason;
	}

	public void setWarningNilReason(String warningNilReason) {
		this.warningNilReason = warningNilReason;
	}

	public String getUseTypeValue() {
		return this.useTypeValue;
	}

	public void setUseTypeValue(String useTypeValue) {
		this.useTypeValue = useTypeValue;
	}

	public String getUseTypeNilReason() {
		return this.useTypeNilReason;
	}

	public void setUseTypeNilReason(String useTypeNilReason) {
		this.useTypeNilReason = useTypeNilReason;
	}

	public double getUsePriorPermissionValue() {
		return this.usePriorPermissionValue;
	}

	public void setUsePriorPermissionValue(double usePriorPermissionValue) {
		this.usePriorPermissionValue = usePriorPermissionValue;
	}

	public String getUsePriorPermissionUom() {
		return this.usePriorPermissionUom;
	}

	public void setUsePriorPermissionUom(String usePriorPermissionUom) {
		this.usePriorPermissionUom = usePriorPermissionUom;
	}

	public String getUsePriorPermissionNilReason() {
		return this.usePriorPermissionNilReason;
	}

	public void setUsePriorPermissionNilReason(String usePriorPermissionNilReason) {
		this.usePriorPermissionNilReason = usePriorPermissionNilReason;
	}

}