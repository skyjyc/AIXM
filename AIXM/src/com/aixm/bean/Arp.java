package com.aixm.bean;

/**
 * Arp entity. @author MyEclipse Persistence Tools
 */

public class Arp implements java.io.Serializable {

	// Fields

	private String designator;
	private String elevationValue;
	private String elevationUom;
	private String elevationNilReason;
	private double geoidUndulationValue;
	private String geoidUndulationUom;
	private String geoidUndulationNilReason;
	private String verticalDatumValue;
	private String verticalDatumNilReason;
	private double verticalAccuracyValue;
	private String verticalAccuracyUom;
	private String verticalAccuracyNilReason;

	// Constructors

	/** default constructor */
	public Arp() {
	}

	/** minimal constructor */
	public Arp(String designator) {
		this.designator = designator;
	}

	/** full constructor */
	public Arp(String designator, String elevationValue, String elevationUom, String elevationNilReason,
			double geoidUndulationValue, String geoidUndulationUom, String geoidUndulationNilReason,
			String verticalDatumValue, String verticalDatumNilReason, double verticalAccuracyValue,
			String verticalAccuracyUom, String verticalAccuracyNilReason) {
		this.designator = designator;
		this.elevationValue = elevationValue;
		this.elevationUom = elevationUom;
		this.elevationNilReason = elevationNilReason;
		this.geoidUndulationValue = geoidUndulationValue;
		this.geoidUndulationUom = geoidUndulationUom;
		this.geoidUndulationNilReason = geoidUndulationNilReason;
		this.verticalDatumValue = verticalDatumValue;
		this.verticalDatumNilReason = verticalDatumNilReason;
		this.verticalAccuracyValue = verticalAccuracyValue;
		this.verticalAccuracyUom = verticalAccuracyUom;
		this.verticalAccuracyNilReason = verticalAccuracyNilReason;
	}

	// Property accessors

	public String getDesignator() {
		return this.designator;
	}

	public void setDesignator(String designator) {
		this.designator = designator;
	}

	public String getElevationValue() {
		return this.elevationValue;
	}

	public void setElevationValue(String elevationValue) {
		this.elevationValue = elevationValue;
	}

	public String getElevationUom() {
		return this.elevationUom;
	}

	public void setElevationUom(String elevationUom) {
		this.elevationUom = elevationUom;
	}

	public String getElevationNilReason() {
		return this.elevationNilReason;
	}

	public void setElevationNilReason(String elevationNilReason) {
		this.elevationNilReason = elevationNilReason;
	}

	public double getGeoidUndulationValue() {
		return this.geoidUndulationValue;
	}

	public void setGeoidUndulationValue(double geoidUndulationValue) {
		this.geoidUndulationValue = geoidUndulationValue;
	}

	public String getGeoidUndulationUom() {
		return this.geoidUndulationUom;
	}

	public void setGeoidUndulationUom(String geoidUndulationUom) {
		this.geoidUndulationUom = geoidUndulationUom;
	}

	public String getGeoidUndulationNilReason() {
		return this.geoidUndulationNilReason;
	}

	public void setGeoidUndulationNilReason(String geoidUndulationNilReason) {
		this.geoidUndulationNilReason = geoidUndulationNilReason;
	}

	public String getVerticalDatumValue() {
		return this.verticalDatumValue;
	}

	public void setVerticalDatumValue(String verticalDatumValue) {
		this.verticalDatumValue = verticalDatumValue;
	}

	public String getVerticalDatumNilReason() {
		return this.verticalDatumNilReason;
	}

	public void setVerticalDatumNilReason(String verticalDatumNilReason) {
		this.verticalDatumNilReason = verticalDatumNilReason;
	}

	public double getVerticalAccuracyValue() {
		return this.verticalAccuracyValue;
	}

	public void setVerticalAccuracyValue(double verticalAccuracyValue) {
		this.verticalAccuracyValue = verticalAccuracyValue;
	}

	public String getVerticalAccuracyUom() {
		return this.verticalAccuracyUom;
	}

	public void setVerticalAccuracyUom(String verticalAccuracyUom) {
		this.verticalAccuracyUom = verticalAccuracyUom;
	}

	public String getVerticalAccuracyNilReason() {
		return this.verticalAccuracyNilReason;
	}

	public void setVerticalAccuracyNilReason(String verticalAccuracyNilReason) {
		this.verticalAccuracyNilReason = verticalAccuracyNilReason;
	}

}