package com.aixm.bean;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;

/**
 * A data access object (DAO) providing persistence and search support for
 * Contact entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.aixm.bean.Contact
 * @author MyEclipse Persistence Tools
 */
public class ContactDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory.getLog(ContactDAO.class);
	// property constants
	public static final String CONTACT_INFORMATION_NAME_VALUE = "contactInformationNameValue";
	public static final String CONTACT_INFORMATION_NAME_NIL_REASON = "contactInformationNameNilReason";
	public static final String TITLE_VALUE = "titleValue";
	public static final String TITLE_NIL_REASON = "titleNilReason";

	public void save(Contact transientInstance) {
		log.debug("saving Contact instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Contact persistentInstance) {
		log.debug("deleting Contact instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Contact findById(java.lang.String id) {
		log.debug("getting Contact instance with id: " + id);
		try {
			Contact instance = (Contact) getSession().get("com.aixm.bean.Contact", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Contact instance) {
		log.debug("finding Contact instance by example");
		try {
			List results = getSession().createCriteria("com.aixm.bean.Contact").add(Example.create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Contact instance with property: " + propertyName + ", value: " + value);
		try {
			String queryString = "from Contact as model where model." + propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByContactInformationNameValue(Object contactInformationNameValue) {
		return findByProperty(CONTACT_INFORMATION_NAME_VALUE, contactInformationNameValue);
	}

	public List findByContactInformationNameNilReason(Object contactInformationNameNilReason) {
		return findByProperty(CONTACT_INFORMATION_NAME_NIL_REASON, contactInformationNameNilReason);
	}

	public List findByTitleValue(Object titleValue) {
		return findByProperty(TITLE_VALUE, titleValue);
	}

	public List findByTitleNilReason(Object titleNilReason) {
		return findByProperty(TITLE_NIL_REASON, titleNilReason);
	}

	public List findAll() {
		log.debug("finding all Contact instances");
		try {
			String queryString = "from Contact";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Contact merge(Contact detachedInstance) {
		log.debug("merging Contact instance");
		try {
			Contact result = (Contact) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Contact instance) {
		log.debug("attaching dirty Contact instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Contact instance) {
		log.debug("attaching clean Contact instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}