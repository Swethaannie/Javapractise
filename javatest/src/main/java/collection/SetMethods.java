package collection;

import java.util.HashSet;
import java.util.Set;

public class SetMethods {
public static void main(String[] args) {
	Set<String>s1 = new HashSet<String>();
	Set<String>s2 = new HashSet<String>();
	
	s1.add("Sneha");
	s1.add("Swetha");
	s1.add("Steeve");
	s2.add("Elder");
	s2.add("Middle");
	s2.add("Young");
	System.out.println(s1);
	System.out.println(s2);
	s1.addAll(s2);
	System.out.println(s1);
	System.out.println(s1.size());
	System.out.println(s1.isEmpty());
	System.out.println(s1.contains("Swetha"));
	System.out.println(s1.contains("Shemily"));
	System.out.println(s1.containsAll(s2));
	System.out.println(s2.containsAll(s1));
	s1.remove("Swetha");
	System.out.println(s1);
	s1.removeAll(s2);
	System.out.println(s1);
	s1.clear();
	System.out.println(s1);
	
	
	
	
	
}
}
