package projectTest;

public class Palindrome {
public void palinTest(String n )
{
String rev = "";
for(int i=n.length()-1;i>=0;i--)
{
rev = rev+ n.charAt(i);
}
if(n.equals(rev))
{
	
System.out.println("Palindrome" );

}

else
{
	System.out.println(" Not Palindrome" );	

}
}

	public static void main(String[] args) {

Palindrome p1 = new Palindrome();
p1.palinTest("JAVA");
p1.palinTest("MALAYALAM");
	}

}
