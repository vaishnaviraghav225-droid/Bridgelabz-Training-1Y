/*2.Create a program to find the bonuses of employees based on their years of service.
Hint =>
a. Zara decided to give a bonus of 5% to employees whose year of service is more than 5
years.
b. Take salary and year of service in the year as input.
c. Print the bonus amount.*/
import java.util.Scanner;
class Bonus
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Salary:-");
		int Salary=sc.nextInt();
		System.out.println("Enter YearOfService:-");
		int YearOfService=sc.nextInt();
		if(YearOfService>5)
		{
			double bonus=Salary*0.05;
			System.out.println("Bonus for employees:-"+bonus);
		}
		
		else
		{
			System.out.println("Bonus not required");
		}
	}
}
		
		
		