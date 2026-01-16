import java.util.Scanner;
class Student
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Total Pens:-");
		int Pens=sc.nextInt();
		System.out.println("Enter Students:-");
		int Students=sc.nextInt();
		int Equal=Students/Pens;
		double remaining=Pens%Students;
		System.out.println("Eqaul divided:-"+Equal);
		System.out.println("Remaining pens:-"+remaining);
	}
}