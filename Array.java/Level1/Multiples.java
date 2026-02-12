import java.util.Scanner;
public class Multiples {
        public static void main(String args[])
        {
            Scanner sc=new Scanner (System.in);
            double arr[]=new double[10];
            double n,total=0;
            int i=0;
            while(i<arr.length)
            {
                System.out.println("Enter n");
                n=sc.nextDouble();
                if(n<=0){
                    break;}
                arr[i]=n;

                i++;
            }
            for(int j=0;j<1;j++)
            {
                System.out.println(arr[j]);
                total=total+arr[j];
            }
            System.out.println("Total values"+total);
        }
    }

