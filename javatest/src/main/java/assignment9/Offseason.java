package assignment9;

public class Offseason {
	public void discount(double price )
	{
		
		double discountt = 0.15*price;
		price = price-discountt;
		System.out.println("OFFSEASON SALE");
		System.out.println(price );
		System.out.println(discountt);
	}
}
