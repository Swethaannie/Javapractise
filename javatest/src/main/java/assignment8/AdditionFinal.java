package assignment8;

public class AdditionFinal extends Additionresult {
public void display( int a,int b)
{
	System.out.println("***Result ***");
int sum=  super.addTwoNum(a,b);
System.out.println("Sum :" + sum);
sum = sum%10;
if (sum==0)
{
	
System.out.println("Divisible by 10");
}
else
{
	System.out.println("Not Divisible by 10");	


}

}
public static void main(String[] args) {
	AdditionFinal obj = new AdditionFinal();
	
	obj.display(5, 6);
	obj.display(10, 10);
	
}
}
