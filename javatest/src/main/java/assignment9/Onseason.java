package assignment9;

public class Onseason {
	public void discount(double price )
	{
		double discountt = 0.40*price;
		price = price -discountt;
		System.out.println("ONSEASON SALE");
		System.out.println(price );

		System.out.println(discountt);
	}
	public static void main(String[] args) {
		
		Offseason obj = new Offseason();
		obj.discount(2000);
		Onseason obj1 = new Onseason();
		obj1.discount(20000);
	}
}
