package projectTest;

public class Salaryslip  extends HraDetails{
	double totsal;
public void salarydetails()
{
	
totsal = basicpay + hra-pf-deduction+bonus;

}
public void displayDetailss()
{
	System.out.println("****EMPLOYEEE SALARY SLIP****");
	System.out.println("Basic pay:" +basicpay);
	System.out.println("Deduction:" +deduction);
	System.out.println("Hra:" +hra);
	System.out.println("PF:" +pf);
	System.out.println("Bonus:" +bonus);
	System.out.println("Annual salary:" +totsal);
	
	
}
public static void main(String[] args) {
	Salaryslip s1 = new Salaryslip();
	s1.consoleContent(56500,6500,760);
	s1.Hracalc();
	s1.salarydetails();
	s1.displayDetailss();
}
}
