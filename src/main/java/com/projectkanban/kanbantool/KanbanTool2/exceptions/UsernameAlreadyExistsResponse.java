package com.projectkanban.kanbantool.KanbanTool2.exceptions;

public class UsernameAlreadyExistsResponse {
	
	private String username;

	
	public UsernameAlreadyExistsResponse(String username) {
		this.username = username;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	

}
