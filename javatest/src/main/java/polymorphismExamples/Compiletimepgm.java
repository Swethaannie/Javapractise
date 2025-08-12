package polymorphismExamples;

public class Compiletimepgm {
	public void compileMethod()
	{
		System.out.println("***Personal Details***");
	}
	
	public void compileMethod(int id ,int age)
	{
		System.out.println("Id:" +id);
		System.out.println("Age:" +age);
	}
	public void compileMethod(long num ,String name)
	{
		System.out.println("Num:" +num);
		System.out.println("Name:" +name);
	}
public static void main(String[] args) {
	Compiletimepgm ct1 = new Compiletimepgm();
	ct1.compileMethod();
	ct1.compileMethod(4, 20);
	ct1.compileMethod(9565784440l,"Swetha" );//l for long integer.
}
}
