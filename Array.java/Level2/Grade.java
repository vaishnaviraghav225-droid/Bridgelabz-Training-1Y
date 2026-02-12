import java.util.Scanner;

class Grade {
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        System.out.print("Students: ");
        int n=sc.nextInt();

        double[] per=new double[n];
        char[] grade=new char[n];

        for(int i=0;i<n;i++){

            System.out.print("Physics: ");
            int p=sc.nextInt();

            System.out.print("Chemistry: ");
            int c=sc.nextInt();

            System.out.print("Maths: ");
            int m=sc.nextInt();

            per[i]=(p+c+m)/3.0;

            if(per[i]>=80) grade[i]='A';
            else if(per[i]>=70) grade[i]='B';
            else if(per[i]>=60) grade[i]='C';
            else if(per[i]>=50) grade[i]='D';
            else if(per[i]>=40) grade[i]='E';
            else grade[i]='R';
        }

        for(int i=0;i<n;i++){
            System.out.println(per[i]+" "+grade[i]);
        }
    }
}