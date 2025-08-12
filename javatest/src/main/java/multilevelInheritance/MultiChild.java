package multilevelInheritance;

public class MultiChild extends MultiInterChild {
	public void multiMethod3()
	{
		System.out.println("Child");
	}
	public static void main(String[] args) {
		
		MultiChild obj = new MultiChild();
		obj.multiMethod1();
		obj.multiMethod2();
		obj.multiMethod3();
	}

}
