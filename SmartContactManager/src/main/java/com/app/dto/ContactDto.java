package com.app.dto;

public class ContactDto
{

	
	private String name;
	private String nickname;
	private String work;
	private String email;
	private String description;
	private String phonenumber;
	private String imageurl;
	public ContactDto(String name, String nickname, String work, String email, String description, String phonenumber,
			String imageurl) {
		super();
		this.name = name;
		this.nickname = nickname;
		this.work = work;
		this.email = email;
		this.description = description;
		this.phonenumber = phonenumber;
		this.imageurl = imageurl;
	}
	public ContactDto() {
		super();
	}
	@Override
	public String toString() {
		return "ContactDto [name=" + name + ", nickname=" + nickname + ", work=" + work + ", email=" + email
				+ ", description=" + description + ", phonenumber=" + phonenumber + ", imageurl=" + imageurl + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getWork() {
		return work;
	}
	public void setWork(String work) {
		this.work = work;
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
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getImageurl() {
		return imageurl;
	}
	public void setImageurl(String imageurl) {
		this.imageurl = imageurl;
	}
	
}
