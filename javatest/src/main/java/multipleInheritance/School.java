package multipleInheritance;

public class School implements Girls,Boys {
	
public void getDetailsBoys()
{
	
System.out.println("Total count");
}

	
public void getdetailsGirls()
{
	
System.out.println("Total count");
}	
public static void main(String[] args) {
	School s1 = new School();
	s1.getDetailsBoys();
	s1.getdetailsGirls();
	
}
}