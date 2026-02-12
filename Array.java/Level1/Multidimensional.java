import java.util.Scanner;
public class Multidimensional {
        public static void main(String args[])
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter number of rows");
            int rows=sc.nextInt();
            System.out.println("Enter number of col");
            int col=sc.nextInt();
            int matrix[][]=new int[rows][col];

            System.out.println("Enter matrix elements:");
            for(int i=0;i<rows;i++)
            {
                for(int j=0;j<col;j++)
                {
                    matrix[i][j]=sc.nextInt();
                }
            }

            int[] array=new int[rows*col];
            int index = 0;
            for (int i = 0; i < rows; i++)
            {
                for (int j = 0; j < col; j++)
                {
                    array[index] = matrix[i][j];
                    index++;
                }
            }
            for (int i = 0; i < array.length; i++)
            {
                System.out.print(array[i] + " ");
            }
        }
    }

