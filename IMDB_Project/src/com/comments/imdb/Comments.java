package com.comments.imdb;

public class Comments {
	
	String usercomments;
	String name;

	public Comments(String usercomments) {
		super();
		this.usercomments = usercomments;
	}

	
	public String getUsercomments() {
		return usercomments;
	}

	public void setUsercomments(String usercomments) {
		this.usercomments = usercomments;
	}

	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Comments(String usercomments, String name) {
		super();
		this.usercomments = usercomments;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Comments [comments=" + usercomments + ", name=" + name + "]";
	}
	
}
