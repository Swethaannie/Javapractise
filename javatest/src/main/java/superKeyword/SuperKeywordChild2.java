package superKeyword;

public class SuperKeywordChild2 extends SuperKeywordParent {
public void display()
{
System.out.println("hello")	;
super.display();
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperKeywordChild2 sc2 = new SuperKeywordChild2();
		sc2.display();
	}

}
