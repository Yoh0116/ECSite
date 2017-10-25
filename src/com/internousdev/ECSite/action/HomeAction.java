package com.internousdev.ECSite.action;


import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ECSite.dto.BuyItemDTO;
import com.opensymphony.xwork2.ActionSupport;

public class HomeAction extends ActionSupport implements SessionAware{

	private Map<String,Object> Session;

	public ArrayList<BuyItemDTO> buyItemList = new ArrayList<BuyItemDTO>();


	@SuppressWarnings("unchecked")
	public String execute(){
		String result = "login";
		if(Session.containsKey("id")){
			result = SUCCESS;
		}

		buyItemList = (ArrayList<BuyItemDTO>)Session.get("itemresult");

		return result;
	}

	@Override
	public void setSession(Map<String,Object> Session){
		this.Session = Session;
	}



}
