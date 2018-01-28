package com.aixm.bean;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;

/**
 * A data access object (DAO) providing persistence and search support for
 * Availability entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.aixm.bean.Availability
 * @author MyEclipse Persistence Tools
 */
public class AvailabilityDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory.getLog(AvailabilityDAO.class);
	// property constants
	public static final String OPERATIONAL_STATUS_VALUE = "operationalStatusValue";
	public static final String OPERATIONAL_STATUS_NIL_REASON = "operationalStatusNilReason";
	public static final String WARNING_VALUE = "warningValue";
	public static final String WARNING_NIL_REASON = "warningNilReason";
	public static final String USE_TYPE_VALUE = "useTypeValue";
	public static final String USE_TYPE_NIL_REASON = "useTypeNilReason";
	public static final String USE_PRIOR_PERMISSION_VALUE = "usePriorPermissionValue";
	public static final String USE_PRIOR_PERMISSION_UOM = "usePriorPermissionUom";
	public static final String USE_PRIOR_PERMISSION_NIL_REASON = "usePriorPermissionNilReason";

	public void save(Availability transientInstance) {
		log.debug("saving Availability instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Availability persistentInstance) {
		log.debug("deleting Availability instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Availability findById(java.lang.String id) {
		log.debug("getting Availability instance with id: " + id);
		try {
			Availability instance = (Availability) getSession().get("com.aixm.bean.Availability", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Availability instance) {
		log.debug("finding Availability instance by example");
		try {
			List results = getSession().createCriteria("com.aixm.bean.Availability").add(Example.create(instance))
					.list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Availability instance with property: " + propertyName + ", value: " + value);
		try {
			String queryString = "from Availability as model where model." + propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByOperationalStatusValue(Object operationalStatusValue) {
		return findByProperty(OPERATIONAL_STATUS_VALUE, operationalStatusValue);
	}

	public List findByOperationalStatusNilReason(Object operationalStatusNilReason) {
		return findByProperty(OPERATIONAL_STATUS_NIL_REASON, operationalStatusNilReason);
	}

	public List findByWarningValue(Object warningValue) {
		return findByProperty(WARNING_VALUE, warningValue);
	}

	public List findByWarningNilReason(Object warningNilReason) {
		return findByProperty(WARNING_NIL_REASON, warningNilReason);
	}

	public List findByUseTypeValue(Object useTypeValue) {
		return findByProperty(USE_TYPE_VALUE, useTypeValue);
	}

	public List findByUseTypeNilReason(Object useTypeNilReason) {
		return findByProperty(USE_TYPE_NIL_REASON, useTypeNilReason);
	}

	public List findByUsePriorPermissionValue(Object usePriorPermissionValue) {
		return findByProperty(USE_PRIOR_PERMISSION_VALUE, usePriorPermissionValue);
	}

	public List findByUsePriorPermissionUom(Object usePriorPermissionUom) {
		return findByProperty(USE_PRIOR_PERMISSION_UOM, usePriorPermissionUom);
	}

	public List findByUsePriorPermissionNilReason(Object usePriorPermissionNilReason) {
		return findByProperty(USE_PRIOR_PERMISSION_NIL_REASON, usePriorPermissionNilReason);
	}

	public List findAll() {
		log.debug("finding all Availability instances");
		try {
			String queryString = "from Availability";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Availability merge(Availability detachedInstance) {
		log.debug("merging Availability instance");
		try {
			Availability result = (Availability) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Availability instance) {
		log.debug("attaching dirty Availability instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Availability instance) {
		log.debug("attaching clean Availability instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}