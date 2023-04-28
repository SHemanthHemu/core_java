package OOPS;

interface A2{
	void m1();
	void m2();
	void m3();
}

abstract class A2impl implements A2{

	@Override
	public void m1() {
		System.out.println("m1()");
		}
	@Override
	public void m2() {
		System.out.println("m2()");		
	}
	@Override
	public abstract void m3(); 
}

class B2 extends A2impl{

	@Override
	public void m3() {
		System.out.println("m3() from B2");	
		
	}
	
}
public class Abstractclass {
	public static void main(String[] args) {
		B2 b=new B2();
		b.m1();
		b.m2();
		b.m3();
		
	}

}
