package org.geetha.weservices.messenger.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
public class Profile {

	private Long id;
	private String profilename;
	private String firstname;
	private String latname;
	private Date created;
	
	public Profile() {
		super();
	}

	public Profile(Long id, String profilename, String firstname, String latname) {
		super();
		this.id = id;
		this.profilename = profilename;
		this.firstname = firstname;
		this.latname = latname;
		this.created = new Date();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getProfilename() {
		return profilename;
	}

	public void setProfilename(String profilename) {
		this.profilename = profilename;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLatname() {
		return latname;
	}

	public void setLatname(String latname) {
		this.latname = latname;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}
	
	
	
	
}
