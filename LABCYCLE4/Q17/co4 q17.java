package JAVA;

import java.util.HashMap;
import java.util.Map;

public class map_interface {

	public static void main(String[] args) {
		Map<Integer,String> mi=new HashMap<>();
            mi.put(1, "CHRISTY");
	        mi.put(2, "SHANA");
	        mi.put(3, "ANILA");
	        System.out.println("Our inital Map is: "+ mi);
	        mi.put( (2), "RIYA");
	        mi.put((4), "NOVRIN");
	        System.out.println("Updated Map is" + mi);
	        mi.remove(2);
	        System.out.println("After remove 2nd entry, Our Final Map  is : "+mi);
	}

	}

