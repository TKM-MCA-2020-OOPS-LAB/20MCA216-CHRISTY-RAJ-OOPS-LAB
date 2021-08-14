package JAVA;

import java.util.Scanner;
import java.util.Stack;

public class StackRemove {
	public static void main(String[] args) {

		
		Stack<String> stack1 = new Stack<String>();
		Scanner sc=new Scanner(System.in);
		 System.out.println("Enter Number Of Elements in your stack: ");
		 int num=sc.nextInt();
		 for(int i =0;i<num;i++)
		 {
			 System.out.println("Add Element: ");
			 String ele=sc.next();
			 stack1.add(ele);
			 
		 }
		 System.out.println();

		System.out.println("Initial Stack: " + stack1);
		
		 System.out.println("Enter the position of Element in stack to be removed: ");
		 int posit=sc.nextInt();
	
		String rem = stack1.remove(posit);

		System.out.println("\nRemoved element: "+ rem);

		
		System.out.println("\nFinal Stack: " + stack1);
 

}

}
