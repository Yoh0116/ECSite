package com.internousdev.ECSite.action;


import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ECSite.dao.BuyItemDAO;
import com.internousdev.ECSite.dao.LoginDAO;
import com.internousdev.ECSite.dto.BuyItemDTO;
import com.internousdev.ECSite.dto.LoginDTO;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport implements SessionAware{

	//ログインID
	public String loginUserId;

	//ログインパスワード
	public String loginPassword;

	//処理結果を格納
	public String result;

	//ログイン情報を格納
	public Map<String,Object> Session;

	//ログイン情報取得DAO
	public LoginDAO loginDAO = new LoginDAO();

	//ログイン情報格納DTO
	private LoginDTO loginDTO = new LoginDTO();

	//アイテム情報を取得
	public BuyItemDAO buyItemDAO = new BuyItemDAO();




	public ArrayList<BuyItemDTO> buyItemList = new ArrayList<BuyItemDTO>();




	public String execute(){

		result = ERROR;

		loginDTO = loginDAO.getLoginUserInfo(loginUserId,loginPassword);

		Session.put("loginUser",loginDTO);

		if(((LoginDTO)Session.get("loginUser")).getLoginFlg()){
			result = SUCCESS;

			BuyItemDTO buyItemDTO = new BuyItemDTO();
			Session.put("login_user_id", loginDTO.getLoginId());
			Session.put("id",buyItemDTO.getId());
			Session.put("buyItem_name",buyItemDTO.getItemName());
			Session.put("buyItem_price",buyItemDTO.getItemPrice());

			buyItemList = buyItemDAO.getBuyItemInfo();
			Session.put("itemresult", buyItemList);

			return result;

		}

		return result;
	}

	public String getLoginUserId(){
		return loginUserId;
	}

	public void setLoginUserId(String loginUserId){
		this.loginUserId = loginUserId;
	}

	public String getLoginPassword(){
		return loginPassword;
	}

	public void setLoginPassword(String loginPassword){
		this.loginPassword = loginPassword;
	}

	@Override
	public void setSession(Map<String,Object> Session){
		this.Session = Session;
	}
}
