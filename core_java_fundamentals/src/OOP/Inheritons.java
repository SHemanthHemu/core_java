package OOP;

class Bank{
	String Bankname = "HDFC";
	String Branch = "Sangareddy";
}
class Customar extends Bank{
	int Cid;
	String Name;
	
	public String toString() {
		return this.Cid +"\t" +this.Name +"\t" +this.Bankname +"\t" +this.Branch;
	}
}
public class Inheritons {
	
	public static void main(String[] args) {
		
		 Customar customer1 = new  Customar();
		 Customar customer2 = new  Customar();
		 Customar customer3 = new  Customar();
		customer1.Cid = 101;
		customer1.Name = "Hemanth";
		customer2.Cid = 102;
		customer2.Name = "Devi";
		customer3.Cid = 103;
		customer3.Name = "Sugreevaiah";
		System.out.println(customer1);
		System.out.println(customer2);
		System.out.println(customer3);
	}

}
