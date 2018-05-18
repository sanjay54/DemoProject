package HamburgarApp;

public class DeluxeBurgar extends Hamburgar {

	public DeluxeBurgar(String meat, double price) {
		super("Delux", meat, price, "White");
		super.addExtra1("32 Oz Drink", 1.99);
		super.addExtra2("Chips", 2.99);
	}

	@Override
	public void addExtra1(String item1, double price1) {
		System.out.println("Not allowed to add Extra on Deluxe Burgar");
	}

	@Override
	public void addExtra2(String item2, double price2) {
		System.out.println("Not allowed to add Extra on Deluxe Burgar");
	}

	@Override
	public void addExtra3(String item3, double price3) {
		System.out.println("Not allowed to add Extra on Deluxe Burgar");
	}

	@Override
	public void addExtra4(String item4, double price4) {
		System.out.println("Not allowed to add Extra on Deluxe Burgar");
	}
	
	
}
