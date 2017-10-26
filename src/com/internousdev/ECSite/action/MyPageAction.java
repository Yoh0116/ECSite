package com.internousdev.ECSite.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ECSite.dao.MyPageDAO;
import com.internousdev.ECSite.dto.MyPageDTO;
import com.opensymphony.xwork2.ActionSupport;

public class MyPageAction extends ActionSupport implements SessionAware{

	//ログイン情報を格納
	public Map<String,Object> Session;


	//マイページ情報取得DAO
	public MyPageDAO myPageDAO = new MyPageDAO();


	//マイページ情報格納DTO
	public ArrayList<MyPageDTO> myPageList = new ArrayList<MyPageDTO>();


	//削除フラグ
	public String deleteFlg;


	//処理結果
	public String result;

	public String message = null;




	public String execute() throws SQLException{

		if(!Session.containsKey("id")){
			return ERROR;
		}

		//商品を削除しない場合
		if(deleteFlg == null){
			String item_transaction_id = Session.get("id").toString();
			String user_master_id = Session.get("login_user_id").toString();

			myPageList = myPageDAO.getMyPageUserInfo(user_master_id);

			Iterator<MyPageDTO> iterator = myPageList.iterator();
			if(!(iterator.hasNext())){
				myPageList = null;
			}

		//商品を削除する場合
		}else if(deleteFlg.equals("1")){
			delete();
		}

		result = SUCCESS;
		return result;
	}

	//商品履歴削除
	public void delete() throws SQLException{
		String item_transaction_id = Session.get("id").toString();
		String user_master_id = Session.get("login_user_id").toString();

		int res = myPageDAO.buyItemHistoryDelete(item_transaction_id, user_master_id);

		if(res > 0){
			myPageList = null;
			message = "商品情報を正しく削除しました。";
		}else if(res == 0){
			message = "商品情報の削除に失敗しました。";
		}
	}


	public String getDeleteFlg(){
		return deleteFlg;
	}

	public void setDeleteFlg(String deleteFlg){
		this.deleteFlg = deleteFlg;
	}

	@Override
	public void setSession(Map<String,Object> Session){
		this.Session = Session;
	}

}
