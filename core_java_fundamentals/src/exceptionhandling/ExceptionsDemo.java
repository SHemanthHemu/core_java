package exceptionhandling;

public class ExceptionsDemo {

	public static void main(String[] args) {
		int[] arr = {0,1,2,3,4,5,6};
		
		System.out.println(arr[1]);
		
		
		try {
			System.out.println(arr[10]);
		}
		catch(Exception e){
			System.out.println(e);
			System.out.println(arr[11]);			
	    }
		finally {
			System.out.println("system down ");
		}
}
}
