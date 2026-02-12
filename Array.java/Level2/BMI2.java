import java.util.Scanner;

class BMI2 {
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter persons: ");
        int n=sc.nextInt();

        double[][] data=new double[n][3];
        String[] status=new String[n];

        for(int i=0;i<n;i++){
            System.out.print("Weight: ");
            data[i][0]=sc.nextDouble();

            System.out.print("Height: ");
            data[i][1]=sc.nextDouble();

            data[i][2]=data[i][0]/(data[i][1]*data[i][1]);

            if(data[i][2]<=18.4) status[i]="Underweight";
            else if(data[i][2]<=24.9) status[i]="Normal";
            else if(data[i][2]<=39.9) status[i]="Overweight";
            else status[i]="Obese";
        }

        for(int i=0;i<n;i++){
            System.out.println(data[i][0]+" "+data[i][1]+" "+data[i][2]+" "+status[i]);
        }
    }
}