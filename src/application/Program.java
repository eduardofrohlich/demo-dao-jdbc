package application;

import java.util.Date;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		Department dp1 = new Department(1, "books");
		System.out.println(dp1);
		
		Seller seller = new Seller(1, "Eduardo", "edu@gmail.com", new Date(), 3000.0, dp1);
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println(seller);
	}

}
