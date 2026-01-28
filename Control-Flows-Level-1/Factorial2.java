import java.util.Scanner;

class Factorial2 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num:");
        int num = sc.nextInt();

        if (num < 0) {
            System.out.println("Not a Factorial Number");
            return;
        }

        long fact = 1;

        for (int i = 1; i <= num; i++) {
            fact *= i;
        }

        System.out.println("Factorial: " + fact);
    }
}