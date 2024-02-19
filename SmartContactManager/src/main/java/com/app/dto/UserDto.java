package com.app.dto;

import jakarta.persistence.Column;

public class UserDto 
{
	
	 private String username;
     private String email;
	 private String password;
	 private String description;
	 private String role;
	 private boolean enabled;
	 private String imageurl;
	 
	 
	public UserDto(String username, String email, String password, String description, String role, boolean enabled,
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


	public UserDto() {
		super();
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


	@Override
	public String toString() {
		return "UserDto [username=" + username + ", email=" + email + ", password=" + password + ", description="
				+ description + ", role=" + role + ", enabled=" + enabled + ", imageurl=" + imageurl + "]";
	}
	 
}
