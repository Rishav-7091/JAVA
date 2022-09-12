package com.sonataDAOImpl;

import java.sql.PreparedStatement;
import com.sonataDAO.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.sonataIntf.ProductIntf;
import com.sonataJDBC.Product;

public class DAOImpl implements ProductIntf{
	DBconnection db= new DBconnection();
	int row=0;
	

	@Override
	public List<Product> getdata() {
		// TODO Auto-generated method stub
		List <Product> li  = new ArrayList<Product> ();
		try {
			PreparedStatement p1= db.connection.prepareStatement("insert into product"
	                + "(prd_id,prdName,prdPrice) values(?,?,?)");
			
			Iterator<Product> it= li.iterator();
			while(it.hasNext()) {
				Product p=it.next();
				p1.setInt(1,p.getProductID());
				p1.setString(2, p.getProductName());
				p1.setDouble(3, p.getProductPrice());
				p1.addBatch();
				 p1.executeBatch();
			}
			 
			  db.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return li;
		//return null;
	}

}
