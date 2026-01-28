/*13. Rewrite the program to find all the multiples of a number below 100 using while loop.
Hint =>
a. Get the input value for a variable named number. Check the number is a positive integer
and less than 100.
b. Create a counter variable and assign counter = number - 1; Use a while till the
counter is > 1
c. Inside the loop, check if the counter perfectly divides the number. If true, print the
number and continue the loop.*/
import java.util.Scanner;
class Multiples2
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n less than 100:");
		int n=sc.nextInt();
		int counter=1;
		counter=n-1;
		if(n>0)
		{
			System.out.println("Positive Integer");
			while(counter>=1)
			{
				if(counter%n==0)
				{
					System.out.println(counter);
					continue;
				}
				counter--;
			}
			
		}
	}
}
