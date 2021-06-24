package JAVA;

import java.util.ArrayList;
import java.util.Collections;

public class Array_List {

	public static void main(String[] args) {
		ArrayList<String> fruits = new ArrayList<String>();
		fruits.add("Apple");
		fruits.add("Orange");
		fruits.add("Grapes");
		fruits.add("Pineapple");
		fruits.add(0,"Mango");
		System.out.println("Arraylist after add operation:"+fruits);
		System.out.println("\nAccess an Item in Arraylist using get() Method:");
	    System.out.println("First Element in ArrayList:"+fruits.get(0));
		System.out.println("Second Element in ArrayList:"+fruits.get(1));
		System.out.println("Third Element in ArrayList:"+fruits.get(2));
		System.out.println("Fourth Element in ArrayList:"+fruits.get(3));
		System.out.println("Fifth Element in ArrayList:"+fruits.get(4));
		System.out.println("\nChange an Item in Arraylist using set() Method:");
		fruits.set(4,"Watermelon");
		System.out.println("Arraylist after set operation:"+fruits);
		System.out.println("\nRemove an Item in Arraylist using remove() Method:");
		fruits.remove(2);
		System.out.println("Arraylist after remove operation:"+fruits);
		
		System.out.println("\n Arraylist can sort using Collection.sort():");
		Collections.sort(fruits);
		System.out.println("Array list after sorting"+fruits);
		
		System.out.println("\nCheck an Item in Arraylist using contains() Method:");
		System.out.println("Apple is in the arraylist:"+fruits.contains("Apple"));
		System.out.println("Strawberry is in the arraylist:"+fruits.contains("Strawberry"));
		System.out.println("\nSize of ArrayList Measured  using size() Method:");
		System.out.println("Size ot the Arraylist is:"+fruits.size());
		System.out.println("\nclear all Item in Arraylist using clear() Method:");
		fruits.clear();
		System.out.println("Arraylist after clear operation:"+fruits);
		
		
		
		

	}

}
