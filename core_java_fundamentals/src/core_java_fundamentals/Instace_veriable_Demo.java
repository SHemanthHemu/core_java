package core_java_fundamentals;


class Customer{
	String name;
	String Accno;
	String Address;
	long account_balance;
	
	public void withdrawl (long amount) {
		this.account_balance = this.account_balance-amount;
	}
	public void deposite (long amount) {
		this.account_balance = this.account_balance+amount;
	}
}

public class Instace_veriable_Demo {
	
	int age = 28;
	String name = "Hemanth";
	String email = "hemanthsurthani7@gmail.com";
	
	
	
	public static void main(String[] args) {
		
		Instace_veriable_Demo obj1 = new Instace_veriable_Demo();
		
		System.out.println(obj1.name);
		System.out.println(obj1.age);
		System.out.println(obj1.email);
		obj1.age = 29;
		obj1.name = "Heamnth Kumar";
		System.out.println(obj1.name);
		System.out.println(obj1.age);
		
		
		Customer Hemanth = new Customer();
		Customer Mani = new Customer();
		
		Hemanth.name = "hemanth";
		Hemanth.Accno = "7382276998";
		Hemanth.account_balance=10000;
		Hemanth.Address = "hyderabad";
		
		
		Mani.name = "Mani";
		Mani.Accno = "9494747317";
		Mani.account_balance=8000;
		Mani.Address = "Sangareddy";
		
		Hemanth.withdrawl(2000);
		Mani.withdrawl(4000);
		
		
		System.out.println("Name:"+Hemanth.name);
		System.out.println("Accno:"+Hemanth.Accno);
		System.out.println("account_balance:"+Hemanth.account_balance);
		System.out.println("Address:"+Hemanth.Address);
		
		System.out.println("Name:"+Mani.name);
		System.out.println("Accno:"+Mani.Accno);
		System.out.println("account_balance:"+Mani.account_balance);
		System.out.println("Address:"+Mani.Address);
				
		
		
	}
	

}
