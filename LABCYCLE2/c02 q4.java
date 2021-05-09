package JAVA;

import java.util.Scanner;

public class Employee {
	int eNo;
	String eName;
	double eSalary;
	void getdata()
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("entet id ");
		eNo=sc.nextInt();
		System.out.println("enter name");
		eName=sc.next();
		System.out.println("enter salary");
		eSalary=sc.nextDouble();
	}
	void display()
	{
		System.out.println("employee id is : "+ eNo);
		System.out.println("employee name is : "+ eName);
		System.out.println("employee salary is : "+ eSalary);
	}
	
	
	public static void main(String[] args) {
		Scanner sc1=new Scanner(System.in);
		int i,n,c,f=0;
		System.out.println("enter the number of employees");
		n=sc1.nextInt();
		Employee e[]=new Employee[n];
		for(i=0;i<n;i++) {
			e[i]=new Employee();
			e[i].getdata();
		}
		System.out.println("Employee details are :\n");
		for(i=0;i<n;i++) {
			e[i].display();
		}
		System.out.println("Enter the id to be search");
		c=sc1.nextInt();
	for(i=0;i<n;i++) {
		if(c==e[i].eNo) {
			f=1;
			break;
		}
	}
	if(f==1) {
		System.out.println("details of employee is ");
		e[i].display();
	}
	else
		System.out.println("item isnt found");	

		

	}

}
