import java.util.Scanner;
class SimpleInterest
{
	public static double SimpleInterest(double p,double r,double t)
	{
		return (p*r*t)/100;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		double principal,rate,time,SI;
		
		System.out.println("Enter Principal:");
		principal=sc.nextDouble();
		
		System.out.println("Enter Rate:");
		rate=sc.nextDouble();
		
		System.out.println("Enter Time:");
		time=sc.nextDouble();
		
		SI=SimpleInterest(principal,rate,time);
		
		
		System.out.println("The Simple Interest is" + SI + "for Principal" + principal + "for Rate" + rate + "for time" +time);
	}
}