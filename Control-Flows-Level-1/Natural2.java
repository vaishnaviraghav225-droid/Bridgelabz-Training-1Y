import java.util.Scanner;

class Natural2 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Not a Natural Number");
            return;
        }

        int sumLoop = 0;
        int i = 1;

        while (i <= n) {
            sumLoop += i;
            i++;
        }

        int sumFormula = n * (n + 1) / 2;

        System.out.println("Sum using loop: " + sumLoop);
        System.out.println("Sum using formula: " + sumFormula);

        if (sumLoop == sumFormula) {
            System.out.println("Result is correct");
        } else {
            System.out.println("Result is not correct");
        }
    }
}