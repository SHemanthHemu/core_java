package ControlStatements;

import java.util.Scanner;

public class Switch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose your course");
		String choice= sc.next();
		switch (choice) {
		case "java": System.out.println("you choosed java");break;
		case "python": System.out.println("you choosed python");break;
		case "C": System.out.println("you choosed C");break;
		case "R": System.out.println("you choosed R");break;
		case "React": System.out.println("you choosed React");break;
		default:System.out.println("wrong input");
		}
		
		sc.close();
	}

}
