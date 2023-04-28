package exceptionhandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class Exceptions {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("enter first number");
		int A = Integer.parseInt(br.readLine());
		System.out.println("enter second number");
		int B = Integer.parseInt(br.readLine());
		
		try {
			int result = A/B;
			System.out.println(result);
		}
		catch(Exception e){
			System.out.println(e);
		}
		
	}

}
