package ControlStatements;

import java.util.Scanner;

public class IfStatement {
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("user name");
			String username= sc.next();
			System.out.println("password");
			String password= sc.next();
			
			if (username.contentEquals("Hemu") && password.contentEquals("@123")) {
				System.out.println("login success...");
			}
			else {
				System.out.println("login failure");
			}
			
			sc.close();
		
	}

}
