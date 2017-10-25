package com.internousdev.ECSite.action;


import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ECSite.dao.BuyItemDAO;
import com.opensymphony.xwork2.ActionSupport;

public class BuyItemAction extends ActionSupport implements SessionAware{

	//アイテム情報を取得
	public BuyItemDAO buyItemDAO = new BuyItemDAO();

	//アイテム購入個数
	public int count;

	//支払い方法
	public String pay;

	//アイテム情報を格納
	public Map<String,Object> Session;

	//処理結果
	public String result;



	public String itemName;
	public int itemPrice;








	public String execute(){
		result = SUCCESS;
		Session.put("count", count);
		int intCount = Integer.parseInt(Session.get("count").toString());

		Session.put("total_price", intCount * itemPrice);
		Session.put("buyItem_name", itemName);
		String payment;

		if(pay.equals("1")){

			payment = "現金払い";
			Session.put("pay", payment);

		}else{
			payment = "クレジットカード";
			Session.put("pay", payment);
		}
		return result;
	}

	public int getCount(){
		return count;
	}

	public void setCount(int count){
		this.count = count;
	}

	public String getPay(){
		return pay;
	}

	public void setPay(String pay){
		this.pay = pay;
	}


	@Override
	public void setSession(Map<String,Object> Session){
		this.Session = Session;
	}

	/**
	 * @return itemPrice
	 */
	public int getItemPrice() {
		return itemPrice;
	}

	/**
	 * @param itemPrice セットする itemPrice
	 */
	public void setItemPrice(int itemPrice) {
		this.itemPrice = itemPrice;
	}

	/**
	 * @return itemName
	 */
	public String getItemName() {
		return itemName;
	}

	/**
	 * @param itemName セットする itemName
	 */
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

}
