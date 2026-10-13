import java.util.ArrayList;
public class StudentMarks {

    static void printMarks(){
        int[] studentMarks = {78, 62, 44, 81, 90};

        for (int i = 0; i < studentMarks.length; i++) {
            System.out.println(studentMarks[i]);
            System.out.println();
        }
    }
}
//Store student marks
//Create StudentMarks with an integer array of five marks.
//Print each mark using a loop, then calculate and display the total and average.