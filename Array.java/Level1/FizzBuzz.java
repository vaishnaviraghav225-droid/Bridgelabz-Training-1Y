 import java.util.Scanner;
    public class FizzBuzz {

            public static void main(String args[])
            {
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter n");
                int n=sc.nextInt();
                if(n>0)
                {
                    String[] result=new String[n];
                    for(int i=0;i<=n;i++)
                    {
                        if(i%3==0)
                        {
                            System.out.println("Fizz");
                        }
                        else if(i%5==0)
                        {
                            System.out.println("Buzz");
                        }
                        else if(i%5==0 && i%3==0)
                        {
                            System.out.println("FizzBuzz");
                        }
                        else{
                            System.out.println("i");
                        }
                    }
                    for (int i = 0; i <n ; i++) {
                        System.out.println("Position " + (i + 1) + " = " +i);
                    }

                } else {
                    System.out.println("Please enter a positive integer.");
                }
            }
        }

