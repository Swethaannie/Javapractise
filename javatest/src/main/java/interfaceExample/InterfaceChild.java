package interfaceExample;
//MultipleInheritance
public class InterfaceChild implements InterfaceParent,InterfaceParent1{
public void method1()
{
	System.out.println("Hello");

}
public void method2()
{
	System.out.println("wow");

}
public static void main(String[] args) {
	InterfaceChild obj = new InterfaceChild();
	obj.method1();
	obj.method2();
}
}
