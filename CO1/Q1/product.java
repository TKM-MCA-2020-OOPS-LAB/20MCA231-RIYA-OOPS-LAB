public class product {
	
	int pcode , price;
	String pname;
	
	public  static void main(String [] args)
	{ 
		product obj1 = new product();
		product obj2 = new product();
		product obj3 = new product();
		
		obj1.pcode = 101;
		obj1.pname = "HP";
		obj1.price = 50000;
		
		obj2.pcode = 102;
		obj2.pname = "MI";
		obj2.price = 35000;
		
		obj3.pcode = 103;
		obj3.pname = "Asus";
		obj3.price = 20000;
		
		System.out.println("Print details of product which has lowest price : ");
		
		if(obj1.price < obj2.price && obj1.price < obj3.price)
		{
			System.out.println("Product Code : "+ obj1.pcode+ "\n" + "Product Name : "+  obj1.pname+ "\n"  + "Product Price: " + obj1.price );
		}
		else if (obj2.price < obj1.price && obj2.price < obj3.price)
		{
			System.out.println("Product Code "+ obj2.pcode+ "\n" + "Product Name : "+ obj2.pname+ "\n"  + "Product Price: " + obj2.price );

		}
		else
		{
			System.out.println("Product Code  is : "+ obj3.pcode+ "\n" + "Product Name "+ obj3.pname+ "\n"  + "Product Price : " + obj3.price );

		}	
	}

}

