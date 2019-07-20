package com.stackroute.giphermanager.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Gipher {
	
	@Id
	private int gipherId;
	private String embedURL;
	private String bookMarkedBy;
	private String favouriteBy;
	private String createdBy;
	
	public Gipher(){}

	public Gipher(int gipherId, String embedURL, String bookMarkedBy, String favouriteBy, String createdBy) {
		super();
		this.gipherId = gipherId;
		this.embedURL = embedURL;
		this.bookMarkedBy = bookMarkedBy;
		this.favouriteBy = favouriteBy;
		this.createdBy = createdBy;
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

	public String getFavouriteBy() {
		return favouriteBy;
	}

	public void setFavouriteBy(String favouriteBy) {
		this.favouriteBy = favouriteBy;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	
	
	
	
}