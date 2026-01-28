/*11.Create a program to find all the multiples of a number taken as user input below 100.
Hint =>
a. Get the input value for a variable named number. Check the number is a positive integer
and less than 100.
b. Run a for loop backward: from i = 100 to i = 1.
c. Inside the loop, check if i perfectly divide the number. If true, print the number and
continue the loop.*/
import java.util.Scanner;
class Multiples
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n less than 100:");
		int n=sc.nextInt();
		if(n>0)
		{
			System.out.println("Positive Integer");
			for(int i=100;i<=n;i--)
			{
				if(i%n==0)
				{
					System.out.println(i);
					continue;
				}
			}
		}
		else
		{
			System.out.println("Negative Integer");
		}
	}
}
			
				