package com.internousdev.ECSite.action;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ECSite.dao.BuyItemCompleteDAO;
import com.opensymphony.xwork2.ActionSupport;

public class BuyItemConfirmAction extends ActionSupport implements SessionAware{

	public Map<String,Object> Session = new HashMap<String,Object>();

	public String result;

	public BuyItemCompleteDAO buyItemCompleteDAO = new BuyItemCompleteDAO();


	public String execute() throws SQLException{

		buyItemCompleteDAO.buyItemInfo(
				Session.get("id").toString(),
				Session.get("login_user_id").toString(),
				Session.get("total_price").toString(),
				Session.get("count").toString(),
				Session.get("pay").toString());

		result = SUCCESS;
		return result;
	}

	@Override
	public void setSession(Map<String,Object> Session){
		this.Session = Session;
	}

}
