import java.util.Scanner;
class Smallest
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num1");
		int num1=sc.nextInt();
		System.out.println("Enter num2");
		int num2=sc.nextInt();
		System.out.println("Enter num3");
		int num3=sc.nextInt();
		if (num1 < num2 && num1 < num3) {
            System.out.println("Smallest");
        } else {
            System.out.println("Not Smallest");
        }
	}
}

		