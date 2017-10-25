package com.internousdev.ECSite.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.internousdev.ECSite.dto.BuyItemDTO;
import com.internousdev.ECSite.util.DBConnector;
import com.mysql.jdbc.Connection;

public class BuyItemDAO {

	private DBConnector dbConnector = new DBConnector();

	private Connection connection = dbConnector.getConnection();




	public ArrayList<BuyItemDTO> getBuyItemInfo(){

		ArrayList<BuyItemDTO> BuyItemDTO = new ArrayList<BuyItemDTO>();

		String sql = "SELECT id, item_name, item_price FROM item_info_transaction";

	try{
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		ResultSet resultSet = preparedStatement.executeQuery();

		while(resultSet.next()){
			BuyItemDTO dto = new BuyItemDTO();
			dto.setId(resultSet.getInt("id"));
			dto.setItemName(resultSet.getString("item_name"));
			dto.setItemPrice(resultSet.getString("item_price"));
			BuyItemDTO.add(dto);
		}

	}catch(Exception e){
		e.printStackTrace();
	}

	return BuyItemDTO;
	}

}
