package JAVA;

import java.util.Scanner;
public class authentication{

public static void main(String[] args) {
	 Scanner s1 = new Scanner(System.in);
	  String Username, Password;
	  
	  System.out.print("Enter username :: ");
	  Username = s1.nextLine();
	  
	  System.out.print("Enter password :: ");
	  Password = s1.nextLine();
	  
     int name=Username.length();
	  int length=Password.length();
try {

	if(name<5 && length<5) {
		throw new invalidexception("Check Your Username or Password");
	}
		else {
			 System.out.println("\nLOGIN SUCCESSFUL!!!!!\n");   
		}
	}
		catch(invalidexception e){
			System.out.println(e.getMessage());
			
		}
		
	}
	}

	