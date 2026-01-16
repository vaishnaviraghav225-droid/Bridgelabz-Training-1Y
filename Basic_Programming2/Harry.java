import java.util.Scanner;
class Harry
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Birth Year:-");
		int a=sc.nextInt();
		System.out.println("Enter Current Year:-");
		int b=sc.nextInt();
		int Age=b-a;
		System.out.println("Age of Harry:-"+Age);
	}
}
		