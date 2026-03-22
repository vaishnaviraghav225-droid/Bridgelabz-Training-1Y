import java.util.Scanner;
class Handshakes
{
	public static int Handshakes(int n)
	{
		return (n*(n-1))/2;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n,HS;
		
		System.out.println("Enter n:-");
		n=sc.nextInt();
		
		HS=Handshakes(n*(n-1))/2;
		
		System.out.println("No of handshakes possible-" +HS);
	}
}