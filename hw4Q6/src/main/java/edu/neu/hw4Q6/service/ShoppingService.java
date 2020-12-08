package edu.neu.hw4Q6.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import edu.neu.hw4Q6.model.UserProduct;

public class ShoppingService {

	private ArrayList<UserProduct> userItemList = null; 
	

	
	public ShoppingService() {
		super();
		this.userItemList = new ArrayList<UserProduct>();
	}



	public ArrayList<UserProduct> addItem(String user,ArrayList<String> items) {
		ArrayList<UserProduct> addedItems = new ArrayList<>();

		if(!userItemList.isEmpty()) {			
			ArrayList<String> temp =new ArrayList<>();
			Iterator<UserProduct> iterUP = userItemList.iterator();
			while(iterUP.hasNext()) {
				UserProduct up1 = iterUP.next();
				System.out.println(up1.getItem()+" is already in the saved list ");
				if(up1.getUser().equals(user)) {
					temp.add(up1.getItem());
					System.out.println("Current size of non empty list temp.size"+temp.size());
				}
			}
			
			items.removeAll(temp);
			System.out.println("After comparing arraylist the size of list to be added "+items.size());
			if(items.size()>0) {
				
				Iterator<String> iter = items.iterator();
				while (iter.hasNext()) { 
					UserProduct upq = new UserProduct();
					String item = iter.next();
		            System.out.print(item + " this is element in filtered items to be added"); 		            
		            upq.setUser(user);
		            System.out.println("Added username"+upq.getUser());
		            upq.setItem(item);
		            System.out.println("His added item name"+upq.getItem());
		            userItemList.add(upq);
		            addedItems.add(upq);
		            System.out.println("My userItemList size after add item"+userItemList.size());
		        }

				return addedItems;
			} else return null;
		} else {
			Iterator<String> iter = items.iterator();
			while (iter.hasNext()) { 
				System.out.println("This iss my first entry");
				String item = iter.next();
	            System.out.print(item + " first item"); 
	            UserProduct up = new UserProduct();
	            up.setUser(user);
	            up.setItem(item);
	            userItemList.add(up);
	            addedItems.add(up);
	            System.out.println("My userItemList size :"+userItemList.size());
	        }
			System.out.println(addedItems.size());
			return addedItems;
		  }
		}
	
	
	public ArrayList<String> viewCart(String user) {

		if(userItemList.isEmpty()) {
			return new ArrayList<>();
		}
		else {
		
			ArrayList<String> pass = new ArrayList<>();;
			Iterator<UserProduct> iterUP = userItemList.iterator();
			while(iterUP.hasNext()) {
				ArrayList<String> temp = new ArrayList<>();
				UserProduct up1 = iterUP.next();
				System.out.println(up1+" this is the element in the saved list ");
				if(up1.getUser().equals(user)) {
	
					temp.add(up1.getItem());
					pass.add(temp.get(0));
					System.out.println("Item just inserted in temp is "+temp.get(0));
					System.out.println("Current size"+pass.size());
				}
			}
			return pass;
		}

	}
	

	public ArrayList<String> removeCartItems(String user,ArrayList<String> items) {
		
		if(userItemList.isEmpty()) {
			return new ArrayList<>();
		} else {
			ArrayList<String> removed = new ArrayList<>();
			ArrayList<UserProduct> temp = new ArrayList<UserProduct>();
			Iterator<UserProduct> iterUP = userItemList.iterator();
			while(iterUP.hasNext()) {
				UserProduct up1 = iterUP.next();
				if((up1.getUser().equals(user))&&(items.contains(up1.getItem()))) {
					removed.add(up1.getItem());
					temp.add(up1);
				}
			}
			userItemList.removeAll(temp);		
			return removed;
		}
		
		
	}
		
	
}
