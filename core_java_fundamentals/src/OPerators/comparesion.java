package OPerators;

class customer{
	int id;
	String name ;
	
}

public class comparesion {
	
	public static void main(String[] args) {
		int a = 100;
		int b = 200;
		comparesion c1 = new comparesion();
		comparesion c2 = new comparesion();
		comparesion c3 = c2;
		customer customer1 = new customer();
		customer customer2 = new customer();
		customer1.id = 101;
		customer2.id = 101;
		
		System.out.println(a<b);
		System.out.println(a>b);
		System.out.println(a==b);
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c1==c2);
		System.out.println(c3==c2);
		System.out.println(customer1.id == customer2.id);
		System.out.println(customer1 == customer2);
	}

}
