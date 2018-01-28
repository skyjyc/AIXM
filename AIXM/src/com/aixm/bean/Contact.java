package com.aixm.bean;

/**
 * Contact entity. @author MyEclipse Persistence Tools
 */

public class Contact implements java.io.Serializable {

	// Fields

	private String designator;
	private String contactInformationNameValue;
	private String contactInformationNameNilReason;
	private String titleValue;
	private String titleNilReason;

	// Constructors

	/** default constructor */
	public Contact() {
	}

	/** minimal constructor */
	public Contact(String designator) {
		this.designator = designator;
	}

	/** full constructor */
	public Contact(String designator, String contactInformationNameValue, String contactInformationNameNilReason,
			String titleValue, String titleNilReason) {
		this.designator = designator;
		this.contactInformationNameValue = contactInformationNameValue;
		this.contactInformationNameNilReason = contactInformationNameNilReason;
		this.titleValue = titleValue;
		this.titleNilReason = titleNilReason;
	}

	// Property accessors

	public String getDesignator() {
		return this.designator;
	}

	public void setDesignator(String designator) {
		this.designator = designator;
	}

	public String getContactInformationNameValue() {
		return this.contactInformationNameValue;
	}

	public void setContactInformationNameValue(String contactInformationNameValue) {
		this.contactInformationNameValue = contactInformationNameValue;
	}

	public String getContactInformationNameNilReason() {
		return this.contactInformationNameNilReason;
	}

	public void setContactInformationNameNilReason(String contactInformationNameNilReason) {
		this.contactInformationNameNilReason = contactInformationNameNilReason;
	}

	public String getTitleValue() {
		return this.titleValue;
	}

	public void setTitleValue(String titleValue) {
		this.titleValue = titleValue;
	}

	public String getTitleNilReason() {
		return this.titleNilReason;
	}

	public void setTitleNilReason(String titleNilReason) {
		this.titleNilReason = titleNilReason;
	}

}