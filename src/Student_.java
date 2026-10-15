public class Student_ {
    String studentName ;
    String studentNumber;
    int[] Marks;
    double avg;


    public Student_(String studentName, String studentNumber, int [] Marks){
        this.studentName = studentName;
        this.studentNumber = studentNumber;
        this.Marks = Marks;
       avg = 0;
    }
    public double Average(){

        double sum = 0;
        double average = 0;
        for (int i = 0; i < this.Marks.length; i++)
        {
            sum += this.Marks[i];
        }

        return average = sum / Marks.length;
    }


    public void setAvg (double avg)
    {
        this.avg = avg;
    }


    public String hasPassed(){

        String passed = " and student failed";

        if (this.avg >= 50)
            passed = " and student passed" ;


        return  passed;
    }


    @Override
    public String toString() {
       return "Student name : " + studentName + " Avg " + avg ;
    }
}
//Student results system
//Create a Student class with student number, name, and an array of three marks.
//Add methods to calculate the average, determine whether the student passed (average at least 50), and display a summary.
//In a separate main class, create at least three student objects, display their averages and results, count how many passed, and identify the student with the highest average.
//Validation: Marks must be between 0 and 100.