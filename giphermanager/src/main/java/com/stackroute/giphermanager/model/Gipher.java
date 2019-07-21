package com.stackroute.giphermanager.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Gipher {
	
	@Id
	private int gipherId;
	private String embedURL;
	private String bookMarkedBy;
	private String favouritedBy;
	private String userId;
	
	public Gipher(){}

	public Gipher(int gipherId, String embedURL, String bookMarkedBy, String favouritedBy, String userId) {
		this.gipherId = gipherId;
		this.embedURL = embedURL;
		this.bookMarkedBy = bookMarkedBy;
		this.favouritedBy = favouritedBy;
		this.userId = userId;
	}

	public int getGipherId() {
		return gipherId;
	}

	public void setGipherId(int gipherId) {
		this.gipherId = gipherId;
	}

	public String getEmbedURL() {
		return embedURL;
	}

	public void setEmbedURL(String embedURL) {
		this.embedURL = embedURL;
	}

	public String getBookMarkedBy() {
		return bookMarkedBy;
	}

	public void setBookMarkedBy(String bookMarkedBy) {
		this.bookMarkedBy = bookMarkedBy;
	}

	public String getFavouritedBy() {
		return favouritedBy;
	}

	public void setFavouritedBy(String favouritedBy) {
		this.favouritedBy = favouritedBy;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}	
}
