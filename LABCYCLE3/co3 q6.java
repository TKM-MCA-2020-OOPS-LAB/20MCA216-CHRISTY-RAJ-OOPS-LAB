package JAVA;

import java.util.Scanner;

public interface calculation {
	void input();
	void area();
	void perimeter();
}
class Circle implements calculation{
int r;
double pi=3.14,a,p;
public void input() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the radius of circle");
	r=sc.nextInt();
	
}
public void area() {
	a=pi*r*r;
	System.out.println("area of the circle is:"+a);
	
}
public void perimeter() {
	p=2*pi*r;
	System.out.println("perimeter of the circle is:"+p);
}	
}
class Rectangle implements calculation{
int l,b,a,p;
public void input() {
Scanner sc1=new Scanner(System.in);
System.out.println("Enter the length of rectangle");
l=sc1.nextInt();
System.out.println("Enter the breadth of rectangle");
b=sc1.nextInt();
}
public void area() {
	a=l*b;
	System.out.println("area of the rectangle is:"+a);
}
public void perimeter() {
	p=2*(l+b);
	System.out.println("perimeter of the rectangle is:"+p);
	
}
}
public class Main {
		
	public static void main(String[] args) {
		int c=0;
		Circle obj=new Circle();
		Rectangle obj1=new Rectangle();
		
		while(c<3) {
		Scanner sc2=new Scanner(System.in);
		System.out.println("Enter your shape:\n1.Circle:\n2.Rectangle: ");
		c=sc2.nextInt();
		switch(c) {
		case 1:
			obj.input();
			obj.area();
			obj.perimeter();
			break;
		case 2:
			obj1.input();
			obj1.area();
			obj1.perimeter();
			break;
		 default:
			 System.out.println("You are wrong!");
		}
	 }
	
   }
	}
