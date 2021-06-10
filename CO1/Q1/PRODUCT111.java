package myproject;

public class PRODUCT111{
	int pcode;
	String pname;
	int price;
	public static void main(String[] args) {
		product ob1= new product();
		product ob2= new product();
		product ob3= new product();
		ob1.pcode=130;
		ob1.pname="SAMSUNG";
		ob1.price=14500;
		ob2.pcode=132;
		ob2.pname="REDME";
		ob2.price=10000;
		ob3.pcode=131;
		ob3.pname="OPPO";
		ob3.price=22000;
		if(ob1.price<=ob2.price && ob1.price<=onb3.price)
			System.out.println(ob1.pname+"is cheaper");
		else if(ob2.price<=ob1.price  && ob2.price<= ob3.price)
			System.out.println(ob2.pname+ "is cheaper");
		else
			System.out.println(ob3.pname+" is cheaper");
	}

}
