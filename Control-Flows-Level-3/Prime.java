import java.util.Scanner;
class Prime
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n");
		int n=sc.nextInt();
		if(n>1)
		{
			for(int i=2;i>=n;i++)
			{
				if(i%n==0)
				{
					System.out.println(i);
				}
			}
		}
	}
}