import java.util.Scanner;
class Countdown
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Countdown");
		int Counter=sc.nextInt();
		for(int i=Counter;i>=1;i--)
		{
			System.out.println(i);
		}
		System.out.println("Rocket launch");
	}
}