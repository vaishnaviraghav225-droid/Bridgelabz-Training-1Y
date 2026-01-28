import java.util.Scanner;
class Spring
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter month:");
		int month=sc.nextInt();
		System.out.println("Enter day");
		int day=sc.nextInt();
		if(month==3&&day>=20)
		{
			System.out.println("Spring Season");
		}
		else
		{
			System.out.println("Not a Spring Season");
		}
	}
}