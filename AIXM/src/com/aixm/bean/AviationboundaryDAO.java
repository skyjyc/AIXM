package com.aixm.bean;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;

/**
 * A data access object (DAO) providing persistence and search support for
 * Aviationboundary entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.aixm.bean.Aviationboundary
 * @author MyEclipse Persistence Tools
 */
public class AviationboundaryDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory.getLog(AviationboundaryDAO.class);
	// property constants
	public static final String ELEVATION_VALUE = "elevationValue";
	public static final String ELEVATION_UOM = "elevationUom";
	public static final String ELEVATION_NIL_REASON = "elevationNilReason";
	public static final String GEOID_UNDULATION_VALUE = "geoidUndulationValue";
	public static final String GEOID_UNDULATION_UOM = "geoidUndulationUom";
	public static final String GEOID_UNDULATION_NIL_REASON = "geoidUndulationNilReason";
	public static final String VERTICAL_DATUM_VALUE = "verticalDatumValue";
	public static final String VERTICAL_DATUM_NIL_REASON = "verticalDatumNilReason";
	public static final String VERTICAL_ACCURACY_VALUE = "verticalAccuracyValue";
	public static final String VERTICAL_ACCURACY_UOM = "verticalAccuracyUom";
	public static final String VERTICAL_ACCURACY_NIL_REASON = "verticalAccuracyNilReason";

	public void save(Aviationboundary transientInstance) {
		log.debug("saving Aviationboundary instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Aviationboundary persistentInstance) {
		log.debug("deleting Aviationboundary instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Aviationboundary findById(java.lang.String id) {
		log.debug("getting Aviationboundary instance with id: " + id);
		try {
			Aviationboundary instance = (Aviationboundary) getSession().get("com.aixm.bean.Aviationboundary", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Aviationboundary instance) {
		log.debug("finding Aviationboundary instance by example");
		try {
			List results = getSession().createCriteria("com.aixm.bean.Aviationboundary").add(Example.create(instance))
					.list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Aviationboundary instance with property: " + propertyName + ", value: " + value);
		try {
			String queryString = "from Aviationboundary as model where model." + propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByElevationValue(Object elevationValue) {
		return findByProperty(ELEVATION_VALUE, elevationValue);
	}

	public List findByElevationUom(Object elevationUom) {
		return findByProperty(ELEVATION_UOM, elevationUom);
	}

	public List findByElevationNilReason(Object elevationNilReason) {
		return findByProperty(ELEVATION_NIL_REASON, elevationNilReason);
	}

	public List findByGeoidUndulationValue(Object geoidUndulationValue) {
		return findByProperty(GEOID_UNDULATION_VALUE, geoidUndulationValue);
	}

	public List findByGeoidUndulationUom(Object geoidUndulationUom) {
		return findByProperty(GEOID_UNDULATION_UOM, geoidUndulationUom);
	}

	public List findByGeoidUndulationNilReason(Object geoidUndulationNilReason) {
		return findByProperty(GEOID_UNDULATION_NIL_REASON, geoidUndulationNilReason);
	}

	public List findByVerticalDatumValue(Object verticalDatumValue) {
		return findByProperty(VERTICAL_DATUM_VALUE, verticalDatumValue);
	}

	public List findByVerticalDatumNilReason(Object verticalDatumNilReason) {
		return findByProperty(VERTICAL_DATUM_NIL_REASON, verticalDatumNilReason);
	}

	public List findByVerticalAccuracyValue(Object verticalAccuracyValue) {
		return findByProperty(VERTICAL_ACCURACY_VALUE, verticalAccuracyValue);
	}

	public List findByVerticalAccuracyUom(Object verticalAccuracyUom) {
		return findByProperty(VERTICAL_ACCURACY_UOM, verticalAccuracyUom);
	}

	public List findByVerticalAccuracyNilReason(Object verticalAccuracyNilReason) {
		return findByProperty(VERTICAL_ACCURACY_NIL_REASON, verticalAccuracyNilReason);
	}

	public List findAll() {
		log.debug("finding all Aviationboundary instances");
		try {
			String queryString = "from Aviationboundary";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Aviationboundary merge(Aviationboundary detachedInstance) {
		log.debug("merging Aviationboundary instance");
		try {
			Aviationboundary result = (Aviationboundary) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Aviationboundary instance) {
		log.debug("attaching dirty Aviationboundary instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Aviationboundary instance) {
		log.debug("attaching clean Aviationboundary instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}