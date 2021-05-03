package JAVA;

import java.util.Scanner;

public class Symmetricmatrix {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter the number of rows");
        int rows = sc.nextInt();
        System.out.println("Enter the number columns");
        int cols = sc.nextInt();
        int matrix[][] = new int[rows][cols];
        		System.out.println("enter the elements:");
        for(int i=0;i<rows;i++) {
        	for(int j=0;j<cols;j++) {
        		matrix[i][j]=sc.nextInt();
        	}
        }
        System.out.println("printing the input matrix : ");
        for(int i=0;i<rows;i++) {
        	for(int j=0;j<cols;j++) {
        		System.out.println(matrix[i][j]+"\t");
        	}
        	System.out.println();
        }
        if(rows!=cols)
        {
        	System.out.println("The given matrixe is not square matrixe ,it is not a symmetricmatrix");
        }
        else {
        	boolean Symmetric = true;
        	for(int i=0;i<rows;i++) {
            	for(int j=0;j<cols;j++) {
            		if(matrix[i][j]!=matrix[j][i]) {
            		Symmetric = false;
            		break;
            		}
            	}
        	}
        	if(Symmetric) {
        		System.out.println("The matrix is symmetric");
        	}
        		else {
        			System.out.println("The matrix is not symmetric");
        		}
        	}
        	sc.close();
        }
	}
        	
        	
