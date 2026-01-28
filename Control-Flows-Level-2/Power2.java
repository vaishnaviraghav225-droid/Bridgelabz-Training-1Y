/*13Rewrite the above program to find the power of a number using a while loop.
Hint =>
a. Get integer input for two variables named number and power.
b. Create a result variable with an initial value of 1.
d. Create a temp variable counter and initialize to zero. Use the while loop till _**counter
== power**_.
c. In each iteration of the loop, multiply the result by the number and assign the value to
the result. Also, increment the counter.
d. Finally, print the result*/
import java.util.Scanner;
class Power2
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:-");
		int n=sc.nextInt();
		System.out.println("Enter power:-");
		int p=sc.nextInt();
		int a=1;
		int counter=0;
		if(n>0)
		{
			System.out.println("Positive Integer");
			while(counter<=p){
				a=counter*n;
				counter++;
				System.out.println(a);
			}
			
		}
	}
}