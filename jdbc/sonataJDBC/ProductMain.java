package com.sonataJDBC;

import java.util.List;

import com.sonataDAOImpl.DAOImpl;

public class ProductMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p=new Product();
		p.setProductID(84);
		p.setProductName("Apple");
		p.setProductPrice(300);
			
			DAOImpl p1 = new DAOImpl();
			List<Product> a1=p1.getdata();
			System.out.println(a1);

	}

}
