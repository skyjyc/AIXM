package com.aixm.bean;

import java.util.Date;

/**
 * Airportheliport entity. @author MyEclipse Persistence Tools
 */

public class Airportheliport implements java.io.Serializable {

	// Fields

	private String designatorValue;
	private String designatorNilReason;
	private String airportHeliportNameValue;
	private String airportHeliportNameNilReason;
	private String locationIndicatorIcaoValue;
	private String locationIndicatorIcaoNilReason;
	private String designatorIataValue;
	private String designatorIataNilReason;
	private String typeValue;
	private String typeNilReason;
	private String certifiedIcaoValue;
	private String certifiedIcaoNilReason;
	private String privateUseValue;
	private String privateUseNilReason;
	private String controlTypeValue;
	private String controlTypeNilReason;
	private String fieldElevationValue;
	private String fieldElevationUom;
	private String fieldElevationNilReason;
	private String fieldElevationAccuracyValue;
	private String fieldElevationAccuracyUom;
	private String fieldElevationAccuracyNilReason;
	private String verticalDatumValue;
	private String verticalDatumNilReason;
	private String magneticVariationValue;
	private String magneticVariationNilReason;
	private double magneticVariationAccuracyValue;
	private String magneticVariationAccuracyNilReason;
	private String dateMagneticVariationValue;
	private String dateMagneticVariationNilReason;
	private double magneticVariationChangeValue;
	private double referenceTemperatureValue;
	private String referenceTemperatureUom;
	private String referenceTemperatureNilReason;
	private String altimeterCheckLocationValue;
	private String altimeterCheckLocationNilReason;
	private String secondaryPowerSupplyValue;
	private String secondaryPowerSupplyNilReason;
	private String windDirectionIndicatorValue;
	private String windDirectionIndicatorNilReason;
	private String landingDirectionIndicatorValue;
	private String landingDirectionIndicatorNilReason;
	private String transitionAltitudeValue;
	private String transitionAltitudeUom;
	private String transitionAltitudeNilReason;
	private long transitionLevelValue;
	private String transitionLevelUom;
	private String transitionLevelNilReason;
	private double lowestTemperatureValue;
	private String lowestTemperatureUom;
	private String lowestTemperatureNilReason;
	private String abandonedValue;
	private String abandonedNilReason;
	private Date certificationDateValueDatetime;
	private Integer certificationDateValueTimezone;
	private Integer certificationDateValueYear;
	private Integer airportheliportcolValueYear;
	private Integer certificationDateValueMonth;
	private Integer certificationDateValueDate;
	private Integer certificationDateValueHour;
	private Integer certificationDateValueMinute;
	private Integer certificationDateValueSecond;
	private Integer certificationDateValueMillisecond;
	private String certificationDateNilReason;
	private Date certificationExpirationDateValueDatetime;
	private String certificationExpirationDateNilReason;

	// Constructors

	/** default constructor */
	public Airportheliport() {
	}

	/** minimal constructor */
	public Airportheliport(String designatorValue) {
		this.designatorValue = designatorValue;
	}

	/** full constructor */
	public Airportheliport(String designatorValue, String designatorNilReason, String airportHeliportNameValue,
			String airportHeliportNameNilReason, String locationIndicatorIcaoValue,
			String locationIndicatorIcaoNilReason, String designatorIataValue, String designatorIataNilReason,
			String typeValue, String typeNilReason, String certifiedIcaoValue, String certifiedIcaoNilReason,
			String privateUseValue, String privateUseNilReason, String controlTypeValue, String controlTypeNilReason,
			String fieldElevationValue, String fieldElevationUom, String fieldElevationNilReason,
			String fieldElevationAccuracyValue, String fieldElevationAccuracyUom,
			String fieldElevationAccuracyNilReason, String verticalDatumValue, String verticalDatumNilReason,
			String magneticVariationValue, String magneticVariationNilReason, double magneticVariationAccuracyValue,
			String magneticVariationAccuracyNilReason, String dateMagneticVariationValue,
			String dateMagneticVariationNilReason, double magneticVariationChangeValue,
			double referenceTemperatureValue, String referenceTemperatureUom, String referenceTemperatureNilReason,
			String altimeterCheckLocationValue, String altimeterCheckLocationNilReason,
			String secondaryPowerSupplyValue, String secondaryPowerSupplyNilReason, String windDirectionIndicatorValue,
			String windDirectionIndicatorNilReason, String landingDirectionIndicatorValue,
			String landingDirectionIndicatorNilReason, String transitionAltitudeValue, String transitionAltitudeUom,
			String transitionAltitudeNilReason, long transitionLevelValue, String transitionLevelUom,
			String transitionLevelNilReason, double lowestTemperatureValue, String lowestTemperatureUom,
			String lowestTemperatureNilReason, String abandonedValue, String abandonedNilReason,
			Date certificationDateValueDatetime, Integer certificationDateValueTimezone,
			Integer certificationDateValueYear, Integer airportheliportcolValueYear,
			Integer certificationDateValueMonth, Integer certificationDateValueDate, Integer certificationDateValueHour,
			Integer certificationDateValueMinute, Integer certificationDateValueSecond,
			Integer certificationDateValueMillisecond, String certificationDateNilReason,
			Date certificationExpirationDateValueDatetime, String certificationExpirationDateNilReason) {
		this.designatorValue = designatorValue;
		this.designatorNilReason = designatorNilReason;
		this.airportHeliportNameValue = airportHeliportNameValue;
		this.airportHeliportNameNilReason = airportHeliportNameNilReason;
		this.locationIndicatorIcaoValue = locationIndicatorIcaoValue;
		this.locationIndicatorIcaoNilReason = locationIndicatorIcaoNilReason;
		this.designatorIataValue = designatorIataValue;
		this.designatorIataNilReason = designatorIataNilReason;
		this.typeValue = typeValue;
		this.typeNilReason = typeNilReason;
		this.certifiedIcaoValue = certifiedIcaoValue;
		this.certifiedIcaoNilReason = certifiedIcaoNilReason;
		this.privateUseValue = privateUseValue;
		this.privateUseNilReason = privateUseNilReason;
		this.controlTypeValue = controlTypeValue;
		this.controlTypeNilReason = controlTypeNilReason;
		this.fieldElevationValue = fieldElevationValue;
		this.fieldElevationUom = fieldElevationUom;
		this.fieldElevationNilReason = fieldElevationNilReason;
		this.fieldElevationAccuracyValue = fieldElevationAccuracyValue;
		this.fieldElevationAccuracyUom = fieldElevationAccuracyUom;
		this.fieldElevationAccuracyNilReason = fieldElevationAccuracyNilReason;
		this.verticalDatumValue = verticalDatumValue;
		this.verticalDatumNilReason = verticalDatumNilReason;
		this.magneticVariationValue = magneticVariationValue;
		this.magneticVariationNilReason = magneticVariationNilReason;
		this.magneticVariationAccuracyValue = magneticVariationAccuracyValue;
		this.magneticVariationAccuracyNilReason = magneticVariationAccuracyNilReason;
		this.dateMagneticVariationValue = dateMagneticVariationValue;
		this.dateMagneticVariationNilReason = dateMagneticVariationNilReason;
		this.magneticVariationChangeValue = magneticVariationChangeValue;
		this.referenceTemperatureValue = referenceTemperatureValue;
		this.referenceTemperatureUom = referenceTemperatureUom;
		this.referenceTemperatureNilReason = referenceTemperatureNilReason;
		this.altimeterCheckLocationValue = altimeterCheckLocationValue;
		this.altimeterCheckLocationNilReason = altimeterCheckLocationNilReason;
		this.secondaryPowerSupplyValue = secondaryPowerSupplyValue;
		this.secondaryPowerSupplyNilReason = secondaryPowerSupplyNilReason;
		this.windDirectionIndicatorValue = windDirectionIndicatorValue;
		this.windDirectionIndicatorNilReason = windDirectionIndicatorNilReason;
		this.landingDirectionIndicatorValue = landingDirectionIndicatorValue;
		this.landingDirectionIndicatorNilReason = landingDirectionIndicatorNilReason;
		this.transitionAltitudeValue = transitionAltitudeValue;
		this.transitionAltitudeUom = transitionAltitudeUom;
		this.transitionAltitudeNilReason = transitionAltitudeNilReason;
		this.transitionLevelValue = transitionLevelValue;
		this.transitionLevelUom = transitionLevelUom;
		this.transitionLevelNilReason = transitionLevelNilReason;
		this.lowestTemperatureValue = lowestTemperatureValue;
		this.lowestTemperatureUom = lowestTemperatureUom;
		this.lowestTemperatureNilReason = lowestTemperatureNilReason;
		this.abandonedValue = abandonedValue;
		this.abandonedNilReason = abandonedNilReason;
		this.certificationDateValueDatetime = certificationDateValueDatetime;
		this.certificationDateValueTimezone = certificationDateValueTimezone;
		this.certificationDateValueYear = certificationDateValueYear;
		this.airportheliportcolValueYear = airportheliportcolValueYear;
		this.certificationDateValueMonth = certificationDateValueMonth;
		this.certificationDateValueDate = certificationDateValueDate;
		this.certificationDateValueHour = certificationDateValueHour;
		this.certificationDateValueMinute = certificationDateValueMinute;
		this.certificationDateValueSecond = certificationDateValueSecond;
		this.certificationDateValueMillisecond = certificationDateValueMillisecond;
		this.certificationDateNilReason = certificationDateNilReason;
		this.certificationExpirationDateValueDatetime = certificationExpirationDateValueDatetime;
		this.certificationExpirationDateNilReason = certificationExpirationDateNilReason;
	}

	// Property accessors

	public String getDesignatorValue() {
		return this.designatorValue;
	}

	public void setDesignatorValue(String designatorValue) {
		this.designatorValue = designatorValue;
	}

	public String getDesignatorNilReason() {
		return this.designatorNilReason;
	}

	public void setDesignatorNilReason(String designatorNilReason) {
		this.designatorNilReason = designatorNilReason;
	}

	public String getAirportHeliportNameValue() {
		return this.airportHeliportNameValue;
	}

	public void setAirportHeliportNameValue(String airportHeliportNameValue) {
		this.airportHeliportNameValue = airportHeliportNameValue;
	}

	public String getAirportHeliportNameNilReason() {
		return this.airportHeliportNameNilReason;
	}

	public void setAirportHeliportNameNilReason(String airportHeliportNameNilReason) {
		this.airportHeliportNameNilReason = airportHeliportNameNilReason;
	}

	public String getLocationIndicatorIcaoValue() {
		return this.locationIndicatorIcaoValue;
	}

	public void setLocationIndicatorIcaoValue(String locationIndicatorIcaoValue) {
		this.locationIndicatorIcaoValue = locationIndicatorIcaoValue;
	}

	public String getLocationIndicatorIcaoNilReason() {
		return this.locationIndicatorIcaoNilReason;
	}

	public void setLocationIndicatorIcaoNilReason(String locationIndicatorIcaoNilReason) {
		this.locationIndicatorIcaoNilReason = locationIndicatorIcaoNilReason;
	}

	public String getDesignatorIataValue() {
		return this.designatorIataValue;
	}

	public void setDesignatorIataValue(String designatorIataValue) {
		this.designatorIataValue = designatorIataValue;
	}

	public String getDesignatorIataNilReason() {
		return this.designatorIataNilReason;
	}

	public void setDesignatorIataNilReason(String designatorIataNilReason) {
		this.designatorIataNilReason = designatorIataNilReason;
	}

	public String getTypeValue() {
		return this.typeValue;
	}

	public void setTypeValue(String typeValue) {
		this.typeValue = typeValue;
	}

	public String getTypeNilReason() {
		return this.typeNilReason;
	}

	public void setTypeNilReason(String typeNilReason) {
		this.typeNilReason = typeNilReason;
	}

	public String getCertifiedIcaoValue() {
		return this.certifiedIcaoValue;
	}

	public void setCertifiedIcaoValue(String certifiedIcaoValue) {
		this.certifiedIcaoValue = certifiedIcaoValue;
	}

	public String getCertifiedIcaoNilReason() {
		return this.certifiedIcaoNilReason;
	}

	public void setCertifiedIcaoNilReason(String certifiedIcaoNilReason) {
		this.certifiedIcaoNilReason = certifiedIcaoNilReason;
	}

	public String getPrivateUseValue() {
		return this.privateUseValue;
	}

	public void setPrivateUseValue(String privateUseValue) {
		this.privateUseValue = privateUseValue;
	}

	public String getPrivateUseNilReason() {
		return this.privateUseNilReason;
	}

	public void setPrivateUseNilReason(String privateUseNilReason) {
		this.privateUseNilReason = privateUseNilReason;
	}

	public String getControlTypeValue() {
		return this.controlTypeValue;
	}

	public void setControlTypeValue(String controlTypeValue) {
		this.controlTypeValue = controlTypeValue;
	}

	public String getControlTypeNilReason() {
		return this.controlTypeNilReason;
	}

	public void setControlTypeNilReason(String controlTypeNilReason) {
		this.controlTypeNilReason = controlTypeNilReason;
	}

	public String getFieldElevationValue() {
		return this.fieldElevationValue;
	}

	public void setFieldElevationValue(String fieldElevationValue) {
		this.fieldElevationValue = fieldElevationValue;
	}

	public String getFieldElevationUom() {
		return this.fieldElevationUom;
	}

	public void setFieldElevationUom(String fieldElevationUom) {
		this.fieldElevationUom = fieldElevationUom;
	}

	public String getFieldElevationNilReason() {
		return this.fieldElevationNilReason;
	}

	public void setFieldElevationNilReason(String fieldElevationNilReason) {
		this.fieldElevationNilReason = fieldElevationNilReason;
	}

	public String getFieldElevationAccuracyValue() {
		return this.fieldElevationAccuracyValue;
	}

	public void setFieldElevationAccuracyValue(String fieldElevationAccuracyValue) {
		this.fieldElevationAccuracyValue = fieldElevationAccuracyValue;
	}

	public String getFieldElevationAccuracyUom() {
		return this.fieldElevationAccuracyUom;
	}

	public void setFieldElevationAccuracyUom(String fieldElevationAccuracyUom) {
		this.fieldElevationAccuracyUom = fieldElevationAccuracyUom;
	}

	public String getFieldElevationAccuracyNilReason() {
		return this.fieldElevationAccuracyNilReason;
	}

	public void setFieldElevationAccuracyNilReason(String fieldElevationAccuracyNilReason) {
		this.fieldElevationAccuracyNilReason = fieldElevationAccuracyNilReason;
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

	public String getMagneticVariationValue() {
		return this.magneticVariationValue;
	}

	public void setMagneticVariationValue(String magneticVariationValue) {
		this.magneticVariationValue = magneticVariationValue;
	}

	public String getMagneticVariationNilReason() {
		return this.magneticVariationNilReason;
	}

	public void setMagneticVariationNilReason(String magneticVariationNilReason) {
		this.magneticVariationNilReason = magneticVariationNilReason;
	}

	public double getMagneticVariationAccuracyValue() {
		return this.magneticVariationAccuracyValue;
	}

	public void setMagneticVariationAccuracyValue(double magneticVariationAccuracyValue) {
		this.magneticVariationAccuracyValue = magneticVariationAccuracyValue;
	}

	public String getMagneticVariationAccuracyNilReason() {
		return this.magneticVariationAccuracyNilReason;
	}

	public void setMagneticVariationAccuracyNilReason(String magneticVariationAccuracyNilReason) {
		this.magneticVariationAccuracyNilReason = magneticVariationAccuracyNilReason;
	}

	public String getDateMagneticVariationValue() {
		return this.dateMagneticVariationValue;
	}

	public void setDateMagneticVariationValue(String dateMagneticVariationValue) {
		this.dateMagneticVariationValue = dateMagneticVariationValue;
	}

	public String getDateMagneticVariationNilReason() {
		return this.dateMagneticVariationNilReason;
	}

	public void setDateMagneticVariationNilReason(String dateMagneticVariationNilReason) {
		this.dateMagneticVariationNilReason = dateMagneticVariationNilReason;
	}

	public double getMagneticVariationChangeValue() {
		return this.magneticVariationChangeValue;
	}

	public void setMagneticVariationChangeValue(double magneticVariationChangeValue) {
		this.magneticVariationChangeValue = magneticVariationChangeValue;
	}

	public double getReferenceTemperatureValue() {
		return this.referenceTemperatureValue;
	}

	public void setReferenceTemperatureValue(double referenceTemperatureValue) {
		this.referenceTemperatureValue = referenceTemperatureValue;
	}

	public String getReferenceTemperatureUom() {
		return this.referenceTemperatureUom;
	}

	public void setReferenceTemperatureUom(String referenceTemperatureUom) {
		this.referenceTemperatureUom = referenceTemperatureUom;
	}

	public String getReferenceTemperatureNilReason() {
		return this.referenceTemperatureNilReason;
	}

	public void setReferenceTemperatureNilReason(String referenceTemperatureNilReason) {
		this.referenceTemperatureNilReason = referenceTemperatureNilReason;
	}

	public String getAltimeterCheckLocationValue() {
		return this.altimeterCheckLocationValue;
	}

	public void setAltimeterCheckLocationValue(String altimeterCheckLocationValue) {
		this.altimeterCheckLocationValue = altimeterCheckLocationValue;
	}

	public String getAltimeterCheckLocationNilReason() {
		return this.altimeterCheckLocationNilReason;
	}

	public void setAltimeterCheckLocationNilReason(String altimeterCheckLocationNilReason) {
		this.altimeterCheckLocationNilReason = altimeterCheckLocationNilReason;
	}

	public String getSecondaryPowerSupplyValue() {
		return this.secondaryPowerSupplyValue;
	}

	public void setSecondaryPowerSupplyValue(String secondaryPowerSupplyValue) {
		this.secondaryPowerSupplyValue = secondaryPowerSupplyValue;
	}

	public String getSecondaryPowerSupplyNilReason() {
		return this.secondaryPowerSupplyNilReason;
	}

	public void setSecondaryPowerSupplyNilReason(String secondaryPowerSupplyNilReason) {
		this.secondaryPowerSupplyNilReason = secondaryPowerSupplyNilReason;
	}

	public String getWindDirectionIndicatorValue() {
		return this.windDirectionIndicatorValue;
	}

	public void setWindDirectionIndicatorValue(String windDirectionIndicatorValue) {
		this.windDirectionIndicatorValue = windDirectionIndicatorValue;
	}

	public String getWindDirectionIndicatorNilReason() {
		return this.windDirectionIndicatorNilReason;
	}

	public void setWindDirectionIndicatorNilReason(String windDirectionIndicatorNilReason) {
		this.windDirectionIndicatorNilReason = windDirectionIndicatorNilReason;
	}

	public String getLandingDirectionIndicatorValue() {
		return this.landingDirectionIndicatorValue;
	}

	public void setLandingDirectionIndicatorValue(String landingDirectionIndicatorValue) {
		this.landingDirectionIndicatorValue = landingDirectionIndicatorValue;
	}

	public String getLandingDirectionIndicatorNilReason() {
		return this.landingDirectionIndicatorNilReason;
	}

	public void setLandingDirectionIndicatorNilReason(String landingDirectionIndicatorNilReason) {
		this.landingDirectionIndicatorNilReason = landingDirectionIndicatorNilReason;
	}

	public String getTransitionAltitudeValue() {
		return this.transitionAltitudeValue;
	}

	public void setTransitionAltitudeValue(String transitionAltitudeValue) {
		this.transitionAltitudeValue = transitionAltitudeValue;
	}

	public String getTransitionAltitudeUom() {
		return this.transitionAltitudeUom;
	}

	public void setTransitionAltitudeUom(String transitionAltitudeUom) {
		this.transitionAltitudeUom = transitionAltitudeUom;
	}

	public String getTransitionAltitudeNilReason() {
		return this.transitionAltitudeNilReason;
	}

	public void setTransitionAltitudeNilReason(String transitionAltitudeNilReason) {
		this.transitionAltitudeNilReason = transitionAltitudeNilReason;
	}

	public long getTransitionLevelValue() {
		return this.transitionLevelValue;
	}

	public void setTransitionLevelValue(long transitionLevelValue) {
		this.transitionLevelValue = transitionLevelValue;
	}

	public String getTransitionLevelUom() {
		return this.transitionLevelUom;
	}

	public void setTransitionLevelUom(String transitionLevelUom) {
		this.transitionLevelUom = transitionLevelUom;
	}

	public String getTransitionLevelNilReason() {
		return this.transitionLevelNilReason;
	}

	public void setTransitionLevelNilReason(String transitionLevelNilReason) {
		this.transitionLevelNilReason = transitionLevelNilReason;
	}

	public double getLowestTemperatureValue() {
		return this.lowestTemperatureValue;
	}

	public void setLowestTemperatureValue(double lowestTemperatureValue) {
		this.lowestTemperatureValue = lowestTemperatureValue;
	}

	public String getLowestTemperatureUom() {
		return this.lowestTemperatureUom;
	}

	public void setLowestTemperatureUom(String lowestTemperatureUom) {
		this.lowestTemperatureUom = lowestTemperatureUom;
	}

	public String getLowestTemperatureNilReason() {
		return this.lowestTemperatureNilReason;
	}

	public void setLowestTemperatureNilReason(String lowestTemperatureNilReason) {
		this.lowestTemperatureNilReason = lowestTemperatureNilReason;
	}

	public String getAbandonedValue() {
		return this.abandonedValue;
	}

	public void setAbandonedValue(String abandonedValue) {
		this.abandonedValue = abandonedValue;
	}

	public String getAbandonedNilReason() {
		return this.abandonedNilReason;
	}

	public void setAbandonedNilReason(String abandonedNilReason) {
		this.abandonedNilReason = abandonedNilReason;
	}

	public Date getCertificationDateValueDatetime() {
		return this.certificationDateValueDatetime;
	}

	public void setCertificationDateValueDatetime(Date certificationDateValueDatetime) {
		this.certificationDateValueDatetime = certificationDateValueDatetime;
	}

	public Integer getCertificationDateValueTimezone() {
		return this.certificationDateValueTimezone;
	}

	public void setCertificationDateValueTimezone(Integer certificationDateValueTimezone) {
		this.certificationDateValueTimezone = certificationDateValueTimezone;
	}

	public Integer getCertificationDateValueYear() {
		return this.certificationDateValueYear;
	}

	public void setCertificationDateValueYear(Integer certificationDateValueYear) {
		this.certificationDateValueYear = certificationDateValueYear;
	}

	public Integer getAirportheliportcolValueYear() {
		return this.airportheliportcolValueYear;
	}

	public void setAirportheliportcolValueYear(Integer airportheliportcolValueYear) {
		this.airportheliportcolValueYear = airportheliportcolValueYear;
	}

	public Integer getCertificationDateValueMonth() {
		return this.certificationDateValueMonth;
	}

	public void setCertificationDateValueMonth(Integer certificationDateValueMonth) {
		this.certificationDateValueMonth = certificationDateValueMonth;
	}

	public Integer getCertificationDateValueDate() {
		return this.certificationDateValueDate;
	}

	public void setCertificationDateValueDate(Integer certificationDateValueDate) {
		this.certificationDateValueDate = certificationDateValueDate;
	}

	public Integer getCertificationDateValueHour() {
		return this.certificationDateValueHour;
	}

	public void setCertificationDateValueHour(Integer certificationDateValueHour) {
		this.certificationDateValueHour = certificationDateValueHour;
	}

	public Integer getCertificationDateValueMinute() {
		return this.certificationDateValueMinute;
	}

	public void setCertificationDateValueMinute(Integer certificationDateValueMinute) {
		this.certificationDateValueMinute = certificationDateValueMinute;
	}

	public Integer getCertificationDateValueSecond() {
		return this.certificationDateValueSecond;
	}

	public void setCertificationDateValueSecond(Integer certificationDateValueSecond) {
		this.certificationDateValueSecond = certificationDateValueSecond;
	}

	public Integer getCertificationDateValueMillisecond() {
		return this.certificationDateValueMillisecond;
	}

	public void setCertificationDateValueMillisecond(Integer certificationDateValueMillisecond) {
		this.certificationDateValueMillisecond = certificationDateValueMillisecond;
	}

	public String getCertificationDateNilReason() {
		return this.certificationDateNilReason;
	}

	public void setCertificationDateNilReason(String certificationDateNilReason) {
		this.certificationDateNilReason = certificationDateNilReason;
	}

	public Date getCertificationExpirationDateValueDatetime() {
		return this.certificationExpirationDateValueDatetime;
	}

	public void setCertificationExpirationDateValueDatetime(Date certificationExpirationDateValueDatetime) {
		this.certificationExpirationDateValueDatetime = certificationExpirationDateValueDatetime;
	}

	public String getCertificationExpirationDateNilReason() {
		return this.certificationExpirationDateNilReason;
	}

	public void setCertificationExpirationDateNilReason(String certificationExpirationDateNilReason) {
		this.certificationExpirationDateNilReason = certificationExpirationDateNilReason;
	}

}