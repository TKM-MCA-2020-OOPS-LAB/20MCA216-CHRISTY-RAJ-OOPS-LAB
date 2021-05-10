package JAVA;

import java.util.Scanner;

public class Overload {

	double a;
	int s;
		double area()
		{
			Scanner sc1=new Scanner(System.in);
			System.out.println("Enter value of s: ");
			int s=sc1.nextInt();
			a=s*s;
			System.out.println("Area of square: "+a);
			return a;
		}
		double area(int r)
		{
			a=3.14*r*r;
			System.out.println("Area of circle: "+a);
			return a;
		}
		double area(int l,int b)
		{
			a=l*b;
			System.out.println("Area of rectangle "+a);
			return a;
		}
	

	public static void main(String[] args) {
		Overload obj=new Overload();
Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter value of r: ");
		int r=sc.nextInt();
		System.out.println("Enter value of l and b: ");
		int l=sc.nextInt();
		int b=sc.nextInt();
		
		obj.area();
		obj.area(r);
		obj.area(l, b);
		

	}
		
				

	}


