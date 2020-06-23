package model.dao;

import db.DB;
import model.dao.impl.SellerDaoJDBC;

public class DaoFactory {

	public static SellerDao cretaSellerDao() {
		return new SellerDaoJDBC(DB.getConnection());
	}
	
}