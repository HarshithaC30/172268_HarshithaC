package com.capgemini.streams;

public class News {

	int newsID;
	String postedByUser;
	String commentByUser;
	String comment;
	public News(int newsID, String postedByUser, String commentByUser, String comment) {
		super();
		this.newsID = newsID;
		this.postedByUser = postedByUser;
		this.commentByUser = commentByUser;
		this.comment = comment;
	}
	public int getNewsID() {
		return newsID;
	}
	public void setNewsID(int newsID) {
		this.newsID = newsID;
	}
	public String getPostedByUser() {
		return postedByUser;
	}
	public void setPostedByUser(String postedByUser) {
		this.postedByUser = postedByUser;
	}
	public String getCommentByUser() {
		return commentByUser;
	}
	public void setCommentByUser(String commentByUser) {
		this.commentByUser = commentByUser;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	@Override
	public String toString() {
		return "News [newsID=" + newsID + ", postedByUser=" + postedByUser + ", commentByUser=" + commentByUser
				+ ", comment=" + comment + "]";
	}
	
}
