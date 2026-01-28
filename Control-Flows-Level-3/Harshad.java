import java.util.Scanner;
class Harshad
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n:-");
		int n=sc.nextInt();
		int p=n;
		int sum=0;
		while(p!=0){
			p=p%10;
			sum=sum+p;
			p=p/10;
		}
		if(n%sum==0)
		{
			System.out.println("Harshad Number");
		}
		else
		{
			System.out.println("Not an Harshad Number");
		}
	}
}