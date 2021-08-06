package JAVA;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class LL_remove {

	public static void main(String[] args) {
		LinkedList<String> list=new LinkedList<String>();
		   Scanner sc1=new Scanner(System.in);
		   System.out.println("Enter the number of employees:");
		   int num=sc1.nextInt();
		   for(int i=1;i<=num;i++){
	        System.out.print("Add the name of employee id="+i+":");
	        String m=sc1.next();
	        list.add(m);
	        }
	      System.out.println();
	      System.out.println("LinkedList After adding employees:");
	      Iterator<String> itr=list.iterator();
	      while(itr.hasNext()){
	        System.out.println(itr.next());
	      }
	     list.clear();
	     System.out.println("Linked list After removing employees: "+list);
	  }
	

	}

