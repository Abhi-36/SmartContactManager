package com.app.pojos;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="User")
public class User extends BaseEntity
{
 
 private String username;
 private String email;
 private String password;
 private String description;
 private String role;
 private boolean enabled;
 private String imageurl;
 
 @OneToMany(mappedBy = "user",cascade = CascadeType.ALL,fetch =FetchType.LAZY,orphanRemoval=true)
 List<Contact> contactlist=new ArrayList<>();
 
 public User() {
	super();
}


public User(String username, String email, String password, String description, String role, boolean enabled,
		String imageurl) {
	super();
	this.username = username;
	this.email = email;
	this.password = password;
	this.description = description;
	this.role = role;
	this.enabled = enabled;
	this.imageurl = imageurl;
}

 
public String getUsername() {
	return username;
}

public void setUsername(String username) {
	this.username = username;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public String getDescription() {
	return description;
}

public void setDescription(String description) {
	this.description = description;
}

public String getRole() {
	return role;
}

public void setRole(String role) {
	this.role = role;
}

public boolean isEnabled() {
	return enabled;
}

public void setEnabled(boolean enabled) {
	this.enabled = enabled;
}

public String getImageurl() {
	return imageurl;
}

public void setImageurl(String imageurl) {
	this.imageurl = imageurl;
}



public List<Contact> getContactlist() {
	return contactlist;
}


public void setContactlist(List<Contact> contactlist) {
	this.contactlist = contactlist;
}


@Override
public String toString() {
	return "User [username=" + username + ", email=" + email + ", password=" + password + ", description=" + description
			+ ", role=" + role + ", enabled=" + enabled + ", imageurl=" + imageurl + "]";
}

 
 
 

}
