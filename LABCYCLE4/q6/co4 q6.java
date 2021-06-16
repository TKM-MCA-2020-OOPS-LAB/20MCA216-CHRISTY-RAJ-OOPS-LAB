package JAVA;
import java.io.*;
import java.lang.*;
import java.util.Scanner;

public class Thread_factorial {

	public static void main(String[] args)  throws InterruptedException {
		
		ThreadC fib = new ThreadC();
		Thread c = new Thread(fib);
		ThreadD even = new ThreadD();
		Thread d= new Thread(even);
		c.start();
		c.sleep(200);
		d.start();
		d.sleep(200);

	}
}
class ThreadC implements Runnable{
	public void  run() {
		int n,firstterm=0,secondterm=1;
            Scanner sc=new Scanner(System.in);
		System.out.println("Enter the limit for fibonacci series:");
		n=sc.nextInt();
		System.out.println("FIBONACCI SERIES ARE:");
		
		for (int i = 1; i <= n; ++i) {
		      System.out.print(firstterm + " ");
		      System.out.print("\n");
		      
		      int nextterm = firstterm + secondterm;
		      firstterm = secondterm;
		      secondterm = nextterm;
		}
		System.out.println("\n");
	 System.out.println(" PRINTING EVEN NUMBERSR\n");
	 System.out.println("Enter lower limit:");
	   
	 
}
}
	

class ThreadD implements Runnable
{
public  void run()
{
	 
	 int lower,upper;
		Scanner sc1=new Scanner(System.in);
		lower=sc1.nextInt();
		System.out.println("Enter upper limit:");
	    upper=sc1.nextInt();
	    System.out.println("even numbers between " + lower + " and " + upper+ " are:");
		    
	    for (int i =lower;i<= upper;i++)
	    {

	        if (i%2!=0)
	            continue;
	        
	       else 
	            {
	              System.out.println(i+" ") ; 
	            }
	        }
	 
	    System.out.print("\n");
	}
	
}



