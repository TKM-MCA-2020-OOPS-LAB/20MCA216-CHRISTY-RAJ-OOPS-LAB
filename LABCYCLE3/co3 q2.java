package JAVA;

import java.util.Scanner;

public class EMPLOYE {
	int Empid;
	String Name;
	double Salary;
	String Address;
	public EMPLOYE()
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter Employee id: ");
		Empid=sc.nextInt();
		System.out.println("Enter Name: ");
		Name=sc.next();
		System.out.println("Enter Salary: ");
		Salary=sc.nextDouble();
		System.out.println("Enter Address: ");
		Address=sc.next();
		Scanner sc1=new Scanner(System.in);
	}

}

	class Teacher extends EMPLOYE
	{
		String department;
		String subject;
		
		
		public Teacher()
		{
			Scanner sc=new Scanner(System.in);

			
			Scanner sc1=new Scanner(System.in);
			System.out.println("Enter department: ");
			department=sc1.next();
			System.out.println("Enter Subject: ");
			subject=sc1.next();
		}
		
		public void display()
		{

			
			System.out.println("********Employee Details********");
			System.out.println("Employee id: "+Empid);
			System.out.println("Name: "+Name);
			System.out.println("Salary: "+Salary);
			System.out.println("Address: "+Address);
			System.out.println("Department: "+department);
			System.out.println("Subject: "+subject);
		}
	


	public static void main(String[] args) 
	{
		Scanner sc3=new Scanner(System.in);
		int i;
		System.out.println("Enter number of employees: ");
		int n=sc3.nextInt();
		Teacher t[]=new Teacher[n];
		for(i=0;i<n;i++) 
		{
			t[i]=new Teacher();
			
	
			
		}
		
		for(i=0;i<n;i++) 
		{
			
			
			t[i].display();
		}
		
	}
	
	
	}
	
	




	
