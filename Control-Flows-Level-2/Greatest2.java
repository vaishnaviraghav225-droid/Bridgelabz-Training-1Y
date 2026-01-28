import java.util.Scanner;
class Greatest2
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n:");
		int n=sc.nextInt();
		int counter=n-1;
		int a=1;
		while(counter>=1)
		{
			if(n%counter==0)
			{
				a=counter;
				break;
			}
			counter--;
		}
		System.out.println("Greatest factor:-"+counter);
	}
}