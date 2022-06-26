package com.company;

import java.security.SecureRandom;
import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<String>();

    public void addGroceryList(String item){
        groceryList.add(item);
    }

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    public void printGroceryList(){
        System.out.println("You have "+groceryList.size()+ " items in your grocery list");
        for (int i=0; i< groceryList.size(); i++){
            System.out.println((i+1)+ ". "+ groceryList.get(i));
        }
    }
    public void modifyGroceryItem(String currentItem, String newItem){
        int position = findGroceryItem(currentItem);
        if(position >= 0){
            modifyGroceryItem(position, newItem);
        }
    }
    private void modifyGroceryItem(int position, String newItem){
        groceryList.set(position, newItem);
        System.out.println("Grocery item "+(position+1)+ " has been modified");
    }
    public void removeGroceryItem(String item){
        int position = findGroceryItem(item);
        if(position >= 0){
            removeGroceryItem(position);
        }
    }
    private void removeGroceryItem(int position){
//        String theItem = groceryList.get(position);
        groceryList.remove(position);
        System.out.println("Grocery item "+(position+1)+ " has been removed");
    }
//    public String findGroceryItem(String searchItem){
//        boolean exist = groceryList.contains(searchItem);
//        if(exist){
//            int position = groceryList.indexOf(searchItem);
//            return groceryList.get(position);
//        }
//        return null;
//    }
    private int findGroceryItem(String searchItem){
        return groceryList.indexOf(searchItem);
    }

    public boolean onFile(String searchItem){
        int position = findGroceryItem(searchItem);
        if(position >= 0){
            return true;
        }
        return false;
    }
}
