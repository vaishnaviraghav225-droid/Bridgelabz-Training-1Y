import java.util.Scanner;
class Athelete
{
	public static int Perimeter(int side1,int side2,int side3)
	{
		return (side1+side2+side3);
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int side1,side2,side3,Perimeter;
		
		System.out.println("Enter side1-");
		side1=sc.nextInt();
		
		System.out.println("Enter side2-");
		side2=sc.nextInt();
		
		System.out.println("Enter side3-");
		side3=sc.nextInt();

        Perimeter=(side1+side2+side3);
		
		System.out.println("Number of rounds:-" +Perimeter);
	}

}