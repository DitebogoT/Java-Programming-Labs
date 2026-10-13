import java.util.ArrayList;
public class StudentMarks {

    static void printMarks(){
        int[] studentMarks = {78, 62, 44, 81, 90};
        int sum = 0;
        double average;

        for (int i = 0; i < studentMarks.length; i++) {
            sum += studentMarks[i];
            System.out.println(studentMarks[i]);

        }
        average = sum / studentMarks.length;
        System.out.println("The total is: "+ sum);
        System.out.println("The average of the student marks is: " + average);
        System.out.println();

    }
}
//Store student marks
//Create StudentMarks with an integer array of five marks.
//Print each mark using a loop, then calculate and display the total and average.