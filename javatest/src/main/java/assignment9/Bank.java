package assignment9;

public class Bank {
	private  int pin;
public void userdetails(int  pin)
{
	
this.pin = pin;


}
public void validatedetails(long pin)
{
	
	if(pin==1001||pin==1234||pin==1212)
	{
	System.out.println("Valid pin ..You can withdrawn money" );	

}
	else
	{
		
		System.out.println("InValid pin" );	

	}
	}
}
