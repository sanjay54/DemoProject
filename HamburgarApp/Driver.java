package HamburgarApp;

public class Driver {

	public static void main(String[] args) {
		Hamburgar h1=new Hamburgar("Basic", "Beef", 5.69, "White");
		
		h1.addExtra1("Tomato", 0.5);
		h1.addExtra2("Cheese", 1.5);
		h1.addExtra3("Mushroom", 0.99);
		h1.addExtra4("Olives", 0.99);
		System.out.println("The total price for burgar is $"+h1.totalPrice()+"\n");
		
		HealthyBurgar hb=new HealthyBurgar("Becon", 7.99);
		hb.addExtra1("Cheese", 1.5);
		hb.addExtra2("Olives", 0.99);
		hb.addHealthyItem1("Low Fat Cream", 2.5);
		hb.addHealthyItem2("Diet Coke", 2.99);
		System.out.println("The total price for burgar is $"+h1.totalPrice()+"\n");
		
		DeluxeBurgar db=new DeluxeBurgar("Chicken", 7.99);
		db.addExtra1("Not applicable", 50.77);
		System.out.println("The total price for burgar is $"+db.totalPrice()+"\n");
	}

}
