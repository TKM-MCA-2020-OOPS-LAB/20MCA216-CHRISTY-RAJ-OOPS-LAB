package JAVA;

import java.util.Scanner;

public class Student {
	String name;
	int maths_mark;
	int science_mark;
	int social_mark;
	int hindi_mark;
	int english_mark;
	public Student() {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the name of student");
	name=sc.nextLine();
	System.out.println("enter the maths mark of student");
	maths_mark=sc.nextInt();
	System.out.println("enter the science mark of student");
	science_mark=sc.nextInt();
	System.out.println("enter the social mark of student");
	social_mark=sc.nextInt();
	System.out.println("enter the hindi mark of student");
	hindi_mark=sc.nextInt();
	System.out.println("enter the english mark of student");
	english_mark=sc.nextInt();
}
}
class sports extends Student{
	int item_1;
	int item_2;
	public sports() {
    Scanner sc1=new Scanner(System.in);
	System.out.println("enter the score item_1 ");
    item_1=sc1.nextInt();
	System.out.println("enter the score of item_2");
	item_2=sc1.nextInt();
}
}
class results extends sports{
	
	public void display() {
	 System.out.println("Name of student:"+name);
	 System.out.println("............STUDENTS ACADAMIC RESULT DETAILS...............");
	 System.out.println("maths mark of student:"+maths_mark);
	 System.out.println("Science mark of student:"+science_mark);
	 System.out.println("Social mark of student:"+social_mark);
	 System.out.println("hindi mark of student:"+hindi_mark);
	 System.out.println("english mark of student:"+english_mark);
	 System.out.println("............STUDENTS TOTAL ACADAMIC SCORE DETAILS...............");
	 System.out.println("Total score:"+(maths_mark+science_mark+social_mark+ hindi_mark+ english_mark));
	 System.out.println("............STUDENTS SPORT SCORE DETAILS...............");
	 System.out.println("score of item 1of student:"+item_1);
	 System.out.println("score of item 2 of student:"+item_2);
	 System.out.println("............STUDENTS TOTAL SPORTS SCORE DETAILS...............");
	 System.out.println("TotaL Score: "+(item_1+item_2));
	}
	

	public static void main(String[] args) {
		
		Scanner sc3=new Scanner(System.in);
		int i;
		 System.out.println("Enter of number of student:");
		 int n=sc3.nextInt();
		results r[]=new results[n];
	for(i=0;i<n;i++) {
		r[i]=new results();
		
	}
	for(i=0;i<n;i++) {
		r[i].display();
		
	}
	}
}
		
		 
		 
		

	