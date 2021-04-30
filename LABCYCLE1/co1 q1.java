package JAVA;

public class product {
	   int pcode , price;
	   String pname;

	public static void main(String[] args) {
		product obj1 = new product();
		product obj2 = new product();
		product obj3 = new product();
		
		obj1.pcode = 1;
		obj1.pname = "book";
		obj1.price = 100;
		
		obj2.pcode = 2;
		obj2.pname = "text";
		obj2.price = 250;
		
		obj3.pcode = 3;
		obj3.pname = "pen";
		obj3.price = 20;
		
         System.out.println("Details of product which has lowest price : ");
		
		if(obj1.price < obj2.price && obj1.price < obj3.price)
		{
			System.out.println("CODE : "+ obj1.pcode+ "\n" + "NAME : "+  obj1.pname+ "\n"  + "PRICE : " + obj1.price );
		}
		else if (obj2.price < obj1.price && obj2.price < obj3.price)
		{
			System.out.println("CODE : "+ obj2.pcode+ "\n" + "NAME : "+ obj2.pname+ "\n"  + "PRICE : " + obj2.price );

		}
		else
		{
			System.out.println("CODE : "+ obj3.pcode+ "\n" + "NAME : "+ obj3.pname+ "\n"  + "PRICE : " + obj3.price );

		}
				
	}

}

		

		

	