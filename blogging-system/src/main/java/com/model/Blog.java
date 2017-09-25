package com.BloggingApplication.model;

import java.io.Serializable;
import javax.persistence.*;

import org.hibernate.annotations.TypeDef;

import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the blog database table.
 * 
 */
@Entity
@Table(name="blog")

@NamedQuery(name="Blog.findAll", query="SELECT b FROM Blog b")
public class Blog implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int blogId;
	private String author;

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	private int averageRating;

	private String blogTitle;

	private String category;

	private Timestamp createdDate;

	@Column(name="description", columnDefinition="TEXT")
	private String description;

	public Blog(int blogId) {
		super();
		this.blogId = blogId;
	}

	private Timestamp modifiedDate;

	@Column(name="summary", columnDefinition="TINYTEXT")
	private String summary;

	//bi-directional many-to-one association to Comment
	//@OneToMany(mappedBy="blog")
	//private List<Comment> comments;

	//bi-directional many-to-one association to Rating
	//@OneToMany(mappedBy="blog")
	//private List<Rating> ratings;

	public Blog() {
	}

	public int getBlogId() {
		return this.blogId;
	}

	public void setBlogId(int blogId) {
		this.blogId = blogId;
	}

	public int getAverageRating() {
		return this.averageRating;
	}

	public void setAverageRating(int averageRating) {
		this.averageRating = averageRating;
	}

	public String getBlogTitle() {
		return this.blogTitle;
	}

	public void setBlogTitle(String blogTitle) {
		this.blogTitle = blogTitle;
	}

	public String getCategory() {
		return this.category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Timestamp getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Timestamp getModifiedDate() {
		return this.modifiedDate;
	}

	public void setModifiedDate(Timestamp modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getSummary() {
		return this.summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	/*public List<Comment> getComments() {
		return this.comments;
	}

	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}

	public Comment addComment(Comment comment) {
		getComments().add(comment);
		comment.setBlog(this);

		return comment;
	}

	public Comment removeComment(Comment comment) {
		getComments().remove(comment);
		comment.setBlog(null);

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
		rating.setBlog(this);

		return rating;
	}

	public Rating removeRating(Rating rating) {
		getRatings().remove(rating);
		rating.setBlog(null);

		return rating;
	}*/

}