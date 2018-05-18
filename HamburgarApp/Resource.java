package HamburgarApp;

public class Resource {
	private int a;
	private int b;
	
	public int cal() {
		return a+b;
	}
	
	public int multiply() {
		return a*b;
	}
	
	public int division() {
		return a/b;
	}
	
	public void setValue(int x, int y) {
		this.a=x;
		this.b=y;
	}
}
