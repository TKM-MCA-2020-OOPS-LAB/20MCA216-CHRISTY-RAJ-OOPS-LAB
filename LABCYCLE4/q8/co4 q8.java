package JAVA;

import java.util.Scanner;

public class stack {
    final int max=100;
	int s[]=new int[max];
	 
	int top=-1;
	public static void main(String[] args) {
		 int q=1;
		stack m = new stack();
	System.out.println("PROGRAMME TO PERFORM STACK OPERATION");
		System.out.println("-------------------------------------");
       while(q!=0) {
   	 System.out.println("enter 1.push\n 2.pop\n3.Exit\n"); 
   	 System.out.println("enter your choice"); 
   	 Scanner sc = new Scanner(System.in);
   	 int ch = sc.nextInt();
   	 switch(ch) {
   	 case 1:
   		 System.out.println("enter the element to be pushed");
   		 int ele = sc.nextInt();
   	    m.push(ele);
   	    break;
   	 case 2:
   		 System.out.println("enter the element to be poped");
   		 int elem = sc.nextInt();
   	    m.pop(elem);
   	    break;
   	 case 3:
   		break;
   		default: System.out.println("invalid choice");
   		 
   	 }
   	 
   	 
    }
	}



	void push(int ele) {
		if(top>=max-1) {
			System.out.println("Stack Overflow");
		}
			else {
				s[++top]=ele;
			
		}
	}
	void pop(int elem) {
		if(top<0) {
			System.out.println("Stack Innerflow");
		}
			else {
				s[top--]=elem;
			
		}
	}
}

	