import java.util.Scanner;
class Number
{
    
    public static int checkNumber(int n)
    {
        if(n > 0)
            return 1;
        else if(n < 0)
            return -1;
        else
            return 0;
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n, result;

        System.out.println("Enter number:");
        n = sc.nextInt();

        result = checkNumber(n);

        System.out.println("Result: " + result);
    }
}