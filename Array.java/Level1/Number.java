import java.util.Scanner;
public class Number {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();
        if (n > 0) {
            System.out.println("Valid Number");
        }
        int[] even = new int[(n / 2) + 1];
        int[] odd = new int[(n / 2) + 1];

        int evenIndex = 0;
        int oddIndex = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                even[evenIndex] = i;
                evenIndex++;
            } else {
                odd[oddIndex] = i;
                oddIndex++;
            }
        }
        System.out.println("Even Numbers:");
        for (int i = 1; i < evenIndex; i++) {
            System.out.println(even[i] + " ");
        }
        System.out.println("Odd Numbers:");
        for (int i = 1; i < oddIndex; i++) {
            System.out.println(odd[i] + " ");
        }
    }
}
