package com.app.pojos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="contact")
public class Contact extends BaseEntity
{
	private String name;
	private String nickname;
	private String work;
	private String email;
	private String description;
	private String phonenumber;
	private String imageurl;
	@Override
	public String toString() {
		return "Contact [name=" + name + ", nickname=" + nickname + ", work=" + work + ", email=" + email
				+ ", description=" + description + ", phonenumber=" + phonenumber + ", imageurl=" + imageurl + "]";
	}
	public Contact(String name, String nickname, String work, String email, String description, String phonenumber,
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
	public Contact() {
		super();
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="user_id")
	 private User user;
}
