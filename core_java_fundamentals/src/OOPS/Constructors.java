package OOPS;

class Customer {
	int cid;
	String name;
	String accno;
	long balance;
	String idproof;
	String Dobproof;
//	parametarized constructor
	public Customer(int cid ,String name,String accno,long balance,String idproof,String Dobproof) {
		this.cid=cid;
		this.name=name;
		this.accno = accno;
		this.balance = balance;
		this.idproof = idproof;
		this.Dobproof=Dobproof;
	}
//	overloaded constructor
	public Customer(int cid ,String name,String accno,long balance) {
		this.cid=cid;
		this.name=name;
		this.accno = accno;
		this.balance = balance;		
	}	
//	overloaded constructor
	public Customer() {
			
	}	
}

public class Constructors {
	public static void main(String[] args) {
		
		Customer customer1 = new Customer();
		Customer customer2 = new Customer(101,"hemanth","123456",12500l);
		Customer customer3 = new Customer(101,"hemanth","123456",500l,"idproof","Dobproof");
		
		System.out.println(customer3.balance);
		
	}


}
