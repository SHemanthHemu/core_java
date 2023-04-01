package Core_java;

public class methods {
	
	static byte a =100;
	 short b = 200;
	
	
	void nonstaticmethod() {
		System.out.println("First non static method");
		
	}
	
	void secondNonStaticMethod() {
		System.out.println("second non static method");
		System.out.println(methods.a);
		System.out.println(b);
		nonstaticmethod();
		staticmethods();
//		secondStaticMethod();
		
		
	}
	static void staticmethods() {
		System.out.println("First static method");
		
	}
	
	static void secondStaticMethod() {
		System.out.println("second static method");
		System.out.println(methods.a);
		System.out.println(new methods().b);
	}
	
	public static void main(String[] args) {
//		methods.staticmethods();
		methods method = new methods();
		
		method.secondNonStaticMethod();
	}
}
