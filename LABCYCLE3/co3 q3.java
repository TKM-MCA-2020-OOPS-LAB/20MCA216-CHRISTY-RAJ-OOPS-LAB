package JAVA;

import java.util.Scanner;


public class person {
	String Name;
	String Gender;
	String Address;
	int Age;
public person(){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Name: ");
	Name=sc.next();
	System.out.println("Enter Gender: ");
	Gender=sc.next();
	System.out.println("Enter Address: ");
	Address=sc.next();
	System.out.println("Enter Age: ");
	Age=sc.nextInt();

}
}
class Employee extends person
{
	int Empid;
	String Company_name;
	String Qualification;
	double Salary;
	
	
	public Employee()
	{
		
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter employeid: ");
		Empid=sc1.nextInt();
		System.out.println("Enter Company_name: ");
		Company_name=sc1.next();
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter Qualification: ");
		Qualification=sc1.next();
		System.out.println("Enter Salary: ");
		Salary=sc1.nextDouble();
		
	}
}
class Teacher extends Employee
{
	String department;
	String subject;
	int Teacherid;
	
	
	public Teacher()
	{
		
		Scanner sc2=new Scanner(System.in);
		System.out.println("Enter department: ");
		department=sc2.next();
		System.out.println("Enter Subject: ");
		subject=sc2.next();
		System.out.println("Enter Teacherid:");
		Teacherid=sc2.nextInt();
	}
	
	public void display()
	{

		
		System.out.println("********Details********");
		System.out.println("Name: "+Name);
		System.out.println("Gender"+Gender);
		System.out.println("Address: "+Address);
		System.out.println("Age: "+Age);
		System.out.println("Employee id: "+Empid);
		System.out.println("Company_name"+Company_name);
		System.out.println("Qualification: "+Qualification);
		System.out.println("Salary: "+Salary);
		System.out.println("Address: "+Address);
		System.out.println("Department: "+department);
		System.out.println("Subject: "+subject);
		System.out.println("Teacherid: "+Teacherid);
	}

	
	

	public static void main(String[] args) {
		Scanner sc4=new Scanner(System.in);
		int i;
		System.out.println("Enter limits: ");
		int n=sc4.nextInt();
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
