import java.util.Scanner;

class LargestDigit {
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter number: ");
        int n=sc.nextInt();

        int[] digit=new int[10];
        int i=0;

        while(n>0){
            digit[i]=n%10;
            n=n/10;
            i++;
        }

        int largest=0, second=0;

        for(int j=0;j<i;j++){
            if(digit[j]>largest){
                second=largest;
                largest=digit[j];
            }
            else if(digit[j]>second && digit[j]!=largest){
                second=digit[j];
            }
        }

        System.out.println("Largest = "+largest);
        System.out.println("Second largest = "+second);
    }
}