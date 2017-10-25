
package com.internousdev.ECSite.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ECSite.dao.UserCreateCompleteDAO;
import com.opensymphony.xwork2.ActionSupport;

public class UserCreateCompleteAction extends ActionSupport implements SessionAware{

	public String loginUserId;

	public String loginPassword;

	public String userName;

	public Map<String,Object> Session;

	public String result;

	public UserCreateCompleteDAO userCreateCompleteDAO = new UserCreateCompleteDAO();

	public String execute() throws SQLException {

		userCreateCompleteDAO.createUser(Session.get("loginUserId").toString(),
				Session.get("loginPassword").toString(),
				Session.get("userName").toString());

		result  = SUCCESS;

		return result;
	}

	public String getLoginUserId(){
		return this.loginUserId;
	}

	public void setLoginUserId(String loginUserId){
		this.loginUserId = loginUserId;
	}

	public String getLoginPassword(){
		return this.loginPassword;
	}

	public void setLoginPassword(String loginPassword){
		this.loginPassword = loginPassword;
	}

	public String getUserName(){
		return this.userName;
	}

	public void setUserName(String userName){
		this.userName = userName;
	}


	@Override
	public void setSession(Map<String,Object> Session){
		this.Session = Session;
	}


}
