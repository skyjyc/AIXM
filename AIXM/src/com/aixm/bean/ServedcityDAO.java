package com.aixm.bean;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;

/**
 * A data access object (DAO) providing persistence and search support for
 * Servedcity entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.aixm.bean.Servedcity
 * @author MyEclipse Persistence Tools
 */
public class ServedcityDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory.getLog(ServedcityDAO.class);
	// property constants
	public static final String CITY_NAME_VALUE = "cityNameValue";
	public static final String CITY_NAME_NIL_REASON = "cityNameNilReason";

	public void save(Servedcity transientInstance) {
		log.debug("saving Servedcity instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Servedcity persistentInstance) {
		log.debug("deleting Servedcity instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Servedcity findById(java.lang.String id) {
		log.debug("getting Servedcity instance with id: " + id);
		try {
			Servedcity instance = (Servedcity) getSession().get("com.aixm.bean.Servedcity", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Servedcity instance) {
		log.debug("finding Servedcity instance by example");
		try {
			List results = getSession().createCriteria("com.aixm.bean.Servedcity").add(Example.create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Servedcity instance with property: " + propertyName + ", value: " + value);
		try {
			String queryString = "from Servedcity as model where model." + propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByCityNameValue(Object cityNameValue) {
		return findByProperty(CITY_NAME_VALUE, cityNameValue);
	}

	public List findByCityNameNilReason(Object cityNameNilReason) {
		return findByProperty(CITY_NAME_NIL_REASON, cityNameNilReason);
	}

	public List findAll() {
		log.debug("finding all Servedcity instances");
		try {
			String queryString = "from Servedcity";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Servedcity merge(Servedcity detachedInstance) {
		log.debug("merging Servedcity instance");
		try {
			Servedcity result = (Servedcity) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Servedcity instance) {
		log.debug("attaching dirty Servedcity instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Servedcity instance) {
		log.debug("attaching clean Servedcity instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}