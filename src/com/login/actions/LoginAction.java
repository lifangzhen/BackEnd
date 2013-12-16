package com.login.actions;

import com.login.manager.LoginManager;

public class LoginAction {
	
	private LoginManager loginManager;
	

	public LoginManager getLoginManager() {
		return loginManager;
	}


	public void setLoginManager(LoginManager loginManager) {
		this.loginManager = loginManager;
	}


	public void getName(){
		loginManager.getName("11");
		System.out.println("ok");
	}
}
