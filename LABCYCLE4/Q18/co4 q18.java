package JAVA;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class treemap {

	public static void main(String[] args) {
		Map<String, String> hm = new HashMap<>();
	      hm.put("1","DREAM");
		  hm.put("2","HARDWORK");
		  hm.put("3","SUCESS");
	      
	      System.out.println("HashMap is:"+hm);
	      Map<String, String> tm = new TreeMap<>();
	      tm.putAll(hm);
	      System.out.println("TreeMap:"+tm);

	}

}
