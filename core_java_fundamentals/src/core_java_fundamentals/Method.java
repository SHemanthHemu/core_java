package core_java_fundamentals;

public class Method {
	 int square(int number) {
		return number*number;		
	}
	 
	 static byte a =100;
	 short b =200;
	 
	 void nonstaticmathod() {
		 System.out.println("non static method");
	 }
	 
	 void secondnonstaticmethod() {
		 nonstaticmathod();
//		 staticmethod();
		 System.out.println("second non static method");
		 System.out.println(Method.a);
		 System.out.println(b);
	 }
	 static void staticMethod() {
		   System.out.println("Static method executed");   

	 }
	 static void secondStaticMethod() {
		   System.out.println(Method.a);
		   System.out.println(new Method().b);
	   }

	public static void main(String[] args) {
		Method obj1= new Method();
		System.out.println(obj1.square(10));
		Method.staticMethod();
		Method method1 = new Method();
		method1.nonstaticmathod();
		method1.secondnonstaticmethod();
		Method.secondStaticMethod();
		
	}
}
