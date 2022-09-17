package Poly;
class Human{
	public void display() {
	System.out.println("in human");
	}
}
class Male extends Human{
	public void fly() {
	System.out.println("in male");
	}
}
class Female extends Human{
	public void fry() {
	System.out.println("in female");
	}
}

public class Main {
	
	public static void main(String[] args) {
	Human h=new Human();
	System.out.println(h instanceof Human);
	System.out.println(h instanceof Male);
	System.out.println(h instanceof Female);
	System.out.println("...................");
	Human h1=new Male();
	System.out.println(h1 instanceof Human);
	System.out.println(h1 instanceof Male);
	System.out.println(h1 instanceof Female);
	System.out.println("...................");
	}
}