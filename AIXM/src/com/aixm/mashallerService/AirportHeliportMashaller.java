package com.aixm.mashallerService;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import com.aixm.bean.*;
import com.cfar.swim.aixm.bind.AixmMarshaller;

import aero.aixm.*;
public class AirportHeliportMashaller {
	public String AirporHeliportMashallerMethod(String designator){
	String outputstring=null;
	//生成Type类
	
	//根据DAO,查找数据库返回各种实体类
	AirportheliportDAO airportheliportDAO=new AirportheliportDAO();
	Airportheliport airportheliport=airportheliportDAO.findById(designator);
			
	//从ObjectFactory创建AirportHeliportTimeSliceType相关类
	ObjectFactory ofa=new ObjectFactory();
	AirportHeliportTimeSliceType airportHeliportTimeSliceType=ofa.createAirportHeliportTimeSliceType();
	//类内属性置值
	//JAXBElement<CodeAirportHeliportDesignatorType> designator
	CodeAirportHeliportDesignatorType codeAirportHeliportDesignatorType=ofa.createCodeAirportHeliportDesignatorType();
	codeAirportHeliportDesignatorType.setValue(airportheliport.getDesignatorValue());
	codeAirportHeliportDesignatorType.setNilReason(airportheliport.getDesignatorNilReason());
	JAXBElement<CodeAirportHeliportDesignatorType> jaxbElement_designator=ofa.createAirportHeliportTimeSliceTypeDesignator(codeAirportHeliportDesignatorType);
	airportHeliportTimeSliceType.setDesignator(jaxbElement_designator);
	
	//JAXBElement<TextNameType> airportHeliportName
	TextNameType textNameType=ofa.createTextNameType();
	textNameType.setValue(airportheliport.getAirportHeliportNameValue());
	textNameType.setNilReason(airportheliport.getAirportHeliportNameNilReason());
	JAXBElement<TextNameType> jaxbElment_airportHeliportName=ofa.createAirportHeliportTimeSliceTypeName(textNameType);
	airportHeliportTimeSliceType.setAirportHeliportName(jaxbElment_airportHeliportName);
	
	//JAXBElement<CodeICAOType> locationIndicatorICAO
	CodeICAOType codeICAOType= new CodeICAOType();
	codeICAOType.setValue(airportheliport.getLocationIndicatorIcaoValue());
	codeICAOType.setNilReason(airportheliport.getLocationIndicatorIcaoNilReason());
	JAXBElement<CodeICAOType> jaxbElment_locationIndicatorICAO=ofa.createAirportHeliportTimeSliceTypeLocationIndicatorICAO(codeICAOType);
	airportHeliportTimeSliceType.setLocationIndicatorICAO(jaxbElment_locationIndicatorICAO);

	//JAXBElement<CodeIATAType> designatorIATA
	CodeIATAType codeIATAType=new CodeIATAType();
	codeIATAType.setValue(airportheliport.getDesignatorIataValue());
	codeIATAType.setNilReason(airportheliport.getDesignatorIataNilReason());
	JAXBElement<CodeIATAType> jaxbElement_designatorIATA=ofa.createAirportHeliportTimeSliceTypeDesignatorIATA(codeIATAType);
	airportHeliportTimeSliceType.setDesignatorIATA(jaxbElement_designatorIATA);
	
	//JAXBElement<CodeAirportHeliportType> type
	CodeAirportHeliportType codeAirportHeliportType=new CodeAirportHeliportType();
	codeAirportHeliportType.setValue(airportheliport.getTypeValue());
	codeAirportHeliportType.setNilReason(airportheliport.getTypeNilReason());
	JAXBElement<CodeAirportHeliportType> jaxbElement_type=ofa.createAirportHeliportTimeSliceTypeType(codeAirportHeliportType);
	airportHeliportTimeSliceType.setType(jaxbElement_type);
	
	//JAXBElement<CodeYesNoType> certifiedICAO
	CodeYesNoType codeYesNoType=new CodeYesNoType();
	codeYesNoType.setValue(airportheliport.getCertifiedIcaoValue());
	codeYesNoType.setNilReason(airportheliport.getCertifiedIcaoNilReason());
	JAXBElement<CodeYesNoType> jaxbElement_certifiedICAO=ofa.createAirportHeliportTimeSliceTypeCertifiedICAO(codeYesNoType);
	airportHeliportTimeSliceType.setCertifiedICAO(jaxbElement_certifiedICAO);
	
	//JAXBElement<CodeYesNoType> privateUse
	CodeYesNoType codeYesNoType1=new CodeYesNoType();
	codeYesNoType1.setValue(airportheliport.getPrivateUseValue());
	codeYesNoType1.setNilReason(airportheliport.getPrivateUseNilReason());
	JAXBElement<CodeYesNoType> jaxbElement_privateUse=ofa.createAirportHeliportTimeSliceTypePrivateUse(codeYesNoType1);
	airportHeliportTimeSliceType.setPrivateUse(jaxbElement_privateUse);
	
	//JAXBElement<CodeMilitaryOperationsType> controlType
	CodeMilitaryOperationsType codeMilitaryOperationsType =new CodeMilitaryOperationsType();
	codeMilitaryOperationsType.setValue(airportheliport.getControlTypeValue());
	codeMilitaryOperationsType.setNilReason(airportheliport.getControlTypeNilReason());
	JAXBElement<CodeMilitaryOperationsType> jaxbElement_controlType=ofa.createAirportHeliportTimeSliceTypeControlType(codeMilitaryOperationsType);
	airportHeliportTimeSliceType.setControlType(jaxbElement_controlType);
	
	//JAXBElement<ValDistanceVerticalType> fieldElevation
	ValDistanceVerticalType valDistanceVerticalType=new ValDistanceVerticalType();
	valDistanceVerticalType.setValue(airportheliport.getFieldElevationValue());
	valDistanceVerticalType.setUom(airportheliport.getFieldElevationUom());
	valDistanceVerticalType.setNilReason(airportheliport.getFieldElevationNilReason());
	JAXBElement<ValDistanceVerticalType> jaxbElement_fieldElevation=ofa.createAirportHeliportTimeSliceTypeFieldElevation(valDistanceVerticalType);
	airportHeliportTimeSliceType.setFieldElevation(jaxbElement_fieldElevation);
	
	//JAXBElement<ValDistanceVerticalType> fieldElevationAccuracy
	ValDistanceVerticalType valDistanceVerticalType1=ofa.createValDistanceVerticalType();
	valDistanceVerticalType1.setValue(airportheliport.getFieldElevationAccuracyValue());
	valDistanceVerticalType1.setUom(airportheliport.getFieldElevationAccuracyUom());
	valDistanceVerticalType1.setNilReason(airportheliport.getFieldElevationAccuracyNilReason());
	
	//JAXBElement<CodeVerticalDatumType> verticalDatum
	CodeVerticalDatumType codeVerticalDatumType=ofa.createCodeVerticalDatumType();
	codeVerticalDatumType.setValue(airportheliport.getVerticalDatumValue());
	codeVerticalDatumType.setNilReason(airportheliport.getVerticalDatumNilReason());
	JAXBElement<CodeVerticalDatumType> jaxb_verticalDatum=ofa.createAirportHeliportTimeSliceTypeVerticalDatum(codeVerticalDatumType);
	airportHeliportTimeSliceType.setVerticalDatum(jaxb_verticalDatum);
	
	//JAXBElement<ValMagneticVariationType> magneticVariation
	ValMagneticVariationType valMagneticVariationType=ofa.createValMagneticVariationType();
	//做一步string到bigdecimal的转换
	BigDecimal bigDecimal=new BigDecimal(airportheliport.getMagneticVariationValue());
	
	valMagneticVariationType.setValue(bigDecimal);
	valMagneticVariationType.setNilReason(airportheliport.getMagneticVariationNilReason());
	JAXBElement<ValMagneticVariationType> jaxb_magneticVariation=ofa.createAirportHeliportTimeSliceTypeMagneticVariation(valMagneticVariationType);
	airportHeliportTimeSliceType.setMagneticVariation(jaxb_magneticVariation);
	
	//JAXBElement<ValAngleType> magneticVariationAccuracy
	ValAngleType valAngleType=ofa.createValAngleType();
	BigDecimal bigDecimal1=new BigDecimal(airportheliport.getMagneticVariationAccuracyValue());
	valAngleType.setValue(bigDecimal1);
	valAngleType.setNilReason(airportheliport.getMagneticVariationAccuracyNilReason());
	JAXBElement<ValAngleType> jaxb_magneticVariationAccuracy=ofa.createAirportHeliportTimeSliceTypeMagneticVariationAccuracy(valAngleType);
	airportHeliportTimeSliceType.setMagneticVariationAccuracy(jaxb_magneticVariationAccuracy);
    
	//JAXBElement<DateYearType> dateMagneticVariation
	DateYearType dateYearType=new DateYearType();
	dateYearType.setValue(airportheliport.getDateMagneticVariationValue());
	dateYearType.setNilReason(airportheliport.getMagneticVariationNilReason());
	JAXBElement<DateYearType> jaxb_dateMagneticVariation=ofa.createAirportHeliportTimeSliceTypeDateMagneticVariation(dateYearType);
	airportHeliportTimeSliceType.setDateMagneticVariation(jaxb_dateMagneticVariation);
	
	//JAXBElement<ValMagneticVariationChangeType> magneticVariationChange
	ValMagneticVariationChangeType valMagneticVariationChangeType=ofa.createValMagneticVariationChangeType();
	BigDecimal bigDecimal2=new BigDecimal(airportheliport.getMagneticVariationChangeValue());
	valMagneticVariationChangeType.setValue(bigDecimal2);
	valMagneticVariationChangeType.setNilReason("doesn't exist");
	JAXBElement<ValMagneticVariationChangeType> jaxb_magneticVariationChange=ofa.createAirportHeliportTimeSliceTypeMagneticVariationChange(valMagneticVariationChangeType);
	airportHeliportTimeSliceType.setMagneticVariationChange(jaxb_magneticVariationChange);
	
	//JAXBElement<ValTemperatureType> referenceTemperature
	ValTemperatureType valTemperatureType=new ValTemperatureType();
	BigDecimal bigDecimal3=new BigDecimal(airportheliport.getReferenceTemperatureValue());
	valTemperatureType.setValue(bigDecimal3);
	valTemperatureType.setUom(airportheliport.getReferenceTemperatureUom());
	valTemperatureType.setNilReason(airportheliport.getReferenceTemperatureNilReason());
	JAXBElement<ValTemperatureType> jaxb_referenceTemperature=ofa.createAirportHeliportTimeSliceTypeLowestTemperature(valTemperatureType);
	airportHeliportTimeSliceType.setReferenceTemperature(jaxb_referenceTemperature);
	
	//JAXBElement<CodeYesNoType> altimeterCheckLocation
	CodeYesNoType codeYesNoType2=ofa.createCodeYesNoType();
	codeYesNoType2.setValue(airportheliport.getAltimeterCheckLocationValue());
	codeYesNoType2.setNilReason(airportheliport.getAltimeterCheckLocationNilReason());
	JAXBElement<CodeYesNoType> jaxb_altimeterCheckLocation=ofa.createAerialRefuellingPointTypeFlyOver(codeYesNoType2);
	airportHeliportTimeSliceType.setAltimeterCheckLocation(jaxb_altimeterCheckLocation);
	
	//JAXBElement<CodeYesNoType> secondaryPowerSupply
	CodeYesNoType codeYesNoType3=ofa.createCodeYesNoType();
	codeYesNoType3.setValue(airportheliport.getSecondaryPowerSupplyValue());
	codeYesNoType.setNilReason(airportheliport.getSecondaryPowerSupplyNilReason());
	JAXBElement<CodeYesNoType> jaxb_secondaryPowerSupply=ofa.createAerialRefuellingPointTypeFlyOver(codeYesNoType3);
	airportHeliportTimeSliceType.setSecondaryPowerSupply(jaxb_secondaryPowerSupply);
	//JAXBElement<CodeYesNoType> windDirectionIndicator
	CodeYesNoType codeYesNoType4=ofa.createCodeYesNoType();
	codeYesNoType4.setValue(airportheliport.getWindDirectionIndicatorValue());
	codeYesNoType.setNilReason(airportheliport.getWindDirectionIndicatorNilReason());
	JAXBElement<CodeYesNoType> jaxb_windDirectionIndicator=ofa.createAirportHeliportTimeSliceTypeWindDirectionIndicator(codeYesNoType4);
	airportHeliportTimeSliceType.setWindDirectionIndicator(jaxb_windDirectionIndicator);
	
	//JAXBElement<CodeYesNoType> landingDirectionIndicator
	CodeYesNoType codeYesNoType5=ofa.createCodeYesNoType();
	codeYesNoType5.setValue(airportheliport.getLandingDirectionIndicatorValue());
	codeYesNoType5.setNilReason(airportheliport.getLandingDirectionIndicatorNilReason());
	JAXBElement<CodeYesNoType> jaxb_landingDirectionIndicator=ofa.createAirportHeliportTimeSliceTypeLandingDirectionIndicator(codeYesNoType5);
	airportHeliportTimeSliceType.setLandingDirectionIndicator(jaxb_landingDirectionIndicator);
	
	//JAXBElement<ValDistanceVerticalType> transitionAltitude
	ValDistanceVerticalType valDistanceVerticalType2=ofa.createValDistanceVerticalType();
	valDistanceVerticalType2.setValue(airportheliport.getTransitionAltitudeValue());
	valDistanceVerticalType2.setUom(airportheliport.getTransitionAltitudeUom());
	valDistanceVerticalType2.setNilReason(airportheliport.getTransitionAltitudeNilReason());
	JAXBElement<ValDistanceVerticalType> jaxb_transitionAltitude=ofa.createAirportHeliportTimeSliceTypeTransitionAltitude(valDistanceVerticalType2);
	airportHeliportTimeSliceType.setTransitionAltitude(jaxb_transitionAltitude);
	
	//JAXBElement<ValFLType> transitionLevel
	ValFLType valFLType=ofa.createValFLType();
	valFLType.setValue(airportheliport.getTransitionLevelValue());
	valFLType.setUom(airportheliport.getTransitionLevelUom());
	valFLType.setNilReason(airportheliport.getTransitionLevelNilReason());
	JAXBElement<ValFLType> jaxb_transitionLevel=ofa.createAirportHeliportTimeSliceTypeTransitionLevel(valFLType);
	airportHeliportTimeSliceType.setTransitionLevel(jaxb_transitionLevel);
	
	//JAXBElement<ValTemperatureType> lowestTemperature
	ValTemperatureType valTemperatureType1=ofa.createValTemperatureType();
	BigDecimal bigDecimal5=new BigDecimal(airportheliport.getLowestTemperatureValue());
	valTemperatureType1.setValue(bigDecimal5);
	valTemperatureType.setUom(airportheliport.getLowestTemperatureUom());
	valTemperatureType.setNilReason(airportheliport.getLowestTemperatureNilReason());
	JAXBElement<ValTemperatureType> jaxb_lowestTemperature=ofa.createAirportHeliportTimeSliceTypeLowestTemperature(valTemperatureType1);
	airportHeliportTimeSliceType.setLowestTemperature(jaxb_lowestTemperature);
	
	//JAXBElement<CodeYesNoType> abandoned
	CodeYesNoType codeYesNoType6=new CodeYesNoType();
	codeYesNoType6.setValue(airportheliport.getAbandonedValue());
	codeYesNoType6.setNilReason(airportheliport.getAbandonedNilReason());
	JAXBElement<CodeYesNoType> jaxb_abandoned=ofa.createAirportHeliportTimeSliceTypeAbandoned(codeYesNoType6);
	airportHeliportTimeSliceType.setAbandoned(jaxb_abandoned);
	
	//JAXBElement<DateType> certificationDate
	DateType dateType=ofa.createDateType();
	Date date=airportheliport.getCertificationDateValueDatetime();
	GregorianCalendar gcal =new GregorianCalendar();
	gcal.setTime(date);
	XMLGregorianCalendar xMLGregorianCalendar;
	try {
		xMLGregorianCalendar = DatatypeFactory.newInstance().newXMLGregorianCalendar(gcal);
		dateType.setValue(xMLGregorianCalendar);
	} catch (DatatypeConfigurationException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	dateType.setNilReason(airportheliport.getCertificationDateNilReason());
	JAXBElement<DateType> jaxb_certificationDate=ofa.createAirportHeliportTimeSliceTypeCertificationDate(dateType);
	airportHeliportTimeSliceType.setCertificationDate(jaxb_certificationDate);
	
	//JAXBElement<DateType> certificationExpirationDate
	DateType dateType1=ofa.createDateType();
	Date date1=airportheliport.getCertificationExpirationDateValueDatetime();
	GregorianCalendar gcal1 =new GregorianCalendar();
	gcal1.setTime(date1);
	XMLGregorianCalendar xMLGregorianCalendar1;
	try {
		xMLGregorianCalendar1 = DatatypeFactory.newInstance().newXMLGregorianCalendar(gcal1);
		dateType.setValue(xMLGregorianCalendar1);
	} catch (DatatypeConfigurationException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	dateType.setNilReason(airportheliport.getCertificationExpirationDateNilReason());
	JAXBElement<DateType> jaxb_certificationExpirationDate=ofa.createAirportHeliportTimeSliceTypeCertificationExpirationDate(dateType1);
	airportHeliportTimeSliceType.setCertificationExpirationDate(jaxb_certificationExpirationDate);
	
	//List<CityPropertyType> servedCity
	//从Servedcity表中取得内容
	ServedcityDAO servedcityDAO=new ServedcityDAO();
	Servedcity servedcity=servedcityDAO.findById(designator);
	
	//servedCity置值
	CityPropertyType cityPropertyType=ofa.createCityPropertyType();
	CityType cityType=ofa.createCityType();
	TextNameType textNameType2=ofa.createTextNameType();
	textNameType2.setValue(servedcity.getCityNameValue());
	textNameType2.setNilReason(servedcity.getCityNameNilReason());
	JAXBElement<TextNameType> jaxb_servedCity=ofa.createCityTypeName(textNameType2);
	cityType.setCityName(jaxb_servedCity);
	cityPropertyType.setCity(cityType);
	airportHeliportTimeSliceType.getServedCity().add(cityPropertyType);
	
	//JAXBElement<AirportHeliportResponsibilityOrganisationPropertyType> responsibleOrganisation;
	//ResponsibleorganisationDAO
	ResponsibleorganisationDAO responsibleorganisationDAO=new ResponsibleorganisationDAO();
	Responsibleorganisation responsibleorganisation=responsibleorganisationDAO.findById(designator);
	
	AirportHeliportResponsibilityOrganisationPropertyType airportHeliportResponsibilityOrganisationPropertyType=ofa.createAirportHeliportResponsibilityOrganisationPropertyType();
	AirportHeliportResponsibilityOrganisationType airportHeliportResponsibilityOrganisationType=ofa.createAirportHeliportResponsibilityOrganisationType();
	OrganisationAuthorityPropertyType organisationAuthorityPropertyType=ofa.createOrganisationAuthorityPropertyType();
	
	organisationAuthorityPropertyType.setActuate(responsibleorganisation.getTheOrganisationAuthorityActuate());
	organisationAuthorityPropertyType.setArcrole(responsibleorganisation.getTheOrganisationAuthorityArcrole());
	organisationAuthorityPropertyType.setHref(responsibleorganisation.getTheOrganisationAuthorityHref());
	organisationAuthorityPropertyType.setOwns(true);
	organisationAuthorityPropertyType.setRemoteSchema(responsibleorganisation.getTheOrganisationAuthorityRemoteSchema());
	organisationAuthorityPropertyType.setRole(responsibleorganisation.getTheOrganisationAuthorityRole());
	organisationAuthorityPropertyType.setShow(responsibleorganisation.getTheOrganisationAuthorityShow());
	organisationAuthorityPropertyType.setTitle(responsibleorganisation.getTheOrganisationAuthorityTitle());
	organisationAuthorityPropertyType.setType(responsibleorganisation.getTheOrganisationAuthorityType());
	airportHeliportResponsibilityOrganisationType.setTheOrganisationAuthority(organisationAuthorityPropertyType);
	
	CodeAuthorityRoleType codeAuthorityRoleType=ofa.createCodeAuthorityRoleType();
	codeAuthorityRoleType.setValue(responsibleorganisation.getRoleValue());
	codeAuthorityRoleType.setNilReason(responsibleorganisation.getRoleNilReason());
	JAXBElement<CodeAuthorityRoleType> jaxb_role=ofa.createAirportHeliportResponsibilityOrganisationTypeRole(codeAuthorityRoleType);
	airportHeliportResponsibilityOrganisationType.setRole(jaxb_role);
	airportHeliportResponsibilityOrganisationPropertyType.setAirportHeliportResponsibilityOrganisation(airportHeliportResponsibilityOrganisationType);
	JAXBElement<AirportHeliportResponsibilityOrganisationPropertyType> jaxb_responsibleOrganisation=ofa.createAirportHeliportTimeSliceTypeResponsibleOrganisation(airportHeliportResponsibilityOrganisationPropertyType);
	
	airportHeliportTimeSliceType.setResponsibleOrganisation(jaxb_responsibleOrganisation);
	
	//JAXBElement<ElevatedPointPropertyType> arp
	ArpDAO arpDAO=new ArpDAO();
	Arp arp=arpDAO.findById(designator);
	ElevatedPointPropertyType elevatedPointPropertyType=new ElevatedPointPropertyType();
	ElevatedPointType elevatedPointType=ofa.createElevatedPointType();
		//JAXBElement<ValDistanceVerticalType> elevation;
		ValDistanceVerticalType valDistanceVerticalType3=ofa.createValDistanceVerticalType();
		valDistanceVerticalType3.setValue(arp.getElevationValue());
		valDistanceVerticalType3.setUom(arp.getElevationUom());
		valDistanceVerticalType3.setNilReason(arp.getElevationNilReason());
		JAXBElement<ValDistanceVerticalType> jaxb_elevation=ofa.createElevatedPointTypeElevation(valDistanceVerticalType3 );
		elevatedPointType.setElevation(jaxb_elevation);
		//JAXBElement<ValDistanceSignedType> geoidUndulation;
		ValDistanceSignedType valDistanceSignedType=ofa.createValDistanceSignedType();
		BigDecimal bigDecimal6=new BigDecimal(arp.getGeoidUndulationValue());
		valDistanceSignedType.setValue(bigDecimal6);
		valDistanceSignedType.setUom(arp.getGeoidUndulationUom());
		valDistanceSignedType.setNilReason(arp.getGeoidUndulationNilReason());
		JAXBElement<ValDistanceSignedType> jaxb_geoidUndulation=ofa.createElevatedPointTypeGeoidUndulation(valDistanceSignedType);
		elevatedPointType.setGeoidUndulation(jaxb_geoidUndulation);
		//JAXBElement<CodeVerticalDatumType> verticalDatum
		CodeVerticalDatumType codeVerticalDatumType1=ofa.createCodeVerticalDatumType();
		codeVerticalDatumType.setValue(arp.getVerticalDatumValue());
		codeVerticalDatumType.setNilReason(arp.getVerticalDatumValue());
		JAXBElement<CodeVerticalDatumType> jaxb_verticalDatum1=ofa.createElevatedPointTypeVerticalDatum(codeVerticalDatumType1);
		elevatedPointType.setVerticalDatum(jaxb_verticalDatum1);
		//JAXBElement<ValDistanceType> verticalAccuracy
		ValDistanceType valDistanceType=ofa.createValDistanceType();
		BigDecimal bigDecimal7=new BigDecimal(arp.getVerticalAccuracyValue());
		valDistanceType.setValue(bigDecimal7);
		valDistanceType.setUom(arp.getVerticalAccuracyUom());
		valDistanceType.setNilReason(arp.getVerticalAccuracyNilReason());
		JAXBElement<ValDistanceType> jaxb_verticalAccuracy=ofa.createElevatedPointTypeVerticalAccuracy(valDistanceType);
		elevatedPointType.setVerticalAccuracy(jaxb_verticalAccuracy);
	elevatedPointPropertyType.setElevatedPoint(elevatedPointType);
	JAXBElement<ElevatedPointPropertyType> jaxb_arp=ofa.createAirportHeliportTimeSliceTypeARP(elevatedPointPropertyType);
	airportHeliportTimeSliceType.setARP(jaxb_arp);	
	
	//JAXBElement<ElevatedSurfacePropertyType> aviationBoundary
	AviationboundaryDAO aviationboundaryDAO=new AviationboundaryDAO();
	Aviationboundary aviationboundary=aviationboundaryDAO.findById(designator);
	
	ElevatedSurfacePropertyType elevatedSurfacePropertyType=ofa.createElevatedSurfacePropertyType();
	ElevatedSurfaceType elevatedSurfaceType =ofa.createElevatedSurfaceType();
		//JAXBElement<ValDistanceVerticalType> elevation;
		ValDistanceVerticalType valDistanceVerticalType4=ofa.createValDistanceVerticalType();
		valDistanceVerticalType4.setValue(aviationboundary.getElevationValue());
		valDistanceVerticalType4.setUom(aviationboundary.getElevationUom());
		valDistanceVerticalType4.setNilReason(aviationboundary.getElevationNilReason());
		JAXBElement<ValDistanceVerticalType> jaxb_elevation1=ofa.createElevatedSurfaceTypeElevation(valDistanceVerticalType4);
		elevatedSurfaceType.setElevation(jaxb_elevation1);
		//JAXBElement<ValDistanceSignedType> geoidUndulation
		ValDistanceSignedType valDistanceSignedType1=new ValDistanceSignedType();
		valDistanceSignedType1.setValue(new BigDecimal(aviationboundary.getGeoidUndulationValue()));
		valDistanceSignedType1.setUom(aviationboundary.getGeoidUndulationUom());
		valDistanceSignedType1.setNilReason(aviationboundary.getGeoidUndulationNilReason());
		JAXBElement<ValDistanceSignedType> jaxb_geoidUndulation1=ofa.createElevatedSurfaceTypeGeoidUndulation(valDistanceSignedType1);
		elevatedSurfaceType.setGeoidUndulation(jaxb_geoidUndulation1);
		//JAXBElement<CodeVerticalDatumType> verticalDatum
		CodeVerticalDatumType codeVerticalDatumType2=new CodeVerticalDatumType();
		codeVerticalDatumType2.setValue(aviationboundary.getVerticalDatumValue());
		codeVerticalDatumType2.setNilReason(aviationboundary.getVerticalDatumNilReason());
		JAXBElement<CodeVerticalDatumType> jaxb_verticalDatum2=ofa.createElevatedSurfaceTypeVerticalDatum(codeVerticalDatumType2);
		elevatedSurfaceType.setVerticalDatum(jaxb_verticalDatum2);
		//JAXBElement<ValDistanceType> verticalAccuracy
		ValDistanceType valDistanceType1=new ValDistanceType();
		valDistanceType1.setValue(new BigDecimal(aviationboundary.getVerticalAccuracyValue()));
		valDistanceType1.setUom(aviationboundary.getVerticalAccuracyUom());
		valDistanceType1.setNilReason(aviationboundary.getVerticalAccuracyNilReason());
		JAXBElement<ValDistanceType> jaxb_verticalAccuracy1=ofa.createElevatedSurfaceTypeVerticalAccuracy(valDistanceType1);
		elevatedSurfaceType.setVerticalAccuracy(jaxb_verticalAccuracy1);
		 
	elevatedSurfacePropertyType.setElevatedSurface(elevatedSurfaceType);
	elevatedSurfacePropertyType.setNilReason("doesn't exits");
	JAXBElement<ElevatedSurfacePropertyType> jaxb_aviationBoundary=ofa.createAirportHeliportTimeSliceTypeAviationBoundary(elevatedSurfacePropertyType);
	airportHeliportTimeSliceType.setAviationBoundary(jaxb_aviationBoundary);
	
	//List<AltimeterSourcePropertyType> altimeterSource
	//从DAO中得到数据
	//todo
	//AltimeterSourcePropertyType AltimeterSourcePropertyType=ofa.createAltimeterSourcePropertyType();
	//TODO
	//List<ContactInformationPropertyType> contact
	ContactDAO contactDAO=new ContactDAO();
	Contact contact=contactDAO.findById(designator);
	ContactInformationPropertyType contactInformationPropertyType=ofa.createContactInformationPropertyType();
	ContactInformationType contactInformationType=ofa.createContactInformationType();
		//JAXBElement<TextNameType> contactInformationName;
		TextNameType textNameType1=ofa.createTextNameType();
		textNameType1.setValue(contact.getTitleValue());
		textNameType1.setNilReason(contact.getTitleNilReason());
		JAXBElement<TextNameType> jaxb_contactInformationName=ofa.createContactInformationTypeName(textNameType1);
		contactInformationType.setContactInformationName(jaxb_contactInformationName);
		//JAXBElement<TextNameType> title
		TextNameType textNameType3=new TextNameType();
		textNameType3.setValue(contact.getTitleValue());
		textNameType3.setNilReason(contact.getTitleNilReason());
		JAXBElement<TextNameType> jaxb_title=ofa.createContactInformationTypeTitle(textNameType3);
		contactInformationType.setTitle(jaxb_title);
	contactInformationPropertyType.setContactInformation(contactInformationType);
	airportHeliportTimeSliceType.getContact().add(contactInformationPropertyType);
	
	//List<AirportHeliportAvailabilityPropertyType> availability
	//先取得数据
	AvailabilityDAO availabilityDAO=new AvailabilityDAO();
	Availability availability=availabilityDAO.findById(designator);
	
	AirportHeliportAvailabilityPropertyType airportHeliportAvailabilityPropertyType=ofa.createAirportHeliportAvailabilityPropertyType();
	AirportHeliportAvailabilityType airportHeliportAvailabilityType=ofa.createAirportHeliportAvailabilityType();
		//JAXBElement<CodeStatusAirportType> operationalStatus
		CodeStatusAirportType codeStatusAirportType=new CodeStatusAirportType();
		codeStatusAirportType.setValue(availability.getOperationalStatusValue());
		codeStatusAirportType.setNilReason(availability.getOperationalStatusNilReason());
		JAXBElement<CodeStatusAirportType> jaxb_operationalStatus=ofa.createAirportHeliportAvailabilityTypeOperationalStatus(codeStatusAirportType);
		airportHeliportAvailabilityType.setOperationalStatus(jaxb_operationalStatus);
		//JAXBElement<CodeAirportWarningType> warning
		CodeAirportWarningType codeAirportWarningType=new CodeAirportWarningType();
		codeAirportWarningType.setValue(availability.getWarningValue());
		codeAirportWarningType.setNilReason(availability.getWarningNilReason());
		JAXBElement<CodeAirportWarningType> jaxb_warning=ofa.createAirportHeliportAvailabilityTypeWarning(codeAirportWarningType);
		airportHeliportAvailabilityType.setWarning(jaxb_warning);
		//List<AirportHeliportUsagePropertyType> usage
		AirportHeliportUsagePropertyType airportHeliportUsagePropertyType=ofa.createAirportHeliportUsagePropertyType();
		AirportHeliportUsageType airportHeliportUsageType=ofa.createAirportHeliportUsageType();
			//JAXBElement<CodeUsageLimitationType> type
			CodeUsageLimitationType codeUsageLimitationType=ofa.createCodeUsageLimitationType();
			codeUsageLimitationType.setValue(availability.getUseTypeValue());
			codeUsageLimitationType.setNilReason(availability.getUseTypeNilReason());
			JAXBElement<CodeUsageLimitationType> jaxb_type=ofa.createAirportHeliportUsageTypeType(codeUsageLimitationType);
			airportHeliportUsageType.setType(jaxb_type);
			//JAXBElement<ValDurationType> priorPermission
			ValDurationType valDurationType=ofa.createValDurationType();
			valDurationType.setValue(new BigDecimal(availability.getUsePriorPermissionValue()));
			valDurationType.setUom(availability.getUsePriorPermissionUom());
			valDurationType.setNilReason(availability.getUsePriorPermissionNilReason());
			JAXBElement<ValDurationType> jaxb_priorPermission=ofa.createAirportHeliportUsageTypePriorPermission(valDurationType);
			airportHeliportUsageType.setPriorPermission(jaxb_priorPermission);
			//JAXBElement<CodeOperationAirportHeliportType> operation
			CodeOperationAirportHeliportType codeOperationAirportHeliportType=ofa.createCodeOperationAirportHeliportType();
			codeOperationAirportHeliportType.setNilReason("缺少");
			codeOperationAirportHeliportType.setValue("缺少");
			JAXBElement<CodeOperationAirportHeliportType> jaxb_operation=ofa.createAirportHeliportUsageTypeOperation(codeOperationAirportHeliportType);
			airportHeliportUsageType.setOperation(jaxb_operation);
		airportHeliportUsagePropertyType.setAirportHeliportUsage(airportHeliportUsageType);
		airportHeliportAvailabilityType.getUsage().add(airportHeliportUsagePropertyType);
		
		airportHeliportAvailabilityPropertyType.setAirportHeliportAvailability(airportHeliportAvailabilityType);
		airportHeliportTimeSliceType.getAvailability().add(airportHeliportAvailabilityPropertyType);
		AirportHeliportTimeSlicePropertyType airportHeliportTimeSlicePropertyType=ofa.createAirportHeliportTimeSlicePropertyType();
		airportHeliportTimeSlicePropertyType.setAirportHeliportTimeSlice(airportHeliportTimeSliceType);
		AirportHeliportType airportHeliportType=ofa.createAirportHeliportType();
		airportHeliportType.getTimeSlice().add(airportHeliportTimeSlicePropertyType);
		JAXBElement<AirportHeliportType> jaxbAirportHeliportType=ofa. createAirportHeliport(airportHeliportType);
		ByteArrayOutputStream bytearrayoutputstream=new ByteArrayOutputStream();
		try {
			AixmMarshaller aixmMarshaller;
			aixmMarshaller = new AixmMarshaller();
			aixmMarshaller.marshal(jaxbAirportHeliportType, System.out);
			aixmMarshaller.marshal(jaxbAirportHeliportType, bytearrayoutputstream);
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 outputstring=bytearrayoutputstream.toString();
		 try {
				bytearrayoutputstream.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	return outputstring;
	}
}
