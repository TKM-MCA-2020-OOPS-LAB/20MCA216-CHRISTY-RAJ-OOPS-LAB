package JAVA;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class dequeue {

	public static void main(String[] args) {
		Deque<Integer> dequeue = new ArrayDeque<Integer>(); 
	    Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of elements:");
		int n=sc.nextInt();
		for(int i =0;i<n;i++)
		{
			System.out.println("Enter element : ");
			int ele=sc.nextInt();
			dequeue.add(ele);
	 
		}
	   
	    // Popping the element  
	    dequeue.pop();  
	    System.out.println("After popping : ");  
	    for (Integer integer : dequeue) {  
	        System.out.println(integer);  
	    }  
	    System.out.println("Enter the element to be deleted : "); 
	    int ele=sc.nextInt();
	    dequeue.remove(ele);  
	    System.out.println("Removing the element:"+dequeue); 
	}

}
