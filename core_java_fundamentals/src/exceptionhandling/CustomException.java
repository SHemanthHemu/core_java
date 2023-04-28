package exceptionhandling;

class Passwordexception extends RuntimeException {
	public Passwordexception(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
}
public class CustomException {

	public static void main(String[] args) {
		String pass = "qwerrrr";
		try {
			if (pass.length() < 10) {
				throw new Passwordexception("password must be grater than 10 chars");
			}
		} catch (Exception e) {
			System.out.println(e);

		}
		System.out.println("good");
	}

}
