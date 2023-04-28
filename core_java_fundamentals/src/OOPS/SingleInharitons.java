package OOPS;

class Parent{
	int a = 100;
	int b = 200;
}
class Chaild extends Parent {
	int c = 300;
	int d = 400;
}

public class SingleInharitons {
	public static void main(String[] args) {
		Chaild chaild = new Chaild();
		Parent parent = new Parent();
		
		System.out.println(chaild.a + "\t" +chaild.b +"\t"+chaild.c+"\t" + chaild.d);
		System.out.println(parent.a+"\t"+parent.b);
	}

}
