package com.collaborate.Model;

import java.util.Date;

public class User 
{

	private int userId;
	private String userContent,status,username;
	private int likes;
	
	
	public String getUserContent() {
		return userContent;
	}
	public void setUserContent(String userContent) {
		this.userContent = userContent;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getLikes() {
		return likes;
	}
	public void setLikes(int likes) {
		this.likes = likes;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	private Date createDate;
	public int getUserId() 
	{
		return userId;
	}
}
