package SingleInheritance;

public class SingleInheritanceChild extends SInhDetails {
public void displayInfo()
{
System.out.println("Hello!!!");
}
public static void main(String[] args) {
	SingleInheritanceChild obj = new SingleInheritanceChild();
	obj.display();
	obj.displayInfo();
}
}
