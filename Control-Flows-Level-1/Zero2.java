import java.util.Scanner;
class Zero2
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int sum=0;
		int number;
		while(true)
		{
		System.out.println("Enter numbers to sum(enter 0 or negative number to stop)");
		number=sc.nextInt();
		if(number<=0)
		{
			break;
		}
		sum+=number;
		System.out.println("The total sum is:" +sum);
		}
	}
}