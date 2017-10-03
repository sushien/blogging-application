package com.model;

import java.io.Serializable;
import javax.persistence.*;

//Rating Bean
@Entity
@Table(name="ratings")
@NamedQuery(name="Rating.findAll", query="SELECT r FROM Rating r")
public class Rating implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	private int rateId;

	private int rating;

	//bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name="username")
	private User user;

	//bi-directional many-to-one association to Blog
	@ManyToOne
	@JoinColumn(name="blogId")
	private Blog blog;

	public Rating() {
	}

	public int getRateId() {
		return this.rateId;
	}

	public void setRateId(int rateId) {
		this.rateId = rateId;
	}

	public int getRating() {
		return this.rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Blog getBlog() {
		return this.blog;
	}

	public void setBlog(Blog blog) {
		this.blog = blog;
	}
	@Override
	public String toString() {
		return "Rating [rateId=" + rateId + ", rating=" + rating + ", user=" + user + ", blog=" + blog + "]";
	}


}