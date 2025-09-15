package assignment11;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;


public class RetriveElement {
	public static void main(String[] args) {
		ArrayList<String> s = new ArrayList<>();
		s.add("R");
		s.add("p");
		s.add("G");
		s.add("S");
		System.out.println(s);	
		s.remove(0);
	    System.out.println(s);	
	   
	    Iterator<String> s1 = s.iterator();
	    while (s1.hasNext()) {
	          
            
            String n = s1.next(); 
            System.out.println(n);      
        }
	    s.remove("G");
	    System.out.println(s);	
	    String key = "o";

        // Using contains() and indexOf()
        if (s.contains(key)) {
            System.out.println(key + " found at index: " + s.indexOf(key));
        } else {
            System.out.println(key + " not found ");
        }
		    
}
}
