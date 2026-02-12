import java.util.Scanner;

public class Check {
    public static void main(String args[])
        {
            Scanner sc=new Scanner(System.in);
            int[] n=new int[5];
            System.out.println("Enter 5 numbers:");
            for(int i=0;i<5;i++)
            {
                n[i]=sc.nextInt();
            }
            for(int i=0;i<5;i++)
            {
                if(n[i]>0)
                {
                    System.out.println("positive");
                    {
                        if(i%2==0)
                        {
                            System.out.println("Even");
                        }
                        else
                        {
                            System.out.println("Odd");
                        }
                    }
                }
                else if(n[i]<0)
                {
                    System.out.println("Negative");
                }
                else
                {
                    System.out.println("Zero");
                }
            }
            for(int i=0;i<5;i++)
            {
                if(n[0]==n[n.length-1])
                {
                    System.out.println("Equal");
                }
                else if(n[0]>n[n.length-1])
                {
                    System.out.println("Greater");
                }
                else
                {
                    System.out.println("Lesser");
                }
            }
        }



}
