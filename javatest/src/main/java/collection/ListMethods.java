package collection;

import java.util.LinkedList;
import java.util.List;

public class ListMethods {

	public static void main(String[] args) {
	List<String>s = new LinkedList<String>();
	s.add("Apple");
	s.add("Orange");
	s.add("Grapes");
	s.add("Pineapple");
	System.out.println(s);	
    System.out.println(s.get(0));
    s.set(0, "Kiwi");
    System.out.println(s);	
    System.out.println(s.size());
    System.out.println(s.isEmpty());
    s.remove(0);
    System.out.println(s);	
    System.out.println(s.contains("Orange"));	
    System.out.println(s.contains("Banana"));	
    System.out.println(s.indexOf("Apple"));	
    System.out.println(s.indexOf("Pineapple"));	
    s.add("Orange");
    System.out.println(s);	
    System.out.println(s.lastIndexOf("Orange"));	
	}

}
