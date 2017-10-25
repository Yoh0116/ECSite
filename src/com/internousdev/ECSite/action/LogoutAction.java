package com.internousdev.ECSite.action;

import java.util.HashMap;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class LogoutAction extends ActionSupport implements SessionAware{

	public Map<String,Object> Session = new HashMap<>();

	public String execute(){

		Session.clear();
		return SUCCESS;
	}


	@Override
	public void setSession(Map<String,Object> Session){
		this.Session = Session;
	}

}
