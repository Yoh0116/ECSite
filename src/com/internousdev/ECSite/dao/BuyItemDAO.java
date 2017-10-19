package com.internousdev.ECSite.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.internousdev.ECSite.dto.BuyItemDTO;
import com.internousdev.ECSite.util.DBConnector;
import com.mysql.jdbc.Connection;

public class BuyItemDAO {

	private DBConnector dbConnector = new DBConnector();

	private Connection connection = dbConnector.getConnection();

	private BuyItemDTO buyItemDTO = new BuyItemDTO();



	public BuyItemDTO getBuyItemInfo(){

		String sql = "SELECT id, ite_price FROM item_info_transaction";

	try{
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		ResultSet resultSet = preparedStatement.executeQuery();

		if(resultSet.next()){
			buyItemDTO.setId(resultSet.getInt("id"));
			buyItemDTO.setItemName(resultSet.getString("item_name"));
			buyItemDTO.setItemPrice(resultSet.getString("item_price"));
		}

	}catch(Exception e){
		e.printStackTrace();
	}

	return buyItemDTO;
	}

}
