package com.aixm.bean;

/**
 * Servedcity entity. @author MyEclipse Persistence Tools
 */

public class Servedcity implements java.io.Serializable {

	// Fields

	private String designator;
	private String cityNameValue;
	private String cityNameNilReason;

	// Constructors

	/** default constructor */
	public Servedcity() {
	}

	/** minimal constructor */
	public Servedcity(String designator) {
		this.designator = designator;
	}

	/** full constructor */
	public Servedcity(String designator, String cityNameValue, String cityNameNilReason) {
		this.designator = designator;
		this.cityNameValue = cityNameValue;
		this.cityNameNilReason = cityNameNilReason;
	}

	// Property accessors

	public String getDesignator() {
		return this.designator;
	}

	public void setDesignator(String designator) {
		this.designator = designator;
	}

	public String getCityNameValue() {
		return this.cityNameValue;
	}

	public void setCityNameValue(String cityNameValue) {
		this.cityNameValue = cityNameValue;
	}

	public String getCityNameNilReason() {
		return this.cityNameNilReason;
	}

	public void setCityNameNilReason(String cityNameNilReason) {
		this.cityNameNilReason = cityNameNilReason;
	}

}