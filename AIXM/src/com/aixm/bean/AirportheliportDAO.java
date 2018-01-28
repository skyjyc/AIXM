package com.aixm.bean;

import java.util.Date;
import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;

/**
 * A data access object (DAO) providing persistence and search support for
 * Airportheliport entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.aixm.bean.Airportheliport
 * @author MyEclipse Persistence Tools
 */
public class AirportheliportDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory.getLog(AirportheliportDAO.class);
	// property constants
	public static final String DESIGNATOR_NIL_REASON = "designatorNilReason";
	public static final String AIRPORT_HELIPORT_NAME_VALUE = "airportHeliportNameValue";
	public static final String AIRPORT_HELIPORT_NAME_NIL_REASON = "airportHeliportNameNilReason";
	public static final String LOCATION_INDICATOR_ICAO_VALUE = "locationIndicatorIcaoValue";
	public static final String LOCATION_INDICATOR_ICAO_NIL_REASON = "locationIndicatorIcaoNilReason";
	public static final String DESIGNATOR_IATA_VALUE = "designatorIataValue";
	public static final String DESIGNATOR_IATA_NIL_REASON = "designatorIataNilReason";
	public static final String TYPE_VALUE = "typeValue";
	public static final String TYPE_NIL_REASON = "typeNilReason";
	public static final String CERTIFIED_ICAO_VALUE = "certifiedIcaoValue";
	public static final String CERTIFIED_ICAO_NIL_REASON = "certifiedIcaoNilReason";
	public static final String PRIVATE_USE_VALUE = "privateUseValue";
	public static final String PRIVATE_USE_NIL_REASON = "privateUseNilReason";
	public static final String CONTROL_TYPE_VALUE = "controlTypeValue";
	public static final String CONTROL_TYPE_NIL_REASON = "controlTypeNilReason";
	public static final String FIELD_ELEVATION_VALUE = "fieldElevationValue";
	public static final String FIELD_ELEVATION_UOM = "fieldElevationUom";
	public static final String FIELD_ELEVATION_NIL_REASON = "fieldElevationNilReason";
	public static final String FIELD_ELEVATION_ACCURACY_VALUE = "fieldElevationAccuracyValue";
	public static final String FIELD_ELEVATION_ACCURACY_UOM = "fieldElevationAccuracyUom";
	public static final String FIELD_ELEVATION_ACCURACY_NIL_REASON = "fieldElevationAccuracyNilReason";
	public static final String VERTICAL_DATUM_VALUE = "verticalDatumValue";
	public static final String VERTICAL_DATUM_NIL_REASON = "verticalDatumNilReason";
	public static final String MAGNETIC_VARIATION_VALUE = "magneticVariationValue";
	public static final String MAGNETIC_VARIATION_NIL_REASON = "magneticVariationNilReason";
	public static final String MAGNETIC_VARIATION_ACCURACY_VALUE = "magneticVariationAccuracyValue";
	public static final String MAGNETIC_VARIATION_ACCURACY_NIL_REASON = "magneticVariationAccuracyNilReason";
	public static final String DATE_MAGNETIC_VARIATION_VALUE = "dateMagneticVariationValue";
	public static final String DATE_MAGNETIC_VARIATION_NIL_REASON = "dateMagneticVariationNilReason";
	public static final String MAGNETIC_VARIATION_CHANGE_VALUE = "magneticVariationChangeValue";
	public static final String REFERENCE_TEMPERATURE_VALUE = "referenceTemperatureValue";
	public static final String REFERENCE_TEMPERATURE_UOM = "referenceTemperatureUom";
	public static final String REFERENCE_TEMPERATURE_NIL_REASON = "referenceTemperatureNilReason";
	public static final String ALTIMETER_CHECK_LOCATION_VALUE = "altimeterCheckLocationValue";
	public static final String ALTIMETER_CHECK_LOCATION_NIL_REASON = "altimeterCheckLocationNilReason";
	public static final String SECONDARY_POWER_SUPPLY_VALUE = "secondaryPowerSupplyValue";
	public static final String SECONDARY_POWER_SUPPLY_NIL_REASON = "secondaryPowerSupplyNilReason";
	public static final String WIND_DIRECTION_INDICATOR_VALUE = "windDirectionIndicatorValue";
	public static final String WIND_DIRECTION_INDICATOR_NIL_REASON = "windDirectionIndicatorNilReason";
	public static final String LANDING_DIRECTION_INDICATOR_VALUE = "landingDirectionIndicatorValue";
	public static final String LANDING_DIRECTION_INDICATOR_NIL_REASON = "landingDirectionIndicatorNilReason";
	public static final String TRANSITION_ALTITUDE_VALUE = "transitionAltitudeValue";
	public static final String TRANSITION_ALTITUDE_UOM = "transitionAltitudeUom";
	public static final String TRANSITION_ALTITUDE_NIL_REASON = "transitionAltitudeNilReason";
	public static final String TRANSITION_LEVEL_VALUE = "transitionLevelValue";
	public static final String TRANSITION_LEVEL_UOM = "transitionLevelUom";
	public static final String TRANSITION_LEVEL_NIL_REASON = "transitionLevelNilReason";
	public static final String LOWEST_TEMPERATURE_VALUE = "lowestTemperatureValue";
	public static final String LOWEST_TEMPERATURE_UOM = "lowestTemperatureUom";
	public static final String LOWEST_TEMPERATURE_NIL_REASON = "lowestTemperatureNilReason";
	public static final String ABANDONED_VALUE = "abandonedValue";
	public static final String ABANDONED_NIL_REASON = "abandonedNilReason";
	public static final String CERTIFICATION_DATE_VALUE_TIMEZONE = "certificationDateValueTimezone";
	public static final String CERTIFICATION_DATE_VALUE_YEAR = "certificationDateValueYear";
	public static final String AIRPORTHELIPORTCOL_VALUE_YEAR = "airportheliportcolValueYear";
	public static final String CERTIFICATION_DATE_VALUE_MONTH = "certificationDateValueMonth";
	public static final String CERTIFICATION_DATE_VALUE_DATE = "certificationDateValueDate";
	public static final String CERTIFICATION_DATE_VALUE_HOUR = "certificationDateValueHour";
	public static final String CERTIFICATION_DATE_VALUE_MINUTE = "certificationDateValueMinute";
	public static final String CERTIFICATION_DATE_VALUE_SECOND = "certificationDateValueSecond";
	public static final String CERTIFICATION_DATE_VALUE_MILLISECOND = "certificationDateValueMillisecond";
	public static final String CERTIFICATION_DATE_NIL_REASON = "certificationDateNilReason";
	public static final String CERTIFICATION_EXPIRATION_DATE_NIL_REASON = "certificationExpirationDateNilReason";

	public void save(Airportheliport transientInstance) {
		log.debug("saving Airportheliport instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Airportheliport persistentInstance) {
		log.debug("deleting Airportheliport instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Airportheliport findById(java.lang.String id) {
		log.debug("getting Airportheliport instance with id: " + id);
		try {
			Airportheliport instance = (Airportheliport) getSession().get("com.aixm.bean.Airportheliport", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Airportheliport instance) {
		log.debug("finding Airportheliport instance by example");
		try {
			List results = getSession().createCriteria("com.aixm.bean.Airportheliport").add(Example.create(instance))
					.list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Airportheliport instance with property: " + propertyName + ", value: " + value);
		try {
			String queryString = "from Airportheliport as model where model." + propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByDesignatorNilReason(Object designatorNilReason) {
		return findByProperty(DESIGNATOR_NIL_REASON, designatorNilReason);
	}

	public List findByAirportHeliportNameValue(Object airportHeliportNameValue) {
		return findByProperty(AIRPORT_HELIPORT_NAME_VALUE, airportHeliportNameValue);
	}

	public List findByAirportHeliportNameNilReason(Object airportHeliportNameNilReason) {
		return findByProperty(AIRPORT_HELIPORT_NAME_NIL_REASON, airportHeliportNameNilReason);
	}

	public List findByLocationIndicatorIcaoValue(Object locationIndicatorIcaoValue) {
		return findByProperty(LOCATION_INDICATOR_ICAO_VALUE, locationIndicatorIcaoValue);
	}

	public List findByLocationIndicatorIcaoNilReason(Object locationIndicatorIcaoNilReason) {
		return findByProperty(LOCATION_INDICATOR_ICAO_NIL_REASON, locationIndicatorIcaoNilReason);
	}

	public List findByDesignatorIataValue(Object designatorIataValue) {
		return findByProperty(DESIGNATOR_IATA_VALUE, designatorIataValue);
	}

	public List findByDesignatorIataNilReason(Object designatorIataNilReason) {
		return findByProperty(DESIGNATOR_IATA_NIL_REASON, designatorIataNilReason);
	}

	public List findByTypeValue(Object typeValue) {
		return findByProperty(TYPE_VALUE, typeValue);
	}

	public List findByTypeNilReason(Object typeNilReason) {
		return findByProperty(TYPE_NIL_REASON, typeNilReason);
	}

	public List findByCertifiedIcaoValue(Object certifiedIcaoValue) {
		return findByProperty(CERTIFIED_ICAO_VALUE, certifiedIcaoValue);
	}

	public List findByCertifiedIcaoNilReason(Object certifiedIcaoNilReason) {
		return findByProperty(CERTIFIED_ICAO_NIL_REASON, certifiedIcaoNilReason);
	}

	public List findByPrivateUseValue(Object privateUseValue) {
		return findByProperty(PRIVATE_USE_VALUE, privateUseValue);
	}

	public List findByPrivateUseNilReason(Object privateUseNilReason) {
		return findByProperty(PRIVATE_USE_NIL_REASON, privateUseNilReason);
	}

	public List findByControlTypeValue(Object controlTypeValue) {
		return findByProperty(CONTROL_TYPE_VALUE, controlTypeValue);
	}

	public List findByControlTypeNilReason(Object controlTypeNilReason) {
		return findByProperty(CONTROL_TYPE_NIL_REASON, controlTypeNilReason);
	}

	public List findByFieldElevationValue(Object fieldElevationValue) {
		return findByProperty(FIELD_ELEVATION_VALUE, fieldElevationValue);
	}

	public List findByFieldElevationUom(Object fieldElevationUom) {
		return findByProperty(FIELD_ELEVATION_UOM, fieldElevationUom);
	}

	public List findByFieldElevationNilReason(Object fieldElevationNilReason) {
		return findByProperty(FIELD_ELEVATION_NIL_REASON, fieldElevationNilReason);
	}

	public List findByFieldElevationAccuracyValue(Object fieldElevationAccuracyValue) {
		return findByProperty(FIELD_ELEVATION_ACCURACY_VALUE, fieldElevationAccuracyValue);
	}

	public List findByFieldElevationAccuracyUom(Object fieldElevationAccuracyUom) {
		return findByProperty(FIELD_ELEVATION_ACCURACY_UOM, fieldElevationAccuracyUom);
	}

	public List findByFieldElevationAccuracyNilReason(Object fieldElevationAccuracyNilReason) {
		return findByProperty(FIELD_ELEVATION_ACCURACY_NIL_REASON, fieldElevationAccuracyNilReason);
	}

	public List findByVerticalDatumValue(Object verticalDatumValue) {
		return findByProperty(VERTICAL_DATUM_VALUE, verticalDatumValue);
	}

	public List findByVerticalDatumNilReason(Object verticalDatumNilReason) {
		return findByProperty(VERTICAL_DATUM_NIL_REASON, verticalDatumNilReason);
	}

	public List findByMagneticVariationValue(Object magneticVariationValue) {
		return findByProperty(MAGNETIC_VARIATION_VALUE, magneticVariationValue);
	}

	public List findByMagneticVariationNilReason(Object magneticVariationNilReason) {
		return findByProperty(MAGNETIC_VARIATION_NIL_REASON, magneticVariationNilReason);
	}

	public List findByMagneticVariationAccuracyValue(Object magneticVariationAccuracyValue) {
		return findByProperty(MAGNETIC_VARIATION_ACCURACY_VALUE, magneticVariationAccuracyValue);
	}

	public List findByMagneticVariationAccuracyNilReason(Object magneticVariationAccuracyNilReason) {
		return findByProperty(MAGNETIC_VARIATION_ACCURACY_NIL_REASON, magneticVariationAccuracyNilReason);
	}

	public List findByDateMagneticVariationValue(Object dateMagneticVariationValue) {
		return findByProperty(DATE_MAGNETIC_VARIATION_VALUE, dateMagneticVariationValue);
	}

	public List findByDateMagneticVariationNilReason(Object dateMagneticVariationNilReason) {
		return findByProperty(DATE_MAGNETIC_VARIATION_NIL_REASON, dateMagneticVariationNilReason);
	}

	public List findByMagneticVariationChangeValue(Object magneticVariationChangeValue) {
		return findByProperty(MAGNETIC_VARIATION_CHANGE_VALUE, magneticVariationChangeValue);
	}

	public List findByReferenceTemperatureValue(Object referenceTemperatureValue) {
		return findByProperty(REFERENCE_TEMPERATURE_VALUE, referenceTemperatureValue);
	}

	public List findByReferenceTemperatureUom(Object referenceTemperatureUom) {
		return findByProperty(REFERENCE_TEMPERATURE_UOM, referenceTemperatureUom);
	}

	public List findByReferenceTemperatureNilReason(Object referenceTemperatureNilReason) {
		return findByProperty(REFERENCE_TEMPERATURE_NIL_REASON, referenceTemperatureNilReason);
	}

	public List findByAltimeterCheckLocationValue(Object altimeterCheckLocationValue) {
		return findByProperty(ALTIMETER_CHECK_LOCATION_VALUE, altimeterCheckLocationValue);
	}

	public List findByAltimeterCheckLocationNilReason(Object altimeterCheckLocationNilReason) {
		return findByProperty(ALTIMETER_CHECK_LOCATION_NIL_REASON, altimeterCheckLocationNilReason);
	}

	public List findBySecondaryPowerSupplyValue(Object secondaryPowerSupplyValue) {
		return findByProperty(SECONDARY_POWER_SUPPLY_VALUE, secondaryPowerSupplyValue);
	}

	public List findBySecondaryPowerSupplyNilReason(Object secondaryPowerSupplyNilReason) {
		return findByProperty(SECONDARY_POWER_SUPPLY_NIL_REASON, secondaryPowerSupplyNilReason);
	}

	public List findByWindDirectionIndicatorValue(Object windDirectionIndicatorValue) {
		return findByProperty(WIND_DIRECTION_INDICATOR_VALUE, windDirectionIndicatorValue);
	}

	public List findByWindDirectionIndicatorNilReason(Object windDirectionIndicatorNilReason) {
		return findByProperty(WIND_DIRECTION_INDICATOR_NIL_REASON, windDirectionIndicatorNilReason);
	}

	public List findByLandingDirectionIndicatorValue(Object landingDirectionIndicatorValue) {
		return findByProperty(LANDING_DIRECTION_INDICATOR_VALUE, landingDirectionIndicatorValue);
	}

	public List findByLandingDirectionIndicatorNilReason(Object landingDirectionIndicatorNilReason) {
		return findByProperty(LANDING_DIRECTION_INDICATOR_NIL_REASON, landingDirectionIndicatorNilReason);
	}

	public List findByTransitionAltitudeValue(Object transitionAltitudeValue) {
		return findByProperty(TRANSITION_ALTITUDE_VALUE, transitionAltitudeValue);
	}

	public List findByTransitionAltitudeUom(Object transitionAltitudeUom) {
		return findByProperty(TRANSITION_ALTITUDE_UOM, transitionAltitudeUom);
	}

	public List findByTransitionAltitudeNilReason(Object transitionAltitudeNilReason) {
		return findByProperty(TRANSITION_ALTITUDE_NIL_REASON, transitionAltitudeNilReason);
	}

	public List findByTransitionLevelValue(Object transitionLevelValue) {
		return findByProperty(TRANSITION_LEVEL_VALUE, transitionLevelValue);
	}

	public List findByTransitionLevelUom(Object transitionLevelUom) {
		return findByProperty(TRANSITION_LEVEL_UOM, transitionLevelUom);
	}

	public List findByTransitionLevelNilReason(Object transitionLevelNilReason) {
		return findByProperty(TRANSITION_LEVEL_NIL_REASON, transitionLevelNilReason);
	}

	public List findByLowestTemperatureValue(Object lowestTemperatureValue) {
		return findByProperty(LOWEST_TEMPERATURE_VALUE, lowestTemperatureValue);
	}

	public List findByLowestTemperatureUom(Object lowestTemperatureUom) {
		return findByProperty(LOWEST_TEMPERATURE_UOM, lowestTemperatureUom);
	}

	public List findByLowestTemperatureNilReason(Object lowestTemperatureNilReason) {
		return findByProperty(LOWEST_TEMPERATURE_NIL_REASON, lowestTemperatureNilReason);
	}

	public List findByAbandonedValue(Object abandonedValue) {
		return findByProperty(ABANDONED_VALUE, abandonedValue);
	}

	public List findByAbandonedNilReason(Object abandonedNilReason) {
		return findByProperty(ABANDONED_NIL_REASON, abandonedNilReason);
	}

	public List findByCertificationDateValueTimezone(Object certificationDateValueTimezone) {
		return findByProperty(CERTIFICATION_DATE_VALUE_TIMEZONE, certificationDateValueTimezone);
	}

	public List findByCertificationDateValueYear(Object certificationDateValueYear) {
		return findByProperty(CERTIFICATION_DATE_VALUE_YEAR, certificationDateValueYear);
	}

	public List findByAirportheliportcolValueYear(Object airportheliportcolValueYear) {
		return findByProperty(AIRPORTHELIPORTCOL_VALUE_YEAR, airportheliportcolValueYear);
	}

	public List findByCertificationDateValueMonth(Object certificationDateValueMonth) {
		return findByProperty(CERTIFICATION_DATE_VALUE_MONTH, certificationDateValueMonth);
	}

	public List findByCertificationDateValueDate(Object certificationDateValueDate) {
		return findByProperty(CERTIFICATION_DATE_VALUE_DATE, certificationDateValueDate);
	}

	public List findByCertificationDateValueHour(Object certificationDateValueHour) {
		return findByProperty(CERTIFICATION_DATE_VALUE_HOUR, certificationDateValueHour);
	}

	public List findByCertificationDateValueMinute(Object certificationDateValueMinute) {
		return findByProperty(CERTIFICATION_DATE_VALUE_MINUTE, certificationDateValueMinute);
	}

	public List findByCertificationDateValueSecond(Object certificationDateValueSecond) {
		return findByProperty(CERTIFICATION_DATE_VALUE_SECOND, certificationDateValueSecond);
	}

	public List findByCertificationDateValueMillisecond(Object certificationDateValueMillisecond) {
		return findByProperty(CERTIFICATION_DATE_VALUE_MILLISECOND, certificationDateValueMillisecond);
	}

	public List findByCertificationDateNilReason(Object certificationDateNilReason) {
		return findByProperty(CERTIFICATION_DATE_NIL_REASON, certificationDateNilReason);
	}

	public List findByCertificationExpirationDateNilReason(Object certificationExpirationDateNilReason) {
		return findByProperty(CERTIFICATION_EXPIRATION_DATE_NIL_REASON, certificationExpirationDateNilReason);
	}

	public List findAll() {
		log.debug("finding all Airportheliport instances");
		try {
			String queryString = "from Airportheliport";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Airportheliport merge(Airportheliport detachedInstance) {
		log.debug("merging Airportheliport instance");
		try {
			Airportheliport result = (Airportheliport) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Airportheliport instance) {
		log.debug("attaching dirty Airportheliport instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Airportheliport instance) {
		log.debug("attaching clean Airportheliport instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}