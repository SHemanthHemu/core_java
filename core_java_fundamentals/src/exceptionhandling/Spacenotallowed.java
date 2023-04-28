package exceptionhandling;

class Spacenotallowedexception extends RuntimeException {

	public Spacenotallowedexception(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

}

public class Spacenotallowed {

	public static void main(String[] args) {
		String str1 = "run time";

		for (int i = 0; i < str1.length(); i++) {
			if (str1.charAt(i) == ' ') {
				try {
					throw new Spacenotallowedexception("You cannot have a space in user name ");

				} catch (Exception e) {
					System.out.println(e);
				}

			} else {
				

			}
		}

	}

}
