package ControlStatements;

import java.util.Scanner;

public class returnStatement {
	
	static boolean authentication (String username , String password ) {
		if (username.contentEquals("Hemanth") && password.contentEquals("Hemu")) {
			return true;
		}else {
			return false;
		}
	}
	static int generateotp (boolean isuserlogin) {
		int otp = 0;
		if(isuserlogin) {
//			code for generate otp;
			otp = 1234;
					
		}
		return otp;
//		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter user name:");
		String username = sc.next();
		System.out.println("Enter user password:");
		String password = sc.next();
		boolean result = authentication(username,password);
		
		if (result) {
			System.out.println("user log in Successfully...");
		}
		else {
			System.out.println("user log in faild.....");
		}
		sc.close();
	}

}
