/*3.Create a program to find the multiplication table of a number entered by the user from 6 to 9.
Hint =>
a. Take integer input and store it in the variable number
b. Using a for loop, find the multiplication table of number from 6 to 9 and print it in the
format number * i = ___*/
import java.util.Scanner;
class Integer
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n:-");
		int n=sc.nextInt();
		if(n>=6&&n<=9)
		{
			for(int i=1;i<=10;i++)
		  {
			int result=n*i;
			System.out.println(n+ "*" +i+ "=" +result);
		  }
		}
		else
		{
			System.out.println("Not Inside the loop");
		}
		
		
	}
}
			