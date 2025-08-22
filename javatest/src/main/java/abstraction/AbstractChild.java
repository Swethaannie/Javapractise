package abstraction;

public class AbstractChild extends AbstractParent{
public void method1()
{
System.out.println("Hai java");	
}
public static void main(String[] args) {
	AbstractParent obj = new AbstractChild();
	obj.method1();
	obj.method2();
	
}
}
