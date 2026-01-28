/*1. Write a LeapYear program that takes a year as input and outputs the Year is a Leap Year or
not a Leap Year.
Hint =>
a. The LeapYear program only works for year >= 1582, corresponding to a year in the
Gregorian calendar. So ensure to check for the same.
b. Further, the Leap Year is a Year divisible by 4 and not 100 unless it is divisible by 400.
E.g. 1800 is not a Leap Year and 2000 is a Leap Year.
c. Write code having multiple if else statements based on conditions provided above and
a second part having only one if statement and multiple logical*/
import java.util.Scanner;
class LeapYear
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Year:-");
		int Year=sc.nextInt();
		if(Year>=1582)
		{
			System.out.println("Valid");
		  {
		    if((Year%4==0&&Year%100!=0)||(Year%400==0))
			{
		      System.out.println("Leap Year");
		    }
		    else
		    {
			  System.out.println("Not a Leap Year");
		    }
		  }
		}
		else
		{
		System.out.println("Not Valid");
		}
	}
}
		
			