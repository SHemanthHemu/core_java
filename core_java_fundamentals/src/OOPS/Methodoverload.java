package OOPS;

class Add{
	public void add(int a , int b) {
		System.out.println(a+b);
	}
	public void add(int a , int b , int c) {
		System.out.println(a+b+c);
	}
	public void add(float a , float b , float c) {
		System.out.println(a+b+c);
	}
	public void add(float a , float b) {
		System.out.println(a+b);
	}
  	}

public class Methodoverload {
	public static void main(String[] args) {
		Add a = new Add();
		a.add(10, 20);
	}
	

}
