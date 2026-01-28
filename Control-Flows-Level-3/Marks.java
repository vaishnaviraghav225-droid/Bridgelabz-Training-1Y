/*3*/
import java.util.Scanner;
class Marks
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter PhysicsMarks");
		int Physics=sc.nextInt();
		System.out.println("Enter ChemistryMarks");
		int Chemistry=sc.nextInt();
		System.out.println("Enter MathsMarks");
		int Maths=sc.nextInt();
		int TotalMarks=(Physics+Chemistry+Maths);
		double percentage=(TotalMarks/300)*100;
		if(percentage>=80){
			System.out.println("A");
		System.out.println("Level 4,above agency-normalized standards");
		}
		else if(percentage>=70){
			System.out.println("B");
		System.out.println("Level 3,at agency-normalized standards");
		}
		else if(percentage>=60){
			System.out.println("C");
		System.out.println("Level 2,below,but approaching agency-normalized standards");
		}
		else if(percentage>=50){
			System.out.println("D");
		System.out.println("Level 1,well below agency-normalized standards");
		}
		else if(percentage>=40){
			System.out.println("E");
		System.out.println("Level 1,too below agency-normalized standards");
		}
		else
		{
			System.out.println("Remedial Standards");
		}
	}
}
			
			
			
			