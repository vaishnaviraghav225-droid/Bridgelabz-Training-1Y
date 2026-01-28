/*1.Create a program to print odd and even numbers between 1 to the number entered by the
user.
Hint =>
a. Get an integer input from the user, assign to a variable number and check for Natural
Number
b. Using a for loop, iterate from 1 to the number
c. In each iteration of the loop, print the number is odd or even number*/
import java.util.Scanner;
class Number
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a n:-");
		int n=sc.nextInt();
		if(n>0)
		{
			System.out.println("Natural Number");
		}
		 else
		{
			System.out.println("Not a Natural Number");
		}	
		

		for(int i=1;i<=n;i++)
		{
			if(i%2==0)
			{
				System.out.println(i+ " is Even");
			}
			else 
			{
				System.out.println(i+ " is Odd");
			}
		}
		   
		
	}
}
			
		
		