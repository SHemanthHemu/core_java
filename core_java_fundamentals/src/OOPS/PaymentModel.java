package OOPS;

import java.util.Scanner;

class CashonDelevary{
	String address;
	long contactno;
	public CashonDelevary(String address, long contactno) {
		super();
		this.address = address;
		this.contactno = contactno;
	}
	
	
}
class CreditCard{
	long accountno;
	short cvv;
	String nameoncard;
	public CreditCard(long accountno, short cvv, String nameoncard) {
		super();
		this.accountno = accountno;
		this.cvv = cvv;
		this.nameoncard = nameoncard;
	}
	
	
}
class DebitCard{
	long accountno;
	short cvv;
	String nameoncard;
	public DebitCard(long accountno, short cvv, String nameoncard) {
		super();
		this.accountno = accountno;
		this.cvv = cvv;
		this.nameoncard = nameoncard;
	}
	
	
}
class Gpay{
	long mobileno;
	String qrcode;
	public Gpay(long mobileno, String qrcode) {
		super();
		this.mobileno = mobileno;
		this.qrcode = qrcode;
	}
	
}

class Paymethod{
	public void pay(CashonDelevary cashondelevary) {
		System.out.println("You selected cash on delevary option hear are the details");
		System.out.println(cashondelevary.address);
		System.out.println(cashondelevary.contactno);	
	}
	public void pay(CreditCard creditCard) {
		System.out.println("You selected CreditCard option hear are the details");
		System.out.println(creditCard.accountno);
		System.out.println(creditCard.cvv);
		System.out.println(creditCard.nameoncard);		
	}
	public void pay(DebitCard debitCard) {
		System.out.println("You selected DebitCard option hear are the details");
		System.out.println(debitCard.accountno);
		System.out.println(debitCard.cvv);
		System.out.println(debitCard.nameoncard);		
	}
	public void pay(Gpay gpay) {
		System.out.println("You selected Gpay option hear are the details");
		System.out.println(gpay.mobileno);
		System.out.println(gpay.qrcode);
				
	}
	
	
	
}

public class PaymentModel {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Paymethod paymethod = new Paymethod();
		
		System.out.println("Pay models:");
		System.out.println("--------------");
		System.out.println(" 1.Cash on delevart"+"\n"+" 2.Credit card"+"\n"+" 3.Debit card"+"\n"+" 4.Gpay");
		System.out.println("select your payment method");
		int choice = sc.nextInt();
		
		switch (choice) {
		case 1 : System.out.println("enter the below details:");
				 System.out.println("Address:");
				 String address = sc.next();
				 System.out.println("Contact No:");
				 long contactno =sc.nextLong();
				 CashonDelevary cashondelevary = new CashonDelevary(address, contactno);
				 paymethod.pay(cashondelevary);
				 break;
		case 2 : System.out.println("enter the below details:");
				 System.out.println("accountno:");
				 long accountno = sc.nextLong();
				 System.out.println("Cvv:");
				 Short cvv =sc.nextShort();
				 System.out.println("Nameoncard");
				 String nameoncard =sc.next();
				 CreditCard creditcard = new CreditCard(accountno,cvv, nameoncard);
				 paymethod.pay(creditcard);	
				 break;
				 
		case 3 : System.out.println("enter the below details:");
				 System.out.println("accountno:");
				 long accountno1 = sc.nextLong();
				 System.out.println("Cvv:");
				 Short cvv1 =sc.nextShort();
				 System.out.println("Nameoncard");
				 String nameoncard1 =sc.next();
				 DebitCard debitCard = new DebitCard(accountno1,cvv1, nameoncard1);
				 paymethod.pay(debitCard);
				 break;
				 
		case 4 : System.out.println("enter the below details:");
				 System.out.println("Mobileno:");
				 long mobileno = sc.nextLong();
				 System.out.println("QrCode");
				 String qrcode =sc.next();
				 Gpay gpay = new Gpay(mobileno, qrcode);
				 paymethod.pay(gpay);		 
				 		 			 
		
		}
	
	}

}
