package com.example.demo.entities;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class Vote {

	// embedded ID (composite key)

	private VodeId pk; // primary key 
	
	@EmbeddedId  
	public VodeId getPk() {
		return pk;
	}

	public void setPk(VodeId pk) {
		this.pk = pk;
	}

	private Boolean upvote;

	public Boolean getUpvote() {
		return upvote;
	}

	public void setUpvote(Boolean upvote) {
		this.upvote = upvote;
	}
	
	
}
