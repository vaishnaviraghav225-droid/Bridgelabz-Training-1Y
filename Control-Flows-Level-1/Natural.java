import java.util.Scanner;

 class Natural {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        int sum;

        System.out.print("Enter n: ");
        n = sc.nextInt();

        if (n > 0) {  
            
            System.out.println("Natural number");
			sum=n*(n+1)/2;
			System.out.println("Sum of natural number"+sum);
        } else {
            System.out.println(" not a natural number");
        }
		

       
    }
}
