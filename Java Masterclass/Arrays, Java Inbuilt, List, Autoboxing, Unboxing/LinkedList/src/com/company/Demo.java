package com.company;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

//LinkedList
public class Demo {
    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<String>();
        addInOrder(placesToVisit,"Lucknow");
        addInOrder(placesToVisit, "Delhi");
        addInOrder(placesToVisit, "Shimla");
        addInOrder(placesToVisit, "Chnadigarh");
        addInOrder(placesToVisit, "Chennai");
        addInOrder(placesToVisit, "Bangalore");
        addInOrder(placesToVisit, "Mumbai");
        addInOrder(placesToVisit, "Hyderabad");
        printList(placesToVisit);
    }
    private static void printList(LinkedList<String> linkedList){
        Iterator<String> i = linkedList.iterator();
        while (i.hasNext()){
            System.out.println("Now visiting "+ i.next());
        }
        System.out.println("=======================");
    }
    private static boolean addInOrder(LinkedList<String> linkedList, String newCity){
        ListIterator<String> stringListIterator = linkedList.listIterator();
        while (stringListIterator.hasNext()){
            int comparison = stringListIterator.next().compareTo(newCity);
            if (comparison == 0){
                //equal, do not add
                System.out.println(newCity + " is already included as destination");
            } else if (comparison > 0) {
                //new city should appear before this one
                stringListIterator.previous();
                stringListIterator.add(newCity);
            } else if (comparison < 0) {
                //move on next city
            }
        }
        stringListIterator.add(newCity);
        return true;
    }
}
