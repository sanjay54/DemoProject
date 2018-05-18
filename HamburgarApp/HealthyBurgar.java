package HamburgarApp;

public class HealthyBurgar extends Hamburgar {
	private String healthyItem1;
	private double healthyItem1Price;
	
	private String healthyItem2;
	private double healthyItem2Price;
	
	public HealthyBurgar(String meat, double price) {
		super("Healthy Burgar", meat, price, "Brown Rye");
	}
	
	public void addHealthyItem1(String item1, double price1) {
		this.healthyItem1=item1;
		this.healthyItem1Price=price1;
		System.out.println("Added "+healthyItem1+" with an extra of $"+healthyItem1Price );
	}
	
	public void addHealthyItem2(String item2, double price2) {
		this.healthyItem2=item2;
		this.healthyItem2Price=price2;
		System.out.println("Added "+healthyItem2+" with an extra of $"+healthyItem2Price );
	}

	@Override
	public double totalPrice() {
		double totalPrice=super.totalPrice();
		if(healthyItem1!=null) {
			totalPrice+=healthyItem1Price;
		}
		if(healthyItem2!=null) {
			totalPrice+=healthyItem2Price;
		}
		return totalPrice;
	}
	
	
	
	
}
