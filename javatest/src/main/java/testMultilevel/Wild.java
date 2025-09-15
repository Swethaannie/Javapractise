package testMultilevel;

public class Wild extends Animals {
	public void status()
	{
	
	System.out.println("May be endangered");
}
	public static void main(String[] args) {
		Wild w1 = new Wild();
		w1.foods();
		w1.details();
		w1.status();
	}
}