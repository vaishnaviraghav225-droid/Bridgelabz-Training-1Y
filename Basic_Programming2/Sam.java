import java.util.Scanner;
class Sam
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Maths number:-");
		double a=sc.nextInt();
		System.out.println("Enter Physics number:-");
		double b=sc.nextInt();
		System.out.println("Enter Chemistry number:-");
		double c=sc.nextInt();
		double Average=(a+b+c)/3;
		System.out.println("Average Number:-"+Average);
	}
}