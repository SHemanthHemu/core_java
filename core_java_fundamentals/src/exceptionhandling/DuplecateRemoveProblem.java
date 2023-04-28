package exceptionhandling;

import java.util.Arrays;

public class DuplecateRemoveProblem {
	
//	Remove the duplicates from the array. 

//	{10,10,2,2,3,3,3,3,3,3,4,5,10,2,34,12,33,4}
	
	public static void main(String[] args) {
		int[] arr =new int[] {10,10,2,2,3,3,3,3,3,3,4,5,10,2,34,12,33,4};
		
		
		
		for (int i = 0 ; i<arr.length;i++) {
			for (int j = i+1;j<arr.length;j++) {
				if (arr[i] == arr[j]) {
					System.out.println(arr[j]);
					
				}
				
			}
		}
		
	} 


}
