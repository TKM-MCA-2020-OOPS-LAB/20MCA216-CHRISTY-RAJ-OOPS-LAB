package JAVA;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public interface bill {
	void total();
	}
class Product1 implements bill
{
	int productid=101,quantity=2,unitprice=25,sum;
	String name="A";
	
	public void total()
	{
		sum=quantity*unitprice;
	}
}
class Product2 extends Product1 implements bill
{
	int productid1=102,quantity1=1,unitprice1=100,total;
	String name1="B";
	DateFormat df=new SimpleDateFormat("dd/MM/yy");
	Date d= new Date();
	public void total()
	{
		
		super.total();
		total=quantity1*unitprice1;
	}
	public void display()
	{
		System.out.println("Order No.112\n");
		System.out.println("Date: "+df.format(d));
		System.out.println("\nProduct Id\t\tName\t\t\tQuantity\t\t\tunit price\t\t\tTotal");
		System.out.println("________________________________________________________________________________________________________________________________");
		System.out.println(productid+"\t\t\t"+name+"\t\t\t"+quantity+"\t\t\t\t"+unitprice+"\t\t\t\t"+sum);
		System.out.println(productid1+"\t\t\t"+name1+"\t\t\t"+quantity+"\t\t\t\t"+unitprice1+"\t\t\t\t"+total);
		System.out.println("_________________________________________________________________________________________________________________________________");
		System.out.println("\t\t\t\t\t\t\t\t\tNet. Amount"+"\t\t\t\t"+(sum+total));
		
	}
}

