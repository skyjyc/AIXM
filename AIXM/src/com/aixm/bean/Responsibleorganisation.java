package com.aixm.bean;

/**
 * Responsibleorganisation entity. @author MyEclipse Persistence Tools
 */

public class Responsibleorganisation implements java.io.Serializable {

	// Fields

	private String designator;
	private String roleValue;
	private String roleNilReason;
	private String theOrganisationAuthorityNilReason;
	private String theOrganisationAuthorityRemoteSchema;
	private String theOrganisationAuthorityType;
	private String theOrganisationAuthorityHref;
	private String theOrganisationAuthorityRole;
	private String theOrganisationAuthorityArcrole;
	private String theOrganisationAuthorityTitle;
	private String theOrganisationAuthorityShow;
	private String theOrganisationAuthorityActuate;
	private boolean theOrganisationAuthorityOwns;

	// Constructors

	/** default constructor */
	public Responsibleorganisation() {
	}

	/** minimal constructor */
	public Responsibleorganisation(String designator) {
		this.designator = designator;
	}

	/** full constructor */
	public Responsibleorganisation(String designator, String roleValue, String roleNilReason,
			String theOrganisationAuthorityNilReason, String theOrganisationAuthorityRemoteSchema,
			String theOrganisationAuthorityType, String theOrganisationAuthorityHref,
			String theOrganisationAuthorityRole, String theOrganisationAuthorityArcrole,
			String theOrganisationAuthorityTitle, String theOrganisationAuthorityShow,
			String theOrganisationAuthorityActuate, boolean theOrganisationAuthorityOwns) {
		this.designator = designator;
		this.roleValue = roleValue;
		this.roleNilReason = roleNilReason;
		this.theOrganisationAuthorityNilReason = theOrganisationAuthorityNilReason;
		this.theOrganisationAuthorityRemoteSchema = theOrganisationAuthorityRemoteSchema;
		this.theOrganisationAuthorityType = theOrganisationAuthorityType;
		this.theOrganisationAuthorityHref = theOrganisationAuthorityHref;
		this.theOrganisationAuthorityRole = theOrganisationAuthorityRole;
		this.theOrganisationAuthorityArcrole = theOrganisationAuthorityArcrole;
		this.theOrganisationAuthorityTitle = theOrganisationAuthorityTitle;
		this.theOrganisationAuthorityShow = theOrganisationAuthorityShow;
		this.theOrganisationAuthorityActuate = theOrganisationAuthorityActuate;
		this.theOrganisationAuthorityOwns = theOrganisationAuthorityOwns;
	}

	// Property accessors

	public String getDesignator() {
		return this.designator;
	}

	public void setDesignator(String designator) {
		this.designator = designator;
	}

	public String getRoleValue() {
		return this.roleValue;
	}

	public void setRoleValue(String roleValue) {
		this.roleValue = roleValue;
	}

	public String getRoleNilReason() {
		return this.roleNilReason;
	}

	public void setRoleNilReason(String roleNilReason) {
		this.roleNilReason = roleNilReason;
	}

	public String getTheOrganisationAuthorityNilReason() {
		return this.theOrganisationAuthorityNilReason;
	}

	public void setTheOrganisationAuthorityNilReason(String theOrganisationAuthorityNilReason) {
		this.theOrganisationAuthorityNilReason = theOrganisationAuthorityNilReason;
	}

	public String getTheOrganisationAuthorityRemoteSchema() {
		return this.theOrganisationAuthorityRemoteSchema;
	}

	public void setTheOrganisationAuthorityRemoteSchema(String theOrganisationAuthorityRemoteSchema) {
		this.theOrganisationAuthorityRemoteSchema = theOrganisationAuthorityRemoteSchema;
	}

	public String getTheOrganisationAuthorityType() {
		return this.theOrganisationAuthorityType;
	}

	public void setTheOrganisationAuthorityType(String theOrganisationAuthorityType) {
		this.theOrganisationAuthorityType = theOrganisationAuthorityType;
	}

	public String getTheOrganisationAuthorityHref() {
		return this.theOrganisationAuthorityHref;
	}

	public void setTheOrganisationAuthorityHref(String theOrganisationAuthorityHref) {
		this.theOrganisationAuthorityHref = theOrganisationAuthorityHref;
	}

	public String getTheOrganisationAuthorityRole() {
		return this.theOrganisationAuthorityRole;
	}

	public void setTheOrganisationAuthorityRole(String theOrganisationAuthorityRole) {
		this.theOrganisationAuthorityRole = theOrganisationAuthorityRole;
	}

	public String getTheOrganisationAuthorityArcrole() {
		return this.theOrganisationAuthorityArcrole;
	}

	public void setTheOrganisationAuthorityArcrole(String theOrganisationAuthorityArcrole) {
		this.theOrganisationAuthorityArcrole = theOrganisationAuthorityArcrole;
	}

	public String getTheOrganisationAuthorityTitle() {
		return this.theOrganisationAuthorityTitle;
	}

	public void setTheOrganisationAuthorityTitle(String theOrganisationAuthorityTitle) {
		this.theOrganisationAuthorityTitle = theOrganisationAuthorityTitle;
	}

	public String getTheOrganisationAuthorityShow() {
		return this.theOrganisationAuthorityShow;
	}

	public void setTheOrganisationAuthorityShow(String theOrganisationAuthorityShow) {
		this.theOrganisationAuthorityShow = theOrganisationAuthorityShow;
	}

	public String getTheOrganisationAuthorityActuate() {
		return this.theOrganisationAuthorityActuate;
	}

	public void setTheOrganisationAuthorityActuate(String theOrganisationAuthorityActuate) {
		this.theOrganisationAuthorityActuate = theOrganisationAuthorityActuate;
	}

	public boolean getTheOrganisationAuthorityOwns() {
		return this.theOrganisationAuthorityOwns;
	}

	public void setTheOrganisationAuthorityOwns(boolean theOrganisationAuthorityOwns) {
		this.theOrganisationAuthorityOwns = theOrganisationAuthorityOwns;
	}

}