package abstraction;

public class InterfaceAbstractChild implements InterfaceAbstractParent{
	public  void method1()
	{
		
		System.out.println("Java");
	}
	public static void main(String[] args) {
		InterfaceAbstractParent Ivp = new InterfaceAbstractChild();//upcasting
		Ivp.method1();
	}
}
