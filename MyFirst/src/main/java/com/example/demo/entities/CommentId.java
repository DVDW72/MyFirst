package com.example.demo.entities;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;

@Embeddable
public class CommentId implements Serializable {

	private static final long serialVersionUID = 1054522696499785937L;
	private Users user; 
	private Feature feature;
	
	@ManyToOne
	public Users getUser() {
		return user;
	}
	public void setUser(Users user) {
		this.user = user;
	}
	
	@ManyToOne
	public Feature getFeature() {
		return feature;
	}
	public void setFeature(Feature feature) {
		this.feature = feature;
	}

}
