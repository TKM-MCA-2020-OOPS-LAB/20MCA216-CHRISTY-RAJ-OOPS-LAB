package JAVA;

import java.util.LinkedHashSet;

class Studentinfo {  
int id;  
String name,Department,Gender;  
int Age;  
public Studentinfo(int id, String name, String Department, String Gender, int Age) {  
    this.id = id;  
    this.name = name;  
    this.Department = Department;  
    this.Gender =Gender;  
    this.Age = Age;  
}  
}  

public class Linkedhashset {

	public static void main(String[] args) {
		LinkedHashSet<Studentinfo> hs=new LinkedHashSet<Studentinfo>();    
	    Studentinfo b1=new Studentinfo(101,"CHRISTY RAJ","MCA","FEMALE",22);  
	    Studentinfo b2=new Studentinfo(102,"PRIYA","MTECH","FEMALE",23);  
	    Studentinfo b3=new Studentinfo(103,"BIBIN","MBA","MALE",23);  
	    hs.add(b1);  
	    hs.add(b2);  
	    hs.add(b3);   
	    for(Studentinfo b:hs){  
	    System.out.println(b.id+" "+b.name+" "+b.Department+" "+b.Gender+" "+b.Age);  
	    }  
	}  
	  

	}

