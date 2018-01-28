package com.aixm.bean;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;

/**
 * A data access object (DAO) providing persistence and search support for
 * Responsibleorganisation entities. Transaction control of the save(), update()
 * and delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.aixm.bean.Responsibleorganisation
 * @author MyEclipse Persistence Tools
 */
public class ResponsibleorganisationDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory.getLog(ResponsibleorganisationDAO.class);
	// property constants
	public static final String ROLE_VALUE = "roleValue";
	public static final String ROLE_NIL_REASON = "roleNilReason";
	public static final String THE_ORGANISATION_AUTHORITY_NIL_REASON = "theOrganisationAuthorityNilReason";
	public static final String THE_ORGANISATION_AUTHORITY_REMOTE_SCHEMA = "theOrganisationAuthorityRemoteSchema";
	public static final String THE_ORGANISATION_AUTHORITY_TYPE = "theOrganisationAuthorityType";
	public static final String THE_ORGANISATION_AUTHORITY_HREF = "theOrganisationAuthorityHref";
	public static final String THE_ORGANISATION_AUTHORITY_ROLE = "theOrganisationAuthorityRole";
	public static final String THE_ORGANISATION_AUTHORITY_ARCROLE = "theOrganisationAuthorityArcrole";
	public static final String THE_ORGANISATION_AUTHORITY_TITLE = "theOrganisationAuthorityTitle";
	public static final String THE_ORGANISATION_AUTHORITY_SHOW = "theOrganisationAuthorityShow";
	public static final String THE_ORGANISATION_AUTHORITY_ACTUATE = "theOrganisationAuthorityActuate";
	public static final String THE_ORGANISATION_AUTHORITY_OWNS = "theOrganisationAuthorityOwns";

	public void save(Responsibleorganisation transientInstance) {
		log.debug("saving Responsibleorganisation instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Responsibleorganisation persistentInstance) {
		log.debug("deleting Responsibleorganisation instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Responsibleorganisation findById(java.lang.String id) {
		log.debug("getting Responsibleorganisation instance with id: " + id);
		try {
			Responsibleorganisation instance = (Responsibleorganisation) getSession()
					.get("com.aixm.bean.Responsibleorganisation", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Responsibleorganisation instance) {
		log.debug("finding Responsibleorganisation instance by example");
		try {
			List results = getSession().createCriteria("com.aixm.bean.Responsibleorganisation")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Responsibleorganisation instance with property: " + propertyName + ", value: " + value);
		try {
			String queryString = "from Responsibleorganisation as model where model." + propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByRoleValue(Object roleValue) {
		return findByProperty(ROLE_VALUE, roleValue);
	}

	public List findByRoleNilReason(Object roleNilReason) {
		return findByProperty(ROLE_NIL_REASON, roleNilReason);
	}

	public List findByTheOrganisationAuthorityNilReason(Object theOrganisationAuthorityNilReason) {
		return findByProperty(THE_ORGANISATION_AUTHORITY_NIL_REASON, theOrganisationAuthorityNilReason);
	}

	public List findByTheOrganisationAuthorityRemoteSchema(Object theOrganisationAuthorityRemoteSchema) {
		return findByProperty(THE_ORGANISATION_AUTHORITY_REMOTE_SCHEMA, theOrganisationAuthorityRemoteSchema);
	}

	public List findByTheOrganisationAuthorityType(Object theOrganisationAuthorityType) {
		return findByProperty(THE_ORGANISATION_AUTHORITY_TYPE, theOrganisationAuthorityType);
	}

	public List findByTheOrganisationAuthorityHref(Object theOrganisationAuthorityHref) {
		return findByProperty(THE_ORGANISATION_AUTHORITY_HREF, theOrganisationAuthorityHref);
	}

	public List findByTheOrganisationAuthorityRole(Object theOrganisationAuthorityRole) {
		return findByProperty(THE_ORGANISATION_AUTHORITY_ROLE, theOrganisationAuthorityRole);
	}

	public List findByTheOrganisationAuthorityArcrole(Object theOrganisationAuthorityArcrole) {
		return findByProperty(THE_ORGANISATION_AUTHORITY_ARCROLE, theOrganisationAuthorityArcrole);
	}

	public List findByTheOrganisationAuthorityTitle(Object theOrganisationAuthorityTitle) {
		return findByProperty(THE_ORGANISATION_AUTHORITY_TITLE, theOrganisationAuthorityTitle);
	}

	public List findByTheOrganisationAuthorityShow(Object theOrganisationAuthorityShow) {
		return findByProperty(THE_ORGANISATION_AUTHORITY_SHOW, theOrganisationAuthorityShow);
	}

	public List findByTheOrganisationAuthorityActuate(Object theOrganisationAuthorityActuate) {
		return findByProperty(THE_ORGANISATION_AUTHORITY_ACTUATE, theOrganisationAuthorityActuate);
	}

	public List findByTheOrganisationAuthorityOwns(Object theOrganisationAuthorityOwns) {
		return findByProperty(THE_ORGANISATION_AUTHORITY_OWNS, theOrganisationAuthorityOwns);
	}

	public List findAll() {
		log.debug("finding all Responsibleorganisation instances");
		try {
			String queryString = "from Responsibleorganisation";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Responsibleorganisation merge(Responsibleorganisation detachedInstance) {
		log.debug("merging Responsibleorganisation instance");
		try {
			Responsibleorganisation result = (Responsibleorganisation) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Responsibleorganisation instance) {
		log.debug("attaching dirty Responsibleorganisation instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Responsibleorganisation instance) {
		log.debug("attaching clean Responsibleorganisation instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}