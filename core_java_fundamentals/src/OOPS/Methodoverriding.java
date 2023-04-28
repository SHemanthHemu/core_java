package OOPS;

class A {
	public void m1() {
		System.out.println("this is method m1 from class a");
	}
	public void m2() {
		System.out.println("this is method m2 from class a");
	}
}
class B extends A {
	
	public void m2() {
		System.out.println("this is method m2 from class b");
	}
}

public class Methodoverriding {
	public static void main(String[] args) {
		
		A aa = new A();
		B bb = new B();
		bb.m2();
		 aa.m2();
	}

}
