package com.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

//Blog Bean
@Entity
@NamedQuery(name="Blog.findAll", query="SELECT b FROM Blog b")
public class Blog implements Serializable {

	private static final long serialVersionUID = 1L;

	private String author;

	private int averageRating;

	@Id
	private int blogId;

	@Lob
	private byte[] blogMedia;

	private String blogTitle;

	private String category;

	//bi-directional many-to-one association to Comment
	@OneToMany(mappedBy="blog")
	private List<Comments> comments;

	private Timestamp createdDate;

	@Column(name="description" ,columnDefinition="TEXT")
	private String description;

	private Timestamp modifiedDate;

	private String status;

	@Column(name="summary" ,columnDefinition="TINYTEXT")
	private String summary;

	/*//bi-directional many-to-one association to Rating
	@OneToMany(mappedBy="blog")
	private List<Rating> ratings;
	 */

	//bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name="username")
	private User user;


	public Blog() {
	}

	public Comments addComment(Comments comment) {
		getComments().add(comment);
		comment.setBlog(this);

		return comment;
	}

	/*public Rating addRating(Rating rating) {
		getRatings().add(rating);
		rating.setBlog(this);

		return rating;
	}
	 */
	
	public String getAuthor() {
		return this.author;
	}

	public int getAverageRating() {
		return this.averageRating;
	}

	public int getBlogId() {
		return this.blogId;
	}

	public byte[] getBlogMedia() {
		return this.blogMedia;
	}

	public String getBlogTitle() {
		return this.blogTitle;
	}

	public String getCategory() {
		return this.category;
	}

	public List<Comments> getComments() {
		return this.comments;
	}

	public Timestamp getCreatedDate() {
		return this.createdDate;
	}

	public String getDescription() {
		return this.description;
	}

	public Timestamp getModifiedDate() {
		return this.modifiedDate;
	}

	/*public List<Rating> getRatings() {
		return this.ratings;
	}
	 */
	public String getStatus() {
		return status;
	}

	public String getSummary() {
		return this.summary;
	}
	public User getUser() {
		return this.user;
	}

	public Comments removeComment(Comments comment) {
		getComments().remove(comment);
		comment.setBlog(null);

		return comment;
	}

	/*public Rating removeRating(Rating rating) {
		getRatings().remove(rating);
		rating.setBlog(null);

		return rating;
	}*/

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setAverageRating(int averageRating) {
		this.averageRating = averageRating;
	}

	public void setBlogId(int blogId) {
		this.blogId = blogId;
	}

	public void setBlogMedia(byte[] blogMedia) {
		this.blogMedia = blogMedia;
	}

	public void setBlogTitle(String blogTitle) {
		this.blogTitle = blogTitle;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public void setComments(List<Comments> comments) {
		this.comments = comments;
	}

	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setModifiedDate(Timestamp modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	/*public void setRatings(List<Rating> ratings) {
		this.ratings = ratings;
	}*/

	public void setStatus(String status) {
		this.status = status;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public void setUser(User user) {
		this.user = user;
	}

	//to string method
	@Override
	public String toString() {
		return "Blog [blogId=" + blogId + ", author=" + author + ", averageRating=" + averageRating  + ", blogTitle=" + blogTitle + ", category=" + category + ", createdDate="
				+ createdDate + ", description=" + description + ", modifiedDate=" + modifiedDate + ", summary="
				+ summary + "]";
	}

}