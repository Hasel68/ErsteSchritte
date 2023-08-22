package com.company;

import java.util.ArrayList;

public class GroceryList {
	

	private ArrayList<String> groceryList = new ArrayList<>(); 
			
	public void addGroceryList(String item)
	{
		groceryList.add(item);
	}
	
	public void printgroceryList()
	{
		System.out.println("Du hast " + groceryList.size() + "Produkte in deiner Liste.");
		for (int i = 0; i < groceryList.size(); i++)
		{
			System.out.println((i+1) + ". " + groceryList.get(i));
		}
	}
	
	public void modifyGroceryList (int position, String newItem)
	{
		groceryList.set(position, newItem);
		System.out.println("Produkt" + (position+1) + "wurde hinzugefügt");
	}
	
	public void removeGroceryItem(int position)
	{
		String theItem = groceryList.get(position);
		groceryList.remove(position);		
	}
	
	public String findItem (String searchItem)
	{
		int position = groceryList.indexOf(searchItem);
		if(position >= 0)
		{
			return groceryList.get(position);
		}
		return null;
	}
	
}
