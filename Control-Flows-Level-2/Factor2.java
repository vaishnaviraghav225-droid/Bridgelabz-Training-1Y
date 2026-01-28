/*8*/
import java.util.Scanner;
class Factor2
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n:");
		int n=sc.nextInt();
		int i=1;
		if(n>0)
		{
			System.out.println("Positive Integer");
			{
				while(i<=n)
				{
					if(n%i==0)
					{
					 System.out.println(i);
					}
					i++;
				}
			}
		}
		
		else
		{
			System.out.println("Not a Positive Integer");
		}
	}
}
					