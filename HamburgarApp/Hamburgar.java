package HamburgarApp;

public class Hamburgar {
	private String name;
	private String meat;
	private double price;
	private String bread;
	
	private String item1;
	private double item1Price;
	
	private String item2;
	private double item2Price;
	
	private String item3;
	private double item3Price;
	
	private String item4;
	private double item4Price;
	
	public Hamburgar(String name, String meat, double price, String bread) {
		this.name = name;
		this.meat = meat;
		this.price = price;
		this.bread = bread;
		System.out.println(this.name+" Hamburgar with "+this.meat+" and "+this.bread+" bread at $"+this.price);
	}
	
	public void addExtra1(String item1,double price1) {
		this.item1=item1;
		this.item1Price=price1;
		System.out.println("Added "+item1+" with an extra of $"+price1 );
	}
	
	public void addExtra2(String item2,double price2) {
		this.item2=item2;
		this.item2Price=price2;
		System.out.println("Added "+item2+" with an extra of $"+price2 );
	}
	
	public void addExtra3(String item3,double price3) {
		this.item3=item3;
		this.item3Price=price3;
		System.out.println("Added "+item3+" with an extra of $"+price3 );
	}
	
	public void addExtra4(String item4,double price4) {
		this.item4=item4;
		this.item4Price=price4;
		System.out.println("Added "+item4+" with an extra of $"+price4 );
	}
	
	public double totalPrice() {
		double hamburgarPrice=this.price;
		if(item1!=null) {
			hamburgarPrice+=item1Price;
		}
		if(item2!=null) {
			hamburgarPrice+=item2Price;
		}
		if(item3!=null) {
			hamburgarPrice+=item3Price;
		}
		if(item4!=null) {
			hamburgarPrice+=item4Price;
		}
		return hamburgarPrice;
	}
}
