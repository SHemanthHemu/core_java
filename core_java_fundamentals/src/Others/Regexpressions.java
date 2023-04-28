package Others;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Regexpressions {
	public static void main(String[] args) {
		System.out.println("please enter your password");
		System.out.println("Please ensure that your Password should have atleast 1 upper case, 1 lower case, 1 digit,1 special \r\n"
				+ " character and the password must be atleast 8 chars. \r\n"
				+ " ");
		Scanner sc = new Scanner(System.in);
		String pass1 = sc.next();
		System.out.println(pass1);
		String str2 = "[A-Z]{1,}[a-z]{1,}[0-9]{1,}[$&+,:;=?@#|'<>.-^*()%!]{1,}";
		boolean regex = Pattern.compile(str2).matcher(pass1).matches();
		System.out.println(regex);
		
		if (regex == true ) {
			if(pass1.length() >= 8) {
				System.out.println("Your password is Strong enough ");
				System.out.println(pass1);
			}else {
				System.out.println("Your password must have minimum 8 charectors");
			}
			
		}
		else {
			System.out.println("Your  Password should have atleast 1 upper case, 1 lower case, 1 digit,1 special \r\n"
					+ " character");
		}
	}
	

}
