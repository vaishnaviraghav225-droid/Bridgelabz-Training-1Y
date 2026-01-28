import java.util.Scanner;
class Leap2
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Year greater than 1582:-");
		int Year=sc.nextInt();
		    if((Year%4==0&&Year%100!=0)||(Year%400==0))
			{
		      System.out.println("Leap Year");
		    }
	}
}
		
			