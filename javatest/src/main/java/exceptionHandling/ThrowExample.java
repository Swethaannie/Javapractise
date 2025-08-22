package exceptionHandling;

public class ThrowExample {
public static void main(String[] args) {
	int age =12;
	if(age>=18)
	{
		
		System.out.println("Qualified for voting");
		
	}
	else {
		throw new ArithmeticException("Not valid to vote");
		
	}
}
}
