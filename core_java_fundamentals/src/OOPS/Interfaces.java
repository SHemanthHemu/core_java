package OOPS;

interface A1{
	void m1();
	void m2();
	void m3();
}

class B1 implements A1{
	public void m1() {
		System.out.println("m1()");
	}
	public void m2() {
		System.out.println("m2()");
	}
	public void m3() {
		System.out.println("m3()");
	}
}

public class Interfaces {
	public static void main(String[] args) {
		A1 aa = new B1();
		aa.m1();
		aa.m2();
		aa.m3();
		
	}

}
