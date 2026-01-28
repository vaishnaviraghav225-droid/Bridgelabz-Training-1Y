import java.util.Scanner;
class Bmi
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter weight in kgs:-");
		double weight=sc.nextDouble();
		System.out.println("Enter height in cms:-");
		double height=sc.nextDouble();
		double heightm=height/100;
		double bmi=weight/(heightm*heightm);
		if(bmi<=18.4)
		{
			System.out.println("Underweight");
		}
		else if(bmi>=18.5&&bmi<=24.9)
		{
			System.out.println("Normal");
		}
		else if(bmi>=25.0&&bmi<=39.9)
		{
			System.out.println("Overweight");
		}
		else
		{
			System.out.println("obese");
		}
	}
}
		
		