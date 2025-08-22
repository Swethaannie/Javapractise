package exceptionHandling;

public class ThrowsExample {
public static void main(String[] args) throws VotingException {
	int age =12;
	if(age>=18)
	{
		
		System.out.println("Qualified for Voting");
		
	}
	else {
		
	throw new VotingException("Not valid for voting");
		
	}
}
}
