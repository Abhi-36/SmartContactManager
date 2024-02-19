package com.app.dto;

public class GetUserDto 
{
	private String username;
    private String email;
    private String description;
	private String role;
	private boolean enabled;
	private String imageurl;
	public GetUserDto(String username, String email, String description, String role, boolean enabled,
			String imageurl) {
		super();
		this.username = username;
		this.email = email;
		this.description = description;
		this.role = role;
		this.enabled = enabled;
		this.imageurl = imageurl;
	}
	
	public GetUserDto() {
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
		return "GetUserDto [username=" + username + ", email=" + email + ", description=" + description + ", role="
				+ role + ", enabled=" + enabled + ", imageurl=" + imageurl + "]";
	}
	
	
}
