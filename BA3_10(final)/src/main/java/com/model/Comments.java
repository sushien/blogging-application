package com.model;

import java.io.Serializable;
import javax.persistence.*;

//Comments Bean
@Entity
@Table(name="comments")
@NamedQuery(name="Comments.findAll", query="SELECT c FROM Comments c")
public class Comments implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private int commentId;

	@Column(name="comments" ,columnDefinition="TINYTEXT")
	private String comments;

	//bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name="username")
	private User user;

	//bi-directional many-to-one association to Blog
	@ManyToOne
	@JoinColumn(name="blogId")
	private Blog blog;

	public Comments() {
	}

	public int getCommentId() {
		return this.commentId;
	}

	public void setCommentId(int commentId) {
		this.commentId = commentId;
	}

	public String getComments() {
		return this.comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
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
		return "Comments [commentId=" + commentId + ", comments=" + comments + ", user=" + user + ", blog=" + blog
				+ "]";
	}


}