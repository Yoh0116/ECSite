package com.internousdev.ECSite.action;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ECSite.dao.BuyItemCompleteDAO;
import com.opensymphony.xwork2.ActionSupport;

public class BuyItemConfirmAction extends ActionSupport implements SessionAware{

	public Map<String,Object> buyItemInfoSession = new HashMap<String,Object>();

	public String result;

	public BuyItemCompleteDAO buyItemCompleteDAO = new BuyItemCompleteDAO();


	public String execute() throws SQLException{

		buyItemCompleteDAO.buyItemInfo(
				buyItemInfoSession.get("id").toString(),
				buyItemInfoSession.get("login_user_id").toString(),
				buyItemInfoSession.get("total_price").toString(),
				buyItemInfoSession.get("count").toString(),
				buyItemInfoSession.get("pay").toString());

		result = SUCCESS;
		return result;
	}

	@Override
	public void setSession(Map<String,Object> buyItemInfoSession){
		this.buyItemInfoSession = buyItemInfoSession;
	}

}
