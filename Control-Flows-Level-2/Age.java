/*6.Create a program to find the youngest friends among 3 Amar, Akbar, and Anthony based on
their ages and the tallest among the friends based on their heights
Hint =>
a. Take user input for the age and height of the 3 friends and store it in a variable
b. Find the smallest of the 3 ages to find the youngest friend and display it
c. Find the largest of the 3 heights to find the tallest friend and display it*/
import java.util.Scanner;
class Age
{
	public static void main(String args[])
	{
		
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter age1:-");
	int age1=sc.nextInt();
	System.out.println("Enter age2:-");
	int age2=sc.nextInt();
	System.out.println("Enter age3:-");
	int age3=sc.nextInt();
	System.out.println("Enter height1:-");
	int h1=sc.nextInt();
	System.out.println("Enter height2:-");
	int h2=sc.nextInt();
	System.out.println("Enter height3:-");
	int h3=sc.nextInt();
	int youngest=age1;
	if(age2<youngest)
		youngest=age2;
	if(age3<youngest)
		youngest=age3;
	
	int tallest=h1;
	if(h2>tallest)
		tallest=h2;
	if(h3>tallest)
		tallest=h3;
	
	System.out.println("Youngest age:"+youngest);
	System.out.println("Tallest age:"+tallest);
    }
}
