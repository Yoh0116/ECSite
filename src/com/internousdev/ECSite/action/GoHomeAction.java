package com.internousdev.ECSite.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class GoHomeAction extends ActionSupport implements SessionAware{
	private Map<String,Object> Session;

	public String execute(){
		return SUCCESS;
	}



	public Map<String,Object> getSession(){
		return this.Session;
	}

	@Override
	public void setSession(Map<String,Object> Session){
		this.Session = Session;
	}

}
