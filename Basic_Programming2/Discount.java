import java.util.Scanner;
class Discount
{
	public static void main(String args[])
	{
	  Scanner sc=new Scanner (System.in);
	  System.out.println("Enter Fees:-");
	  int Fees=sc.nextInt();
	  System.out.println("Enter Discount(%):-");
	  int Discount=sc.nextInt();
	  int Amount=(Discount*Fees)/100;
	  System.out.println("Discount Amount:-"+Amount);
	  int Price=Fees-Amount;
   	  System.out.println("Discount Price:-"+Price);
	}
}
