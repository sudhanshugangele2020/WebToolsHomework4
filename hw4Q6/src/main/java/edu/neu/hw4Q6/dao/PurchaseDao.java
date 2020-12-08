package edu.neu.hw4Q6.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PurchaseDao {

	public int addBook(String isbn, String title, String author, float price) throws Exception {
		int i = 0;
		System.out.println("Inside BookDao Values are "+isbn+" "+title+" "+author+" "+price);
		Connection connection = null;
		PreparedStatement stmnt = null;
		ResultSet resultSet = null;
		Dao dao = new Dao();
		
		connection = dao.getConnection();
		stmnt = connection.prepareStatement("Insert into book(isbn,title,author,price) Values (?,?,?,?)");
		
		stmnt.setString(1, isbn);
		stmnt.setString(2, title);
		stmnt.setString(3, author);
		stmnt.setFloat(4, price);
		System.out.println(stmnt.toString());
		i = stmnt.executeUpdate();
		
		System.out.println("MyResultSet : "+resultSet);
		System.out.println("i : "+i);
		
		return i;
	}
	
	public void addToCart() {
		
	}
}
