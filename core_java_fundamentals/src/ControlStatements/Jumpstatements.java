package ControlStatements;

public class Jumpstatements {
	static String[] users = {"user1","user2","user3","user4","user5","user6","user7","user8","user9","user10","user11","user12"};

	public static void main(String[] args) {
		for (int index=0 ; index < users.length; index++) {
			if (users[index].contentEquals("user6")) {
//				continue;
				break;
			}
			else {
				System.out.println(users[index]);
			}
			
		}
	}

}
