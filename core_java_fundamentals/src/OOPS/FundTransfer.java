package OOPS;

class Bank1{
	String BankName;
	String IfscCode;
	String Address;
	public Bank1(String bankName, String ifscCode, String address) {
		super();
		BankName = bankName;
		IfscCode = ifscCode;
		Address = address;
	}
	
}

class Cust extends Bank1{
	String custName;
	String custAddress;
	long accountno;
	long balance;
	String accountType;
	
	public Cust(String bankName, String ifscCode, String address, String custName, String custAddress, long accountno,
			long balance, String accountType) {
		super(bankName, ifscCode, address);
		this.custName = custName;
		this.custAddress = custAddress;
		this.accountno = accountno;
		this.balance = balance;
		this.accountType = accountType;
	}

	public void fundTransfer(Cust receverAccount , long amount) {
		if (balance > amount) {
			if (receverAccount != null) {
				if (amount > 0) {
					this.balance = this.balance-amount;
					receverAccount.balance = receverAccount.balance+amount;
					
					System.out.println("amount Transfered successfully ...");
					System.out.println(this.balance);
					System.out.println(receverAccount.balance);
					return;
					
				}
				System.out.println("Please enter amount more than 0 ");
				return;
			}
			System.out.println("please enter valid credentials ");
			return;
			
		}
		System.out.println("You have in suffeciant founds... ");
		
	}
}

public class FundTransfer {
	
	public static void main(String[] args) {
		Cust Hemanth = new Cust("Hdfc","12345", "sangareddy", "Hemanth", "Gudur", 125574852, 12000l, "Savings");
		Cust Devi = new Cust("Hdfc","12345", "sangareddy", "Devi", "Gudur", 125535752, 2000l, "Savings");

		
		
		Hemanth.fundTransfer(Devi, 1000l);
		Hemanth.fundTransfer(Devi, 2000l);
		Hemanth.fundTransfer(null, 2000l);
		Hemanth.fundTransfer(Devi, 0);
		Hemanth.fundTransfer(Devi, 8000);
		Hemanth.fundTransfer(Devi, 2000);
	}

}
