import java.util.Scanner;
class Profit
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter CP:-");
		int CP=sc.nextInt();
		System.out.println("Enter SP:-");
		int SP=sc.nextInt();
		int Profit=SP-CP;
		System.out.println("Find Profit:-"+Profit);
		int Profit Percentage=(Profit/CP)*100;
	    System.out.println("Find Profit Percentage:-"+Profit Percentage);
	}
}