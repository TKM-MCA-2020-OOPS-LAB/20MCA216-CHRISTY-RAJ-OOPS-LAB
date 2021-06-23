package JAVA;

import java.util.Scanner;
public class bubblesort {

	public static void main(String[] args) {
		
		int n,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size :");
		n=sc.nextInt();
		System.out.println("Enter Your Elements :");
		
		int arr[] = new int[n];
		for(i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		bubble  obj= new bubble  ();
		System.out.println("Before Sorting the Array is:");
		obj.display(arr,n);
		 obj.sort(arr,n);
		 
		System.out.println("\nSorted Array is :");
		 obj.display(arr,n);
	}
}
class bubble {
	
	void sort(int arr[],int n) {
		int temp;
		int i,j;
		for( i=0;i<arr.length-1;i++) {
			for(j=0;j<arr.length-1-i;j++) {
				
				if(arr[j]>arr[j+1]) {
					 temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	
	}
	
	void display(int arr[],int n) {
		for (int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
			}
   
}
}