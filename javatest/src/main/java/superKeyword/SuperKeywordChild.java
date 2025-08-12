package superKeyword;

public class SuperKeywordChild  extends  SuperKeywordParent{
int a =2;
public void ddisplay()
{
	System.out.println(a);
	  //System.out.println(super.a);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
  SuperKeywordChild sc1 = new SuperKeywordChild();
  sc1.ddisplay();
	}

}
