package ControlStatements;

public class DoWhile {
	
	static String[] users = {"user1","user2","user3","user4","user5","user6","user7","user8","user9","user10","user11","user12"};
	
	static int index = 0;
	static int threshold = 4;
	static int size = users.length;
	static int pagination = 1 ;
	static int counter = 4 ;
	
	public static void main(String[] args) {
		
		do {
			if(index < counter) {
				System.out.println(users[index]);
				index++;
			}
			else {
				System.out.println("pagination " +pagination+ " completed");
				counter=counter+threshold;
				pagination++;
			}
		}
		while(index != size) ;
	}

}
