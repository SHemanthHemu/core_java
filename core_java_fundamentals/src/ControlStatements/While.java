package ControlStatements;

class product {
	int productID;
	String productName;
	long price;
	String seller;
	
}

public class While {
	
	
	public static void main(String[] args) {
//		int index = 0;
//		
//		while (index<10) {
//			System.out.println(index);
//			index++;
//		}
		
		product product1 =new product();
		product1.productID =101;product1.productName="name1";product1.price = 1000l;product1.seller="seller1";
		product product2 =new product();
		product2.productID =102;product2.productName="name2";product2.price = 100l;product2.seller="seller2";
		product product3 =new product();
		product3.productID =103;product3.productName="name3";product3.price = 300l;product3.seller="seller3";
		product product4 =new product();
		product4.productID =104;product4.productName="name4";product4.price = 400l;product4.seller="seller4";
		
		product[] products = {product1,product2,product3,product4 };
		
		int i = 0;
		
		
		while (i<products.length) {
			product product = products[i];
			System.out.println(product.productID +"\t"+product.productName +"\t"+product.price +"\t"+product.seller +"\t");
			i++;
		}
	}

}
