import java.util.Scanner; 
class StudentMarks2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int students;
        System.out.print("Enter number of students: ");
        students = sc.nextInt();

        int[][] marks = new int[students][3];
        double percentage;
        char grade;

        for (int i = 0; i < students; i++) {
            System.out.println("Enter Physics, Chemistry, Maths marks for Student " + (i + 1));

            for (int j = 0; j < 3; j++) {
                marks[i][j] = sc.nextInt();
            }

            int total = marks[i][0] + marks[i][1] + marks[i][2];
            percentage = total / 3.0;

            if (percentage >= 90)
                grade = 'A';
            else if (percentage >= 75)
                grade = 'B';
            else if (percentage >= 50)
                grade = 'C';
            else
                grade = 'F';

            System.out.println("Percentage = " + percentage);
            System.out.println("Grade = " + grade);
        }

      
    }
}