public class Student {

    String studentName ;
    String studentNumber;
    double studentMark;

    //Constructor
    public StudentInfo(String StudentName,String StudentNumber,double StudentMark){
        studentName = StudentName;
        studentNumber = StudentNumber;
        studentMark = StudentMark;
    }
    static void displayDetails()
    {
        StudentInfo studentDetails = new StudentInfo("Ditebogo","221393439",33);

        System.out.println("The student name is:" + studentDetails.Name);
        System.out.println("The students student number is:" + studentDetails.studentNumber);
        System.out.println("The students mark is:" + studentDetails.Mark);
    }
    static void hasPassed(){
        Student student = new Student();

        if (student.Mark >= 50)
        {
            System.out.println("You have passed");
        }
    }
}
//Create a Student class with name (String), studentNumber (String), and mark (double).
//Add a constructor, displayDetails(), and hasPassed() which returns true when the mark is at least 50.
//
//In StudentApp, create at least two Student objects and call their methods.
