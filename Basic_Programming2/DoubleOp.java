import java.util.Scanner;
class DoubleOp
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a:-");
		double a=sc.nextDouble();
		System.out.println("Enter b:-");
		double b=sc.nextDouble();
		System.out.println("Enter c:-");
		double c=sc.nextDouble();
		double op1=a+(b*c);
		double op2=(a*b)+c;
		double op3=c+(a/b);
		double op4=(a%b)+c;
		System.out.println("Results of Double Operations are:-");
		System.out.println("a+(b*c):-"+op1);
		System.out.println("(a*b)+c:-"+op2);
		System.out.println("c+(a/b):-"+op3);
		System.out.println("(a%b)+c:-"+op4);
	}
}