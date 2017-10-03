package com.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;

//Rating Bean
@Entity
@Table(name="users")
@NamedQuery(name="User.findAll", query="SELECT u FROM User u")
public class User implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	private String username;

	private String emailId;

	private String password;

	private String userType;

	//bi-directional many-to-one association to Blog
		@OneToMany(mappedBy="user")
		private List<Blog> blogs;

	
	//bi-directional many-to-one association to Comment
	@OneToMany(mappedBy="user")
	private List<Comments> comments;

	//bi-directional many-to-one association to Rating
	@OneToMany(mappedBy="user")
	private List<Rating> ratings;

	public User() {
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmailId() {
		return this.emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserType() {
		return this.userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}
	
	public List<Blog> getBlogs() {
		return this.blogs;
	}

	public void setBlogs(List<Blog> blogs) {
		this.blogs = blogs;
	}

	public Blog addBlog(Blog blog) {
		getBlogs().add(blog);
		blog.setUser(this);

		return blog;
	}

	public Blog removeBlog(Blog blog) {
		getBlogs().remove(blog);
		blog.setUser(null);

		return blog;
	}
	public List<Comments> getComments() {
		return this.comments;
	}

	public void setComments(List<Comments> comments) {
		this.comments = comments;
	}

	public Comments addComment(Comments comment) {
		getComments().add(comment);
		comment.setUser(this);

		return comment;
	}

	public Comments removeComment(Comments comment) {
		getComments().remove(comment);
		comment.setUser(null);

		return comment;
	}

	public List<Rating> getRatings() {
		return this.ratings;
	}

	public void setRatings(List<Rating> ratings) {
		this.ratings = ratings;
	}

	public Rating addRating(Rating rating) {
		getRatings().add(rating);
		rating.setUser(this);

		return rating;
	}

	public Rating removeRating(Rating rating) {
		getRatings().remove(rating);
		rating.setUser(null);

		return rating;
	}
	@Override
	public String toString() {
		return "User [username=" + username + ", emailId=" + emailId + ", password=" + password + ", userType="
				+ userType + "]";
	}


}