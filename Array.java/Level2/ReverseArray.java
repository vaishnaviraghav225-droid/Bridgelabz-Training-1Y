import java.util.Scanner;

class ReverseArray {
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter number: ");
        int n=sc.nextInt();

        int temp=n,count=0;

        while(temp>0){
            count++;
            temp/=10;
        }

        int[] digit=new int[count];

        for(int i=0;i<count;i++){
            digit[i]=n%10;
            n/=10;
        }

        System.out.print("Reverse: ");
        for(int i=0;i<count;i++){
            System.out.print(digit[i]);
        }
    }
}